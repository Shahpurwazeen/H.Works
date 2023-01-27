package review5;

public class ArrayReview {
    public static void main(String[] args) {

        int a=10;

        int [] arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        //System.out.println(arr[3]); Runtime error
        System.out.println("Size of the array ="+arr.length);

        // How to get all value from the array?
        // arr[0];   arr[1];  arr[2]

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }

        for (int num:arr) {
            System.out.println(num);

        }

        String [] colors={"black","White","red","purple","blue"};
        // anytime we have arrays we can use enhanced for loop

        for(String color:colors){
            System.out.println(color+" ");

        }

        for (int i = 0; i < colors.length ; i++) {
            System.out.println(colors[i]+" ");

        }

        System.out.println("_____________How to print Reverse_____?");

        for(int i=colors.length-1; i>=0; i--){

            System.out.println(colors[i]+"; ");

        }


    }
}
