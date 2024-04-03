public class StaticCount {
    static int rollNo = 0;
   public StaticCount(){
       this.rollNo++;
       System.out.println(this.rollNo);
    }
    public void printValueOfRollNo(){
        System.out.println("this.roll is "+this.rollNo);
    }
}
