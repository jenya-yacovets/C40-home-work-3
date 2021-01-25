import java.util.Arrays;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] mass = new int[20];

        for(int i=0; i < mass.length; i++) {
            mass[i] = random.nextInt(21);
        }

        System.out.println(Arrays.toString((mass)));

        for(int i=1; i < mass.length; i++) {
            if (i % 2 != 0) {
                mass[i] = 0;
            }
        }

        System.out.println(Arrays.toString((mass)));
    }
}
