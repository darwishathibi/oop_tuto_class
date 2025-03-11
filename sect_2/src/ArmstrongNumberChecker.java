import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number: ");
        int number = sc.nextInt();

        if(isArmstrongNumber(number)){
            System.out.println("The number is a Armstrong number");
        } else {
            System.out.println("The number is not a Armstrong number");
        }
    }
    public static boolean isArmstrongNumber(int num){
        int sum = 0;
        int originalNum = num;
        int digitLength = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digitLength);
            num /= 10;
        }

        return sum == originalNum;
    }
}


