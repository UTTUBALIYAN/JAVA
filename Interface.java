
interface  A{

    int age=4;
    String s="Utkarsh";
    void method1();
    void method2();
}

// Note :- Variables inside the interface are by default final and static  it means we have to initialize them 
// Imp :- In abstract class we can only extend one class but in interface we can implement more than one interface
// Class - class extends
// class - interface implements
// interface - interface extends

interface  X{
    void Run();
}
interface Y extends X{

}
class B implements   A,Y{
public void method1()
{
    System.out.println("inside method1");
}

public void method2()
{
    System.out.println("inside method2");
}
public void Run()
{
    System.out.println("Bhagooo bc ");
}
}

public class Interface{
    public static void main(String args[])
    {
        B obj;
        obj=new B();
        obj.method1();
        obj.method2();
        System.out.println(B.age);
        obj.Run();

        
    }
}