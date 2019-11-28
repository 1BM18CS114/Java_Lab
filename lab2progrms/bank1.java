import java.util.*;
import java.lang.*;

class insuff extends Exception{
    double num;

    insuff(double num){
        this.num = num;
    }

    public String toString(){
        return "Insufficient Balance";
    }
}

class Bank{
    String acno, name;
    double balance;

    void deposit(double amt){
        balance += amt;
    }

    void withdraw(double amt) throws insuff{
        if(balance - amt < 2000){
            throw new insuff(balance - amt);
        }
        else{
            balance -= amt;
        }
    }
}

class Main{
    public static void main(String[] args) {
        Bank a = new Bank();
        
        a.deposit(10000);
        try{
            a.withdraw(1000);
        }catch(insuff e){
            System.out.println(e);
        }
        System.out.println("Transacton over");
    }
}

