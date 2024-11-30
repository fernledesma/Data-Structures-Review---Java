public class ArrayListPractice {
    public static void main(String[] args){
    int[] firstArray ={2,4,6,8,10};
    int[] secondArray = {2,4,6,8,10};
    boolean arraysEqual= true;
    int i=0;
        if(firstArray.length != secondArray.length){
            arraysEqual=false;
        }
        while(arraysEqual && i<firstArray.length){
            if(firstArray[i]!=secondArray[i]){
                arraysEqual=false;
            }
            i++;
        }
        if(arraysEqual){
            System.out.println("The arrays are equal.");
        }else{
            System.out.println("The arrays are not equal");
        }

        int[] numbers = new int[50];
        getHighest(numbers);
        getLowest(numbers);
    }

    public static void getHighest(int[] num){
        for (int i=0; i<num.length; i++ ){
            num[i] = i+1;
        }
        int highest = num[0];
        for(int i =0; i<num.length; i++){
            if(num[i]>highest){
                highest = num[i];
            }
        }
        System.out.println(highest);
    }
    public static void getLowest(int[] num){
        for(int i=0; i<num.length; i++){
            num[i] = i+1;
        }
        int lowest= num[0];
        for(int i =0; i<num.length; i++){
            if(num[i]<lowest){
                lowest = num[i];
            }
        }
        System.out.println(lowest);
    }
}
