interface Vehicle{
    void drive();
}

class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Car drive");
    }
}

class Truck implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Truck drive");
    }
}

public class Driver{
    public static void main(String args[]){
        Truck tr = new Truck();
        Car cr = new Car();
        
        tr.drive();
        cr.drive();
    }
}