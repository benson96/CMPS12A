import java.util.Scanner;
public class Lawn {
	public static void main( String[] args ){
		double length1, width1, length2, width2, area, time, mowingrate, sec;
		int h,m,s;
		Scanner sc =new Scanner(System.in);	
		System.out.print("Enter length and width of the lot, in feet: ");
		length1 = sc.nextDouble();
		width1 = sc.nextDouble();
		System.out.print("Enter the length and width of the house, in feet: ");
        length2 = sc.nextDouble();
        width2 = sc.nextDouble();
        area = length1*width1-length2*width2;
        System.out.print("The Lawn area is, " + area + " square feet");
        System.out.print("\n");
        System.out.print("Enter the mowing rate, in square feet per second: ");
        mowingrate = sc.nextDouble();
        sec = area/mowingrate;
        s = (int) Math.round(sec);
        m = s/60;
        s = s%60; // same as s %= 60
        h = m/60;
        m = m%60; // same as m %= 60
        if(h == 1){
          
        System.out.println(h+"hour, "+m+" minutes and "+s+" seconds");
	} else {
            System.out.println(h+"hours, "+m+" minutes and "+s+" seconds");
        } 
   }
}        
// Lawn.java
// Jinxuan Jiang
// 1476761
// pa1
// It's a program to do some simple calculations.
