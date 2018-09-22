import java.util.ArrayList;
import java.util.List;

public class Problem4 {

    static public void problem4() {
        //Largest palindrome product
        //Problem 4
        //A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
        //
        //Find the largest palindrome made from the product of two 3-digit numbers.

        long max = 0;

        for (int i=999; i>99; i--) {
            if (max < i*999) {
                for (int j=999; j>99; j--) {
                    long product = i*j;
                    String productString = Long.toString(product);
                    if (isPalindromicNumber(productString) && product > max) {
                        max = product;
                    }

                }
            }
        }

        System.out.print(max);


    }

    static boolean isPalindromicNumber(String number) {
        for (int i=0; i<number.length()/2; i++) {
            if (number.charAt(i) != number.charAt(number.length()-1-i)) {
                return false;
            }
        }
        return true;

    }

}
