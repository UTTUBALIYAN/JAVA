// Inner Class
class Outer{
    public void show()
    {
       System.out.println("Inside show");
    }

    class InsideOuter{
        public void show()
        {
            System.out.println("Inside Outer class");
        }
    }
}
public class Inner{
    public static void main(String[] args) {
        Outer obj=new Outer();

        obj.show();
        Outer.InsideOuter obj1=  obj.new InsideOuter();
        obj1.show();
        
    }
}