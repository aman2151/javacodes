import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers");

        float a = sc.nextFloat(), b = sc.nextFloat();
        
        System.out.println("Enter operator from /,*,+,-");
        String operator = sc.next();
        
        switch(operator){
            case "*": 
            System.out.println(a*b);
            break;
            case "/": 
            System.out.println(a/b);
            break;
            case "+": 
            System.out.println(a+b);
            break;
            case "-": 
            System.out.println(a-b);
            break;

            default :
            System.out.println("Choose between above mentioned operator");
        }



        sc.close();

    }
}
