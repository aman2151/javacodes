public class DiamondPattern {
    public static void main(String[] args) {
        int row = 4;

        for (int i=1; i<=row;i++){
            for (int j=1; j<=row-i;j++){
                System.out.print("-");
            }
            for (int j=1;j<row-i;j++){
                if (j%2==1)
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
