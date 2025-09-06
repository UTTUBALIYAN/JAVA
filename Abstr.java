abstract class Car{
    public abstract  void Drive();


    public void Music(){
        System.out.println("PLaying music...");
    }
}
class WagonR extends Car{ // Concreter class 
    public void Drive()
    {
        System.out.println("Driving a car");
    }
}
public class Abstr{
    public static void main(String[] args) {
        // Car obj=new Car();// We cannot make an object of an Abstract class , and if you extend that class then you need 
                            //to define the method which you made abstract in parent class

    WagonR obj=new WagonR();
    obj.Drive();
    obj.Music();
    }
}