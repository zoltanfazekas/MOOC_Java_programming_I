
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int nagy = 0;
        if (number1 > number2) {
            nagy = number1;
        } else {
            nagy = number2;
        }
        if (number3 > nagy) {
            nagy = number3;
        }
        return nagy;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
