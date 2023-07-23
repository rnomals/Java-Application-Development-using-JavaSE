
import java.util.Arrays;

public class Sorting {
    public static void main(String args[]){
        int [] marks = {20,78,12,78,23,76,21,89,76,5};

        System.out.println(Arrays.toString(selectionsort(marks)));
        System.out.println(Arrays.toString(bubblesort(marks)));
    }

    public static int[] selectionsort(int[] array){

        for(int i = 0; i < array.length; i++){
            int minindex = i;
            int min = array[i];
            for(int x = i; x < array.length; x++){
                if(array[x] < min){
                    min = array[x];
                    minindex = x;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minindex] = temp;
            }
        
        return array;

    }

    public static int[] bubblesort(int[] array){

        for(int i = 0; i < array.length; i++){
            for(int x = 0; x < array.length - i - 1; x++){
                if(array[x] > array[x+1]){
                    int temp = array[x];
                    array[x] = array[x+1];
                    array[x+1] = temp;
                }
            }
        }
        return array;
    }
}
