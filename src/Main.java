// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Sum of the First and Last Digits is: " + sumFirstAndLastDigit(5651));


    }

    public static int sumFirstAndLastDigit(int num) {
        if (num < 0) {
            return -1;
        }
        int last_Digit = num % 10;

        while (num > 9) {
            num /= 10;
        }
        return num + last_Digit;
    }

}
