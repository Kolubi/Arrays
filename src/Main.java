import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            int x = rnd.nextInt(10);
            array[i] =x;
            if(x % 2 == 0){
                System.out.print( x + " ");
            }
        }
    }
}