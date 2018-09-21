public class Problem1 {

    static public void problem1() {
        //Multiples of 3 and 5
        int sum = 0;

        for (int i=0; i<1000; i++){
            if (i%3==0 || i%5==0){
                sum+=i;
            }
        }

        System.out.println("sum"+sum);
    }
}
