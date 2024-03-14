public class Palindrome {
    public static void main(String[] args) {
int input=121;
        int number = input, reverse = 0;

        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }

    
        if (input == reverse) {
            System.out.println("Given number is palindrome");
        } else {
            System.out.println("given number is not a palindrome");
        }

    }
}
