
import java.util.Scanner;

class Excep{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter the values of i  and j");
        i=sc.nextInt();
        j=sc.nextInt();
         int[] nums = {2, 4, 5, 5, 6};

        try {
            if((j/i)==0)
            throw new ArithmeticException(); // Create you own Exception
            System.out.println(j/i);
            System.out.println(nums[5]);
            
        } catch (Exception e) {
            if(e instanceof ArithmeticException)
            System.err.println("Some problem with the mathematical cal");
            else if(e instanceof NullPointerException)
            {
                System.err.println("Pointing to NULL");
            }
            else if(e instanceof  ArrayIndexOutOfBoundsException)
            {
                System.err.println("you are using index which is out of bound ");
            }
            else
            {
                System.err.println("kuch aur dikkt hai");
            }
        }

        System.out.println("Byyerbf");
    }
}