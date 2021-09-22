import java.util.Scanner;

public class Prog7{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Введите размер массива:");
        size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Введите массив:");
        for (int i=0;i<size;i++)
        {
            array[i] =scanner.nextInt();
        }
        System.out.print("Введенный массив:");
        for (int i=0;i<size;i++)
        {

            System.out.print(array[i]+" ");
        }
    }
}