import java.util.Scanner;

public class VariableTest {

	public static void main(String[] args) {
		int num1,num2, sum;
		System.out.println("Enter two numbers");
		// creating an object of scanner class
		Scanner sc=new Scanner(System.in);

		// userdefined input
		num1=sc.nextInt();
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.println("The sum of " +num1 + "+" + num2 +" = "+sum );
		// direct assignment
		int a=2;
		int b=3;
		System.out.println(a+b);

	}

}
