import java.util.Arrays;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] mass = new int[15];

        int count = 0;

        for(int i=0; i < mass.length; i++) {
            mass[i] = random.nextInt(100);

            if (mass[i] != 0 &&  mass[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println(Arrays.toString((mass)));
        System.out.println("В масиве четных чисел: " + count);
    }
}
