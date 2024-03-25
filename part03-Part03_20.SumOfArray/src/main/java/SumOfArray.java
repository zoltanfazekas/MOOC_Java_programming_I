
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int ossz = 0;
        for (int i = 0; i < array.length; i++) {
            ossz = ossz + array[i];
            
        }
        return ossz;
    }
}
