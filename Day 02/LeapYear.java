import java.util.Scanner;

public class LeapYear{

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Year:");
		int year = input.nextInt();
		
		if( year % 4 == 0  ){
			if( year % 100 == 0){
				if(year % 400 == 0){
					System.out.println(year + " is a Leap Year.");
				}else{
					System.out.println(year + " is a not a Leap Year.");
				}
			}else{
				System.out.println(year+ " is a Leap Year.");
			}
			
		}else{
			System.out.println(year + " not a Leap Year.");
		}
	}

}