// 1. Write a program to find second largest element in an array.
import java.util.Scanner;
public class problem1 {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int size;
     System.out.println("enter array size:");   
     size=input.nextInt();
     System.out.println("enter the values");
     int[] array=new int[size];
     for(int i=0;i<size;i++)
     {
        array[i]=input.nextInt();
     }
     int largest=Integer.MIN_VALUE;
     int secondLargest=Integer.MIN_VALUE;
     for(int num:array)
     {
        if(num>largest)
        {
            secondLargest=largest;
            largest=num;
        }
        else if(num>secondLargest && num!=largest)
        {
            secondLargest=num;
        }
     }
     if(secondLargest==Integer.MIN_VALUE)
     {
        System.out.println("there is no second elements");
     }
     else{
        System.out.println("the second largest element that is "+secondLargest);
     }
    }
   
}
