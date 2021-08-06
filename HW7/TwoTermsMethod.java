import java.util.Scanner;
public class TwoTermsMethod{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 5 inputs (a, x, b, r, n): ");
		int a = sc.nextInt();
		int x = sc.nextInt();
		int b = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		printInputsAndOutput(a,x,b,r,n,calculateY(a,x,b,r,n));

	}
	public static double axMinusLnB(int a, int x, int b){
		if(b != 0){
			return a*x - Math.log(b);
		}
		else{
			return a*x;
		}
		
	}
	public static double sumNegSquaredT(int n){
		double sum = 0;
		for(int i = 1; i <= n; i++){
			sum += Math.pow(-1,n+1)*i*i;
		}
		return sum;
	}
	public static double calculateY(int a, int x, int b, int r, int n){
		return axMinusLnB(a,x,b)*r + sumNegSquaredT(n)*Math.pow(r,2);
	}
	public static void printInputsAndOutput(int a, int x, int b, int r, int n,double y){
		System.out.format("Inputs (a,x,b,r,n) = %d,%d,%d,%d,%d\n",a,x,b,r,n);
		System.out.format("Output (y) = %.2f\n", y);
		System.out.println(axMinusLnB(a,x,b));
		System.out.println(sumNegSquaredT(n));
	}
}