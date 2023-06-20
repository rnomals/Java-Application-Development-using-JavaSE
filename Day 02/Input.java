import java.util.Scanner;

public class Input{

	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the price:");
		float price = keyboard.nextFloat();
		System.out.print("Enter the rate:");
		float rate = keyboard.nextFloat();
		
		if(price > 0 && rate > 0){
			float priceAfterTax = price * (1+rate/100);
			System.out.println("Price after the tax is "+priceAfterTax);
		}else{
			System.out.println("Incorrect inputs");
		}
		
		
	}

}