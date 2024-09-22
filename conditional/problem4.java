
// 4. Write a program to check whether a year is leap year or not.
import java.util.Scanner;
public class problem4 {
    public static void main(String [] args) throws Exception

    {
        Scanner leapInput=new Scanner(System.in);
        System.out.println("enter year");
        int year=leapInput.nextInt();
        if ((year%4 == 0 && year % 100 != 0) || (year%400 == 0)) {
            System.out.println("this is leap year"+year);

            
        }
        else
        {
            System.out.println("this is not a leap year"+year);

        }
    }
    
}
