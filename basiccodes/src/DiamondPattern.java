public class DiamondPattern {
    public static void main(String[] args) {
        int row = 4;

        for (int i=row; i>=1;i--){
            for (int j=1; j<i;j++){
                System.out.println(" ");
            }
            for (int j=1;j<=row-i;j++){
                System.out.println("*");
            }
        }
    }
}
