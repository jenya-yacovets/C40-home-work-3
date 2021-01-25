import java.util.Arrays;
import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] mass = new int[12];

        int maxValue = 0;
        int maxIndex = 0;

        for (int i=0; i<mass.length; i++) {
            mass[i] = random.nextInt(16);

            if (mass[i] > maxValue) {
                maxValue = mass[i];
                maxIndex = i;
            }
        }

        System.out.println(Arrays.toString(mass));
        System.out.println("Максимальное значение в масиве: " + maxValue + "\nИндекс элемента в масиве: " + maxIndex);
    }
}
