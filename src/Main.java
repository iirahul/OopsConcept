//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args){
        PolymorphismtMethodOverloading pl = new PolymorphismtMethodOverloading();
        pl.show();
        pl.show(1);
        pl.show(99.1);
        PolymorphismMethodOverriding ol =new PolymorphismMethodOverriding();
        ol.show();
        PolymorphismtMethodOverloading ola = new PolymorphismtMethodOverloading();
        ola.show();
        Swift cr = new Swift();
        cr.show();
        AbstractClass ab = new Swift();
        AbstractClass bc = new Thar();
        ab.motor();
        ab.shape();
        bc.shape();
        bc.motor();
        Interface h = new House();
        h.size();
        h.shape();
        Calculations cl= new Circle(5);
        System.out.println("Area is "+cl.area());
        System.out.println("Perimeter is "+cl.perimeter());
        Gola sh = new Gola();
        sh.getRadius(5);
        System.out.println("Area = "+sh.area());
        System.out.println("Peeri = "+sh.perimeter());







    }



    }
