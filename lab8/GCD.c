#include<stdio.h>
 
int gcd(int n,int m)
{
    if((n>=m)&&((n%m)==0))
        return(m);
    else
        gcd(m,(n%m));
}
 
int main()
{
    int n,m,result;
    printf("Enter a positive integer:");
    scanf("%d",&n);
    printf("Enter another positive integer:");
    scanf("%d",&m);
    result=gcd(n,m);
    printf("nGCD of %d and %d is %d",n,m,result);
 
    return 0;
}
