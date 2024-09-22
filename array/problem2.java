// 2. Write a program to count total number of even and odd elements in an
// array.
    import java.util.Scanner;
public class problem2 {
    



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
    int even=0,odd=0;
    for(int num:array)
    { if(num%2==0)
        {
            even++;
        }
           else{
            odd++;
           }
    }
    System.out.println("the even number on this array that is "+even);
    System.out.println("the odd number on this array that is "+odd);
    }
   
}


