public class Gola implements Shape{
    private int radius;
    public void getRadius(int radius){
        this.radius =radius;
    }

    public double area(){
        return Math.PI*radius*radius;


    }
    public double perimeter(){
        return  2*Math.PI*radius;


    }
}
