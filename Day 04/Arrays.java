public class Arrays {
    
    public static void main(String[] args){

        int[] marksOfSam = {56,67,80,45,34,90,86,54,34,67};

        int[][] array2d = {
            {12,23,34},
            {13,34,25}
        };

        int sum = 0;
        int min = marksOfSam[0];
        int max = marksOfSam[0];

        for(int i = 0; i < 10; i++){
            
            sum += marksOfSam[i];

            if(marksOfSam[i]>max){
                max = marksOfSam[i];
            }

            if(marksOfSam[i]<min){
                min = marksOfSam[i];
            }
        }

        System.out.println("Total Marks: "+sum);
        System.out.println("Average: "+sum/10);
        System.out.println("Max Mark: "+max);
        System.out.println("Min Mark:"+min);
    }
}
