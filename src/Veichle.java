public class Veichle {
    public Veichle(){
        System.out.println("Driving a Veichle");
    }
    public void show(){
        System.out.println("this is superclass");
    }
}

 class Car extends Veichle{
    public Car(){
        super(); //can not place anywhere else aprt from first line
        System.out.println("Drving a Car");
    }
    public void show(){
        super.show();
        System.out.println("This is subclass");
    }
}
