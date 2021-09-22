import java.util.Scanner;

public class Prog10{

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
            for (int j = 0; j < B; j++){
                if (j>0) {
                    array[i][j]=array[i][j-1]+A;
                }else{
                    array[i][j]=i+1;
                }


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