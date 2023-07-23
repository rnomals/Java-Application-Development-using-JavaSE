public class Methods {
    public static void main(String args[]){
        printinstructions(); 
        
        int x = summation(1,100);
        System.out.println(x);

        System.out.println(summation(20, 50));
    }

    public static void printinstructions(){
        System.out.println("Hello World");
    }

    public static int add(){
        return 5 + 6;
    }

    public static int summation(int x, int y){
        int sum = 0;

        for(int i = x; i <= y; i++){
            sum += i;
        }

        return sum;
    }
}
