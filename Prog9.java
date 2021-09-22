import java.util.Scanner;

public class Prog9{

    public static void main(String[] args){
        int Sum=0;
        for(String arg :args){
            int var =Integer.parseInt(arg);
            Sum=Sum+var;
        }
        System.out.println(Sum);
    }
}