class quiz1{
	static int foo(int x, int n){
		int y = x + n;
		System.out.println("in foo: "+ x +", "+ n);
		x = x*2;
		if( x<n ){
			y = foo(x, n+1);
		}
		System.out.println("y= "+ y);
		return x;
	}
	public static void main(String[] args){
		System.out.println(foo(1,10));
	}
}
