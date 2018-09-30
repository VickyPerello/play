import java.math.BigInteger;

public class Problem15 {

    static public void problem15() {
        //Lattice paths
        //Problem 15
        //Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
        //
        //
        //How many such routes are there through a 20×20 grid?

        //uso permutacion
        BigInteger result = factorial(new BigInteger("40")).divide(factorial(new BigInteger("20")).multiply(factorial(new BigInteger("20"))));
        System.out.print(result);

        //2x2
        //20x20
        //tengo que ir a la derecha 20 veces e ir abajo 20 veces, no me importa el orden y
        //DDDDDDDDDDAAAAAAAAAA
        //AAAAAAAAAADDDDDDDDDD
        //tengo 40 espacios y 20 letras de cada una -> permutacion 40!/20!20!
    }

    static BigInteger factorial(BigInteger number) {
        if (number.compareTo(new BigInteger("1")) > 0) {
            return number.multiply(factorial(number.subtract(new BigInteger("1"))));
        } else {
            return number;
        }

    }
}
