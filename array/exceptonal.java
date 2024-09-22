import java.util.Scanner;
public class exceptonal {

    public static void main(String[]args) throws Exception
{
    // System.out.println("tareq ahmed");
    int [][] number={ { 1, 9, 4 }, { 0, 2}, { 0, 1, 2, 3, 4 } };
    int sum=0;

    for(int row=0;row<number.length;row++)
    {
        System.out.printf("Row" + row + ":");
        for(int x=0;x<number[row].length;x++)

        {
            System.out.printf(" " + number[row][x] + " ");
                sum+=number[row][x];
        }
        System.out.println();
    }

System.out.printf("the sum of the arrays elements is :%d %n",sum);
}
}
