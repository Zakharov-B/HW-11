import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("task 1");

        int[] inputArray1 = {10000, 25000, 15000, 30000, 20000};
        float[] outputArray1 = new float[4];
        int sum1 = 0;
        int max1 = inputArray1[0];
        int min1 = inputArray1[0];
        for (int payout : inputArray1) {
            sum1 += payout;
            if (payout > max1) {
                max1 = payout;
            }
            if (payout < min1) {
                min1 = payout;
            }
        }
        float average1 = (float) sum1 / inputArray1.length;
        outputArray1[0] = sum1;
        outputArray1[1] = max1;
        outputArray1[2] = min1;
        outputArray1[3] = average1;
        System.out.println("inputArray1: " + Arrays.toString(inputArray1));
        System.out.println("outputArray1: " + Arrays.toString(outputArray1));

        //Task 2
        System.out.println("task 2");
        int[] inputArray2 = {50000, 60000, 75000, 40000, 80000};
        float[] outputArray2 = new float[5];
        int index2 = 0;
        for (int salary : inputArray2) {
            outputArray2[index2] = salary * 0.13f;
            index2++;
        }
        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.println("outputArray2: " + Arrays.toString(outputArray2));

        //Task 3
        System.out.println("task 3");
        int[] inputArray3 = {4000, 6000, 5000, 7500, 3000};
        boolean[] outputArray3 = new boolean[5];
        int index3 = 0;
        for (int bonus : inputArray3) {
            outputArray3[index3] = bonus > 5000;
            index3++;
        }
        System.out.println("inputArray3: " + Arrays.toString(inputArray3));
        System.out.println("outputArray3: " + Arrays.toString(outputArray3));

        //Task 4
        System.out.println("task 4");
        int[] inputArray4 = {100, 200, 50, 300, 150};
        boolean[] outputArray4 = new boolean[1];
        boolean allPositive = true;
        for (int balance : inputArray4) {
            if (balance < 0) {
                allPositive = false;
                break;
            }
        }
        outputArray4[0] = allPositive;
        System.out.println("inputArray4: " + Arrays.toString(inputArray4));
        System.out.println("outputArray4: " + Arrays.toString(outputArray4));

        //Task 5
        System.out.println("task 5");
        int[] inputArray5 = {-10000, 25000, 15000, -5000, 40000};
        int[] outputArray5 = new int[1];
        int profitableMonths = 0;
        for (int profit : inputArray5) {
            if (profit > 0) {
                profitableMonths++;
            }
        }
        outputArray5[0] = profitableMonths;
        System.out.println("inputArray5: " + Arrays.toString(inputArray5));
        System.out.println("outputArray5: " + Arrays.toString(outputArray5));


    }
}