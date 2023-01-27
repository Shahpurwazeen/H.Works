package review5;

public class Task8 {
    public static void main(String[] args) {
        // write a java program to print the first 10 numbers of Fibonacci series

        int a=0;
        int b=1;
        int c;

        for (int i = 1; i <10 ; i++) {
            c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;


        }
    }
}
