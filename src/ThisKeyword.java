public class ThisKeyword {

    public ThisKeyword(){
        //this(new ThisKeyword());
        System.out.println("Inside Thiskeyword constructor");

    }
    public ThisKeyword(ThisKeyword yy){
        this();
        this.show();
        System.out.println("Inside Thiskeyword parameter constructor");

    }

    void show(){

        System.out.println("Inside This demo show  method");
    }
}

class ThisDemo{
    void display(ThisKeyword tk){
        System.out.println("inside thisDemo class display method");
    }

}
 class MyClass {
    private int value;

    public MyClass setValue(int value) {
        this.value = value;
        return this; // Returns the current object
    }
}