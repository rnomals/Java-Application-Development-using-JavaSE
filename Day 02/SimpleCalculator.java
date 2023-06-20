import java.util.Scanner;

public class SimpleCalculator{

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		

		System.out.println("**** Simple Calculator *****");
		System.out.println("Options:");
		System.out.println("1:Addition");
		System.out.println("2:Substraction");
		System.out.println("3:Multiplication");
		System.out.println("4:Division");
		System.out.println("****************************");
		System.out.println();
		System.out.print("Select the option:");
		int option = input.nextInt();
		
		System.out.print("Enter number 1:");
		int number1 = input.nextInt();

		System.out.print("Enter number 2:");
		int number2 = input.nextInt();

		int calculatedValue;

		if(option == 1){
			calculatedValue = number1 + number2;
			System.out.println("Addition of two numbers = "+calculatedValue);
		}else if(option == 2){
			if(number1 > number2){
				calculatedValue = number1 - number2;
			}else{
				calculatedValue = number2 - number1;
			}
			
			System.out.println("Substraction of two numbers = "+calculatedValue);		
		}else if(option == 3){
			calculatedValue = number1 * number2;
			System.out.println("Multiplication of two numbers = "+calculatedValue);
		}else if(option == 4){
			calculatedValue = number1 / number2;
			System.out.println("Division of number1 by number2 = "+calculatedValue);
		}else{
			System.out.println("Incorrect selection of option");
		}
		

	}


}