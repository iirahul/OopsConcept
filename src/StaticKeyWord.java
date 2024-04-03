public class StaticKeyWord {
    int empId;
    String name;
    static String company= "Wipro";
    public StaticKeyWord(int empId ,String name)
    {
        this.empId=empId;
        this.name=name;
    }
    public void display(){
        System.out.println("Name of Employee " +this.name + " Employee ID"+this.empId +" Company name "+this.company);
    }
}
