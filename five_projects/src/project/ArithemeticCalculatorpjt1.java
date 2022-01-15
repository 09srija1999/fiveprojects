package project;

import java.util.Scanner;

public class ArithemeticCalculatorpjt1 {

	public static void main(String[] args) {
		double n1,n2,res;
		int option;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number 1:");
		n1 = sc.nextDouble();   //scan the double values from the user..

		System.out.println("Enter the number 2:");
		n2 = sc.nextDouble();
		
		/*System.out.println("enter the operator :");
		op = sc.next().charAt(0);   // scan the character values from the user*/

		System.out.print("\n1: Addition.\n2: Subtraction.");
        System.out.print("\n3: Multiplication.\n4: Divide.");
        System.out.print("\n5: Remainder.\n6: Exit.");
         
        System.out.print("\nEnter your choice: ");
        option=sc.nextInt();

		switch(option)
		{
			case 1: res = n1+n2;
					System.out.println("the result is: "+n1 +" +" + n2 +" = " +res );
					break;
			case 2: res = n1-n2;
					System.out.println("the result is: "+n1 +" -" + n2 +" = " +res );
					break;
			case 3: res = n1*n2;
					System.out.println("the result is: "+n1 +" *" + n2 +" = " +res );
					break;
			case 4: res = n1/n2;
					System.out.println("the result is: "+n1 +" /" + n2 +" = " +res );
					break;
			case 5: res = n1%n2;
					System.out.println("the result is: "+n1 +" %" + n2 +" = " +res );
					break;
			default : System.out.println("invalid data");
		}

	}
          
  }