// 3. Write a program to count total number of negative elements in an array.
import java.util.Scanner;

public class problem3 {

    



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
    int negative=0;
    for(int num:array)
    { if(num<0)
        {
            negative++;
        }
          
    }
    System.out.println("the negative number on this array that is "+negative);
    }
   
}



    

