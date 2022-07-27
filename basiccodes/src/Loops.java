import java.util.*;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 17;
        boolean isprime = true;
        int i = 2;
        do {
            if (num % i == 0)
                isprime = false;
            i++;
        } while (i < num);

        /*
         * int i =2;
         * while(i<num){
         * 
         * if (num%i == 0 )
         * isprime = false;
         * i++;
         * }
         * 
         */

        /*
         * for (int i = 2; i <num; i++){
         * 
         * if (num%i == 0 )
         * isprime = false;
         * 
         * }
         * 
         */

        if (isprime == false)
            System.out.println("not prime");
        else
            System.out.println("prime");

        sc.close();
    }

}
