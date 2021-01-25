import java.util.Arrays;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] mass = new int[4];

        for (int i=0; i<mass.length; i++) {
            mass[i] = random.nextInt(11);
        }

        System.out.println(Arrays.toString(mass));

        boolean res = true;

        for (int i=1; i<mass.length; i++) {

            if (mass[i-1] > mass[i]) {
                res = false;
                break;
            }
        }

        if (res) {
            System.out.println("Данный масив с строго возрастающей последовательностью");
        } else {
            System.out.println("Данный масив не с строго возрастающей последовательностью");
        }
    }
}
