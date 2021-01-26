import java.util.Arrays;
import java.util.Random;

public class Task_5 {
    public static void main(String[] args) {
        Random random = new Random();

        float[] mass_a = new float[10];
        float[] mass_b = new float[10];
        float[] mass_c = new float[10];

        int count = 0;

        for (int i=0; i<mass_a.length; i++) {
            mass_a[i] = random.nextInt(10);
            mass_b[i] = random.nextInt(10);

            // заменяем бесконечность и NaN на 0, который будем считать как четное
            if (mass_b[i] != 0) {
                mass_c[i] = mass_a[i] / mass_b[i];
            } else {
                mass_c[i] = 0;
            }

            if (mass_c[i] % 1 == 0) {
                count++;
            }
        }

        System.out.println(Arrays.toString(mass_a));
        System.out.println(Arrays.toString(mass_b));
        System.out.println(Arrays.toString(mass_c));

        System.out.println("В 3-м масиве целых чисел: " + count);
    }
}
