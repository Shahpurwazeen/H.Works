package review4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // When we do not know how many times we need to repeat a block of code
        // while or do while


        int a=1;
        while(a<3) {
            System.out.println("I am while loop");
            a++;

        }

        int b=1;
                do{
                    System.out.println("do while");
                    b++;
                }while(b>=3);

                // example:- Ask students if they understand loops?
        // if the don't --> tell them to practice more on loops
        // if the understanding --> you good move to array concept

        Scanner Scan=new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in Java");
            answer = Scan.nextLine();
        } while(!answer.equalsIgnoreCase("Yes"));
        System.out.println("Great Jobs, let's learn Arrays now");

    }
}


