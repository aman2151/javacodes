public class ButterflyPattern {
    public static void main(String[] args) {
        int row = 4;

        for (int i=1; i <= 4; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for (int k=1; k<=2*(row-i); k++){
                System.out.print("  ");
            }            
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }                   

            System.out.println();
        }

        for (int i=row; i >=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for (int k=1; k<=2*(row-i); k++){
                System.out.print("  ");
            }            
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }                   

            System.out.println();
        }
    }
}
