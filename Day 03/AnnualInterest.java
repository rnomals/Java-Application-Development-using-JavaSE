import java.util.Scanner;

public class AnnualInterest {
        public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Account Type:");
        char accountType = input.next().charAt(0);
        System.out.print("Enter the Account Balance (Rs.):");
        float balance = input.nextFloat();

        float interestAmount;

        switch(accountType){
            case 'A': case 'C':
                if(balance >= 250){
                    interestAmount = balance * (1.5f / 100);
                    System.out.println("Interest Amount : Rs."+interestAmount);
                }else{
                    System.out.println("Your account balance is lesser than Rs.250.00");
                }

                break;
            case 'B':
                if(balance >= 1000){
                    interestAmount = balance * (2f / 100);
                    System.out.println("Interest Amount : Rs."+interestAmount);
                }else{
                    System.out.println("Your account balance is lesser than Rs.1000.00");
                }

                break;
            case 'X':
                if(balance >= 5000){
                    interestAmount = balance * (5f / 100);
                    System.out.println("Interest Amount : Rs."+interestAmount);
                }else{
                    System.out.println("Your account balance is lesser than Rs.5000.00");
                }
                
                break;
            default:
                System.out.println("Incorrect Account Type. Please try again!");

        }
    }
}
