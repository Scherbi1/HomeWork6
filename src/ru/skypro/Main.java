package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = generateRandomArray();

      //  for (int i = 0; i < arr.length; i++) {

            ///System.out.print(arr[i]+" ");
        //}
        System.out.println(" ");
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
           sum=sum+arr[i];
        }

        //System.out.println("сумма трат за месяц составила - " + sum + "руб");
        float srd=0f;
        srd=sum/arr.length;
       // System.out.println("cредняя сумма трат за день составила - " + srd + "руб");
        System.out.println(" ");
        int min=999999999;
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }
            if (arr[i]>max) {
                max=arr[i];
            }

        }

        System.out.println("сумма трат за месяц составила - " + sum + "руб");
        System.out.println("cредняя сумма трат за день составила - " + srd + "руб");
        System.out.println("минимальная сумма трат за день составила - " + min + "руб");
        System.out.println("максимальная сумма трат за день составила - " + max + "руб");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            if (i%10==0){
                System.out.println();
                System.out.print(arr[i]+ " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(" Я вывел массив в таком виде, чтобы все числа были перед глазами и не надо было листать. Для удобства");
        return arr;
    }
}
