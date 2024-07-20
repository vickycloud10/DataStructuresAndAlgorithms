package Math;

public class SquareRootOfANumberWithoutUsingInBuildFunctions {

    private static int binarySearch(int left, int right, int x){

        if(right >= left){
            int mid = left + (right - left)/2;

            if(mid == 0) return 0;

            if(mid == x/mid){
               return mid;
            }

            if(mid > x/mid){
               return binarySearch(left, mid - 1, x);
            }

           return binarySearch(mid + 1, right, x);
       }
       return right;
    }

    private static int mySqrt(int x){
      if (x == 0 || x == 1) {
         return x;
      }
      // for handling the sq root of 2
      if(x/2 == 1){
         return x/2;
      }
       return binarySearch(0, x/2, x);
    }
    public static void main(String[] args) {
        int x = 8;
       System.out.println("The square root of "+x+" is : "+mySqrt(x));
    }
}
