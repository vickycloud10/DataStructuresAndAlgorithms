package Arrays;
public class RemoveDuplicatesFromAnArray {

    private static int removeDuplicates(int[]array, int n){
        int j = 0;
        int [] temp = new int[n];
        for(int i = 0; i < n - 1; i++){
            if(array[i] != array[i+1]){
                temp[j++] = array[i];
            }
        }

        temp[j++] = array[n - 1];

        for(int i = 0; i < j; i++){
            array[i] = temp[i];
        }
        return j;
    }
    public static void main(String[] args) {
        int [] sampleArray = {0,0,1,1,1,2,2,3,3,3};
        int n = removeDuplicates(sampleArray, sampleArray.length);

        for(int i = 0; i < n; i++){
            System.out.println(sampleArray[i]+" ");
        }
    }
}
