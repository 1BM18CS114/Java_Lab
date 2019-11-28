import java.util.*;
import java.lang.*;

class WrongAge extends Exception{
    String msg;

    WrongAge(String msg){
        this.msg = msg;
    }

    public String toString(){
        return msg;
    }
}
class Father{
    int f_age;
    Father(){}

    Father(int a) throws WrongAge{
        if(a < 0){
            throw new WrongAge("Age is below 0");
        }
        else{
            f_age = a;
        }
    }
}

class Son extends Father{
    int s_age;

    Son(int a, int b) throws WrongAge{
        if(a <= b){
            throw new WrongAge("Father is younger than Son");
        }
        else if(a < 0 || b < 0){
            throw new WrongAge("Negative age Entered");
        }
        else{
            f_age = a;
            s_age = b;
        }
    }
}

class Main{
    public static void main(String[] args){
        try{
            Son s = new Son(20, -110);
            Father f = new Father(200);
        }catch(WrongAge e){
            System.out.println(e);
        }
        System.out.println("Program Over");
    }
}