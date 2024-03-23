public interface Interface {
    void shape();
    void size();
}

 class House implements Interface {
    public void shape(){
        System.out.println("this is shape of house");

    }
    @Override
    public void  size(){
        System.out.println("this is size of house");

    }
}