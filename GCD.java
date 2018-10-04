import java.util.Scanner;
public class GCD {
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a positive integer: ");
	while( !sc.hasNextDouble() ){
		sc.next();
		System.out.println("Please enter a positive integer: ");
	}

	int a = sc.nextInt();
	System.out.println("Enter another postive integer: ");
	while( !sc.hasNextInt() ){
	    sc.next();
	    System.out.println("Please enter a positive integer: ");
	}

        int b = sc.nextInt();
         
        System.out.println("The GCD of " + a + " and " + b + " is " + getGCD(a,b) + ".");
     }
     
     public static int getGCD(int a, int b){
	int GCD = 1;

        if(a>b){
            for(int i = b; i >=1; i--){
                if(a%i==0 && b%i==0){
                return i;
		}
            }
	}
	else{
	  for(int j = a; j >=1; j--){
		if(a%j==0 && b%j==0){
		return j;
	        }
             }
	}
	return GCD;
     }
}
