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
        ThisDemo td = new ThisDemo();
        ThisKeyword rr = new ThisKeyword();
        ThisKeyword th = new ThisKeyword(rr);


        td.display(th);
        MyClass mc = new MyClass();
        mc.setValue(2);
        System.out.println("this is value "+ mc.setValue(2));
        StaticKeyWord st =new StaticKeyWord(1,"Rahul");
        st.display();
        StaticKeyWord st1 =new StaticKeyWord(2,"Shiva");
        st1.display();

        StaticCount sc1 = new StaticCount();
        StaticCount sc2 = new StaticCount();
        StaticCount sc3 = new StaticCount();
        sc1.printValueOfRollNo();
        sc2.printValueOfRollNo();
        sc3.printValueOfRollNo();









    }



    }
