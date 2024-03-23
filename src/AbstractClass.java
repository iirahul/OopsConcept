public abstract class AbstractClass {
      abstract void motor();
      abstract void shape();
      public void show(){
          System.out.println("This is not abstract method");
      }
}
    class Swift extends AbstractClass{
    public void motor(){
        System.out.println("Swift is motor");
    }
    public void shape(){
        System.out.println("Swift has round shape");
    }

}

    class Thar extends AbstractClass{
        public void motor(){
            System.out.println("Thar is motor");
        }
        public void shape(){
            System.out.println("Thar has Square shape");
        }

    }
