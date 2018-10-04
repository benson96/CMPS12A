mport java.util.Scanner;

    class Roots{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            double resolution=0.01;
            double tolerance=0.0000001;
            double threshold=0.001;
            double roots;
            System.out.print("Enter the degree: ");
            int degree =sc.nextInt();
            System.out.print("Enter "+(degree+1)+" coefficients: ");
            double[] C=new double[degree+1];
            for(int i=0; i<C.length;i++){
                    C[i]=sc.nextDouble();
            }
            System.out.print("Enter the left and right endpoints: ");
            double a=sc.nextInt();
            double b=sc.nextInt();
            if(poly(C,a)*poly(C,b)<0){
                    roots=findRoot(C,a,b,tolerance);
            }
    }
    }
    static double poly(double[] C, double x){
            int n=C.length-1;
            int K;
            double sum=0.0;
            for(int i=0;i<n;i++){
                    sum+=C[i]*(Math.pow((x-i),n));
            }
            return sum;
    }
    static double[] diff(double[] C){
            int n=C.length-1;
            int K;
            double[]D=new double[n];
            for(int i=0;i<n;i++){
                    D[i]=C[i]*(n-1);
            }
            return D;
    }
    static double findRoot(double[] C, double a, double b, double tolerance){
            //loops here
    }
}
