import java.util.ArrayList;
import java.util.List;
public class Problem3 {

    static public void problem3() {
        //Largest prime factor
        //Problem 3
        //The prime factors of 13195 are 5, 7, 13 and 29.
        //
        //What is the largest prime factor of the number 600851475143 ?

        List<Long> primesFactors = new ArrayList<>();
        long number = 600851475143L;
        while (number > 1) {
            boolean hasToContinue = true;
            long divisor = 2;
            while (hasToContinue) {
                if (number%divisor == 0){
                    number = number/divisor;
                    primesFactors.add(divisor);
                    hasToContinue = false;
                } else {
                    divisor++;
                }
            }
        }

        System.out.print(primesFactors.get(primesFactors.size()-1));

    }

}