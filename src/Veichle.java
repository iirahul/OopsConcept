public class Veichle {
    public Veichle(int a){
        System.out.println("Driving a Veichle");
    }
    public void show(){
        System.out.println("this is superclass");
    }
}

 class Car extends Veichle{
    public Car(){
        super(10);
        System.out.println("Drving a Car");
    }
    public void show(){
        super.show();
        System.out.println("This is subclass");
    }
}
