class A{
    public void show()
    {
        System.out.println("Inisde show ");
    }
}
public class Anony{
    public static void main(String[] args) {
        A obj=new A(){
            public void show()
            {
                System.out.println("Inside new show"); // Anonymous Class 
            }
        };
        obj.show();
    }
}