import java.util.ArrayList;
import java.util.List;

public class Problem10 {

    static public void problem10() {
        //Summation of primes
        //Problem 10
        //The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
        //
        //Find the sum of all the primes below two million.

        long acum = 2;
        List<Integer> primes = new ArrayList<>();
        primes.add(2);

        for(int i=3; i<2000000; i+=2) {
            if (isPrime(i, primes)) {
                primes.add(i);
                acum +=i;
            }
        }

        System.out.print(acum);

    }

    private static boolean isPrime(int number, List<Integer> primes) {
        boolean prime = true;
        int it = 0;
        while (it < primes.size() && prime) {
            if (number%primes.get(it) == 0) {
                prime = false;
            }
            it++;
        }
        return prime;

    }

}
