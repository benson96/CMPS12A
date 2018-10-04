#include <stdio.h>
int gcd(int a,int b)
{
	if (a%b==0){
		return(b);
	}
	else{
		return(gcd(b,a%b));
	}
}

int main(){
	int x=0;
	int y=0;
	printf("Enter a positive integer: ");
	scanf("%d", &x);
	x = scanf("%d", &x);
	

	printf("Enter another positive integer: ");
	scanf("%d", &y);
	y = scanf("%d", &y);
	printf("The GCD of %d and %d is: %d ",x,y,gcd(x,y));
	return 0;
}
