import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("Enter array size:");
        size = input.nextInt();
        System.out.println("Enter the values:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        // Bubble Sort algorithm
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
