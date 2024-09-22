

// 4. Write a program to copy all elements from an array to another array.
import java.util.Scanner;

public class problem4 {

    



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
    int[] secondArray=new int[size];
    int index=0;
    for(int num:array)
    { secondArray[index]=num;
        index++;
          
    }
    for(int num:secondArray)
    {
          System.out.println("copy"+num+" ");
    }
    }
   
}



    

