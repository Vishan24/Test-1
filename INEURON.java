public class INEURON {
    public static void main(String[] args) {
        int n=5,i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==0|| i==n-1 || j==(n-1)/2)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        for( i=0;i<n;i++){
            for(j=0; j<n;j++){
                if(i==0&&i>n||j==0||j==n-1 || i==j)
                    System.out.print("*");
                
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        for( i=0;i<n;i++)
        {
            for(j=0;j<n;j++){
                if(i==0 || j==0|| i==(n-1)/2 || i==n-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(j==0 || j==n-1|| i==n-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==0 ||i==1|| j==0 || i-j>=0)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==0 && i<n-1 && j!=0 && j!=n-1 || i==n-1 &&  j!=0 && j!=n-1|| j==0 && i!=0 && i!=n-1 || j==n-1 && i!=0 && i!=n-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j || i==0 && i<0 || j==0 || j==n-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}

	              