interface SAFE_DRIVING{
    double Safe_Speed = 60.0;

    void speed_of_the_vehicle(double a);
}

class drive implements SAFE_DRIVING{

    public void speed_of_the_vehicle(double a){
        if(a < Safe_Speed)
            System.out.println("Safe Driving");
        else 
            System.out.println("Drive Slow");
    }
}

class Main{
    public static void main(String[] args) {
        drive obj = new drive();

        obj.speed_of_the_vehicle(509);
    }
}