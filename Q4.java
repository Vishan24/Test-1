public class Q4 {
    public static void main(String[] args) {
        int n = 8, m = 14;
        for (int i = 0; i < n; i++) {
            // for (int j = 0; j < m; j++) {

            //     System.out.print(" * ");

            // }
            // System.out.println();
            for (int j = 0; j < m; j++) {
                if(i==n-1 || i==n-2 || i==0 && j==0 || j==m-1||j==0 || i>=j|| j+i ==m-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

}
