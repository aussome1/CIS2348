import java.util.Random;
public class Arrays {
    public static void main(String[] args) {
        //int[] numbers;
        //numbers = new int[4];

        //System.out.println(numbers.length);
        //numbers[0] = 0;
       // numbers[1] = 1;
        //numbers[2] = 2;

        //int size = numbers.length;

        //for(int i = 0; i < size; i++) {
        //    System.out.println(numbers[i]);
        //}

        String[] myStrArray = new String[3];

        myStrArray[0] = new String("Hello");
        myStrArray[1] = new String("Hi");
        myStrArray[2] = "hj";

        for (int i = 0; i < myStrArray.length; i++) {
            //print content of String array
            System.out.println(myStrArray[i]);
        }
        //this does not copy an array
        //String[] my2ndStrArray = myStrArray;

        String[] my2ndStrArray = new String[3];
        for (int i = 0; i < my2ndStrArray.length; i++) {
            my2ndStrArray[i] = myStrArray[i];
        }
        my2ndStrArray[2] = "Guten Morgen";

        for (int i = 0; i < my2ndStrArray.length; i++) {
            System.out.println(myStrArray[i]);
            System.out.println(my2ndStrArray[i]);

        }

        //two dimensional array
        int[][] scores = new int[3][4];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                Random random = new Random();
                scores[row][col] = random.nextInt();
                System.out.print(scores[row][col] + " ");
            }

        }

    }
}
