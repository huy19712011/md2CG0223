package org.example.loops;

public class Part2Loops {

    public static void main(String[] args) {

        System.out.println("Loops");

        // for 1..100 if isPrime => print
        for (int i = 1; i <= 100; ++i) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    private static boolean isPrime(int number) {
        // 1 => return false
        if (number == 1)
            return false;
        // for 2..n/2 if number % i == 0 => return false
        for (int i = 2; i <= number/2; ++i){
            if (number % i == 0)
                return false;
        }
        // otherwise
        return true;
    }
}
