class Problem2{
 public static void main(String[] args){
 int[][] table = { {3, 9, 6, 12},
 {23, -25, 54},
 {0, -12, 27, 8, 16} };
 System.out.println(getMax(table)); // prints 54
 }
 static int getMax(int[][] A){
int maxValue = 0;
 for(int row = 0; row < A.length; row++){
	for (int col = 0; col < A[row].lenggth; col++)
	int value = A[row][col];
	if(value > maxValue){
		maxValue = value;
}
}
}
return maxValue;

// your code goes here
}
}
