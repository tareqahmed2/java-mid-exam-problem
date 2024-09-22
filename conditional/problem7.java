// 7. Write a program to count total number of notes in given amount.
import java.util.Scanner;
public class problem7 {
public static void main(String[] args) throws Exception    

{

    Scanner noteInput=new Scanner(System.in);
    System.out.println("enter the amoutn what you earned");
    int amount=noteInput.nextInt();
    int count1000=amount/1000;
     amount=amount%1000;
    int count500=amount/500;
     amount=amount%500;
    int count200=amount/200;
     amount=amount%200;

          System.out.println("the note of 1000 is ="+count1000);
          System.out.println("the note of 500 is ="+count500);
          System.out.println("the note of 200 is ="+count200);
     
    }
      
}
