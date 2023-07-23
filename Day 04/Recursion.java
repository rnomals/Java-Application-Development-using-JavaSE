

public class Recursion {
    
    public static void main(String[] args){
        System.out.println(fibbonacchi(4));
    }

    public static int sum(int number){

        if(number == 1){
            return 1;
        }else{
            return number + sum( number - 1);
        }
    }

    public static int fibbonacchi(int index){

        if(index == 1){
            return 0;
        }else if(index == 2){
            return 1;
        }else{
            return fibbonacchi(index - 1 ) + fibbonacchi(index - 2);
        }
    }
}
