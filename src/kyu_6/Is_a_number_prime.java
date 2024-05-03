package kyu_6;

// https://www.codewars.com/kata/5262119038c0985a5b00029f/train/java

public class Is_a_number_prime {

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(73));
        System.out.println(isPrime(-1));
        System.out.println(isPrime(75));
    }
}
