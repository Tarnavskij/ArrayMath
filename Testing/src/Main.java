import java.util.Random;

public class Main {
    public static void main(String[] args) {

        double sumMas1 = 0, sumMas2 = 0;
        int array1 [] = new int[5];
        int array2 [] = new int[5];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random()*6);
            System.out.print("[" + array1[i] + "] ");
        }

        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random()*6);
            System.out.print("[" + array2[i] + "] ");
        }

        for (int i = 0; i < array1.length; i++) {
            sumMas1 = sumMas1 + array1[i];
        }
        sumMas1 = sumMas1 / array1.length;

        for (int i = 0; i < array2.length; i++) {
            sumMas2 = sumMas2 + array2[i];
        }
        sumMas2 = sumMas2 / array2.length;

        System.out.println("\n" + sumMas1);
        System.out.println(sumMas2);

        if (sumMas1 < sumMas2){
            System.out.println(sumMas2 + " biggest value");
        }else if (sumMas2 < sumMas1){
            System.out.println(sumMas1 + " biggest value");
        }else {
            System.out.println(sumMas1 + " and " + sumMas2 + " are equal");
        }
    }
}

