#include<stdio.h>
#include<stdlib.h>

int main(){
   int i, n;
   double x;
   char str[100]; // string (i.e. char array) for discarding bad input

   // get three positive doubles from the user
   for(i=0; i<3; i++){

      printf("Enter a positive double: ");
      while( 1 ){ // seemingly infinite loop
         n = scanf(" %lf", &x); // try to read a double
         while( n!=1 ){ // if the read failed, because its not a double
            scanf("%s", str); // discard the non-double
            printf("Please enter a positive double: "); // ask again
            n = scanf(" %lf", &x); // try to read a double
         } 
         // at this point we have a double in the variable x
         
         if( x>0 ) break; // get out of the loop if its positive
         printf("Please enter a positive double: "); // otherwise ask again
      }
      // break lands here

   }
   // do the whole thing 3 times and end up here
   printf("bye!\n");
   
   return 0;
}

