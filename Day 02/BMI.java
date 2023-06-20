import java.util.Scanner;

public class BMI{

	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the weight in kgs:");
		float weight = keyboard.nextFloat();
		System.out.print("Enter the height in meters:");
		float height = keyboard.nextFloat();
		float bmi = weight / (height*height);

		System.out.println("BMI is "+bmi);

		if(bmi >= 40 ){
			System.out.println("Weight Status : Obese Class 3");
		}else if(bmi >= 35){
			System.out.println("Weight Status : Obese Class 2");
		}else if(bmi >= 30){
			System.out.println("Weight Status : Obese Class 1");
		}else if(bmi >= 25){
			System.out.println("Weight Status : Overweight");
		}else if(bmi >= 18.5){
			System.out.println("Weight Status : Normal Range");
		}else{
			System.out.println("Weight Status : Underweight");
		}
		
	}

}