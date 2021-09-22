import java.util.Scanner;

public class Prog8{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A;
        int B;
        int size;
        System.out.print("ВВедите размер 1 массива:");
        A = scanner.nextInt();
        System.out.print("ВВедите размер 2 массива:");
        B = scanner.nextInt();
        int[][] array = new int[A][B];
        for (int i=0;i<A;i++){
            System.out.print("Введите двумерный массив ("+i+"):");
            for (int j=0;j<B;j++){
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i=0;i<A;i++){
            System.out.println();
            for (int j=0;j<B;j++){
                System.out.print(array[i][j]+" ");
            }
        }
    }
}