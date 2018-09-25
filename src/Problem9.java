

public class Problem9 {

    static public void problem9() {
        //Special Pythagorean triplet
        //Problem 9
        //A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
        //
        //a2 + b2 = c2
        //For example, 32 + 42 = 9 + 16 = 25 = 52.
        //
        //There exists exactly one Pythagorean triplet for which a + b + c = 1000.
        //Find the product abc.

        for (int c = 0; c<1000; c++) {
            for (int b = 0; b<c; b++) {
                for (int a = 0; a<b; a++) {
                    if (a+b+c ==1000 && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                        System.out.println(a*b*c);
                        System.out.print(a + " - " + b + " - " + c);
                    }
                }
            }
        }
    }

}
