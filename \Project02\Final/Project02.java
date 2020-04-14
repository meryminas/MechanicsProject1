import java.util.Scanner;

public class Project02{
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		System.out.println("enter the values of M1, M2 and M3, they should be between 0-10");
		double M1= in.nextDouble();
		double M2= in.nextDouble();
		double M3= in.nextDouble();
		acceleration(M1, M2, M3);

	}

	public static void acceleration(double M1, double M2, double M3){
		//just writing the equations which was found in the a[ploaded files, 
		//here we take g= 10
		int g =10;
		double a1=(-1 * (M2 * M3 * g) / (2 * M2 * M3 + M1 * M2 + M1 * M3 + (M3*M3))); 
		
		//the the same way a2 and a3
		double a2= (M3*(a1-g)/(M3+M2));
		double a3= -a2; 

		System.out.println("acceleration a1 is: " + a1);
		System.out.println("acceleration a2 is: " + a2);
		System.out.println("acceleration a3 is: " + a3);

		System.out.println("now input the t");
		Scanner in= new Scanner(System.in);
		double t= in.nextDouble();

		velocity(a1, a2, a3, t);

		System.out.println("Now the positions"); 
		position(a1, a2, a3, t);
	}

	public static void velocity(double a1, double a2, double a3, double t){

		int v0= 0; //considering that v0 is 0

		//v=v0+at
		double v1= v0+ a1 * t;
		double v2= v0 + a2 * t;
		double v3= v0 + a3* t;

		System.out.println("velocity v1 is " + v1 + " when t = " + t);
        System.out.println("velocity v2 is " + v2 + " when t = " + t);
        System.out.println("velocity v3 is " + v3 + " when t = " + t);

 	}

 	public static void position(double a1, double a2, double a3, double t){
 		//s= s0+v0t + at^2/2
 		int s0= 0;
 		int v0=0;

 		double x1= s0 + v0*t + (a1 *(t*t))/2;
 		double x2= s0 + v0*t + (a2 *(t*t))/2;
 		double x3= s0 + v0*t + (a3 *(t*t))/2;

 		System.out.println("position of M1 after " + t +" times is: " + x1);
 		System.out.println("position of M2 after " + t +" times is: " + x2);
 		System.out.println("position of M3 after " + t +" times is: " +x3);
 	}  
}


