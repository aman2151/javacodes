import java.util.*;

public class Input {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age");
        int age = sc.nextInt();

        if (age < 20 && age > 12){
            System.out.println("Person is teenager");
        } else if ( age <12 ) {
            System.out.println("Person is a child");
        }
        else{
            System.out.println("person is adult");
        }
        // System.out.println(age);
        sc.close();
        
    }
    
}
