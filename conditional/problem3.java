



// 3. Write a program to check whether a number is even or odd.

import java.util.Scanner;
public class problem3 {
    public static void main(String[]args) throws Exception{
        Scanner evenInput=new Scanner(System.in);
        System.out.println("enter number");
        int number=evenInput.nextInt();
        if(number%2==0)
        {
            System.out.println("this is even number "+number);

        }
        else{
            System.out.println("odd number");
        }
    }


    
}
