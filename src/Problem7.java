public class Problem7 {

    static public void problem7() {
        //10001st prime
        //Problem 7
        //By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
        //
        //What is the 10 001st prime number?

        int count = 0;
        boolean stopSearching = false;
        int number = 2;

        while (!stopSearching) {
            if (isPrime(number)) {
                count++;
                if (count == 10001) {
                    stopSearching = true;
                } else {
                    number++;
                }
            } else {
                number++;
            }

        }

        System.out.print(number);
    }

    private static boolean isPrime(int number) {
        int divisors = 0;
        int it = 1;
        while (divisors <=2 && it<=number) {
            if (number%it == 0) {
                divisors++;
            }
            it++;
        }
        return divisors == 2;

    }

}
