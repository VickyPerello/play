public class Problem14 {

    static public void problem14() {
        //Longest Collatz sequence
        //Problem 14
        //The following iterative sequence is defined for the set of positive integers:
        //
        //n → n/2 (n is even)
        //n → 3n + 1 (n is odd)
        //
        //Using the rule above and starting with 13, we generate the following sequence:
        //
        //13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
        //It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
        //
        //Which starting number, under one million, produces the longest chain?
        //
        //NOTE: Once the chain starts the terms are allowed to go above one million.

        long n = 2;
        long maxSequence = 1;
        long number = 1;

        while (n < 1000000) {
            long sequenceQuantity = getSequenceQuantity(n);

            if (sequenceQuantity > maxSequence) {
                maxSequence = sequenceQuantity;
                number = n;
            }
            n++;
        }

        System.out.println(number);
        System.out.println(maxSequence);
    }

    static long getSequenceQuantity(long number) {
        long quantity = 1;
        while (number > 1) {
            if (number%2==0){
                number = number/2;
                quantity++;
            } else if(number%2==1){
                number = 3*number+1;
                quantity++;
            } else {
                number = 1;
            }
        }

        return quantity;
    }

}
