import java.math.BigInteger;

public class Problem16 {

    static public void problem16() {
        //215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
        //
        //What is the sum of the digits of the number 21000?

        int power = 1000;
        BigInteger result = BigInteger.valueOf(2)
                .pow(power);

        String resultString = result.toString();

        int sumOfDigits = 0;
        for (int i=0; i<resultString.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(resultString.charAt(i)));
            sumOfDigits+=digit;
        }
        System.out.println(sumOfDigits);
    }
}
