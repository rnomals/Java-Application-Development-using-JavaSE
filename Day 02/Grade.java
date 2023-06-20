import java.util.Scanner;

public class Grade{
	
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the mark:");
		int mark = input.nextInt();
		
		if(mark >= 50){
			if(mark >= 85){
				System.out.println("Grade: A+");
			}else{
				if(mark >= 75){
					System.out.println("Grade: A");
				}else{
					if(mark >= 70){
						System.out.println("Grade: A");
					}else{
						if(mark >= 60){
							System.out.println("Grade: B");
						}else{
							System.out.println("Grade: C");
						}
					}
				}
			}
		}else{
			System.out.println("Grade: F");
		}
	
	}






}