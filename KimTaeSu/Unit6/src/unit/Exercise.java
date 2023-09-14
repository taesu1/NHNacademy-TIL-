package unit;

import java.util.Arrays;

public class Exercise {

    //6.1
    public static void smallest(int... input) {
        Arrays.sort(input);
        System.out.println("가장 작은값 : " + input[0]);
    }

    //6.2
    public static void printPositiveNum(int n) {
        if (n < 0) {
            System.out.println(n * -1);
        }
        System.out.println(n);
    }

    //6.3
    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result *= n;
        }

        return result;
    }

    //6.4
    public static void sequence(int... n) {
        int positive = 0;
        int negative = 0;

        for (int i : n) {
            if (i < 0) {
                positive += i;
            } else {
                negative += i;
            }
        }

        System.out.printf("음수 합 : %d 양수 합 : %d", negative, positive);
    }

    //6.5


    //6.7
//    public static int unit(String str, char c) {
//
//    }

    //6.8

    //6.9
    public static void pyramid(int height) {
        for (int i = 1; i < height; i++) {
            System.out.print(i);

            if (i > 1) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    //6.10
    public static void prinfact(int num) {

        for (int i = 1; i <= num; i++) {
            System.out.println(factorial(i));
        }
    }


    //6.11
    public static boolean isPrime(int num) {
        return num % 2 == 0;
    }

    //6.12
    public static void printPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    //6.13
    public static void firstPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    //6.14
    public static void printAllPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }
}


//6.15
//class Message {
//    String sender;
//    String receiver;
//    String messageText;
//
//    public void messageTrim(){
//        this.messageText =  this.messageText.trim().replace(" ", );
//
//    }
//}