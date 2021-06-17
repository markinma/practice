public class sumArray {

    public static int[] getSumArray(int target, int[] originalArray) {
        int i = 0;
        int[] result = null;
        for (i, i<originalArray.length, i++) {
            int firstInt = originalArray[i];
            int j = 0;

            for (j, j<originalArray.length, j++) {
                int secondInt = originalArray[j];

                if (i==j) {
                    continue;
                }

                int sum = firstInt + secondInt;
                if (sum == target){
                    result = new {firstInt, secondInt};
                    return result;
                }


            }
        }
        return null;
    }

    {2,5,6,7,3,8}
    sorted is {2,3,5,6,7,8}
    if target is 11
    2 8


}