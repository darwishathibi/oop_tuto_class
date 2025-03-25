import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a perfect number: ");
        int num = sc.nextInt();

        if(checkPerfectNumber(num)){
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfect number");
        }
    }

    public static boolean checkPerfectNumber(int num) {
        //if number is 0 or 1
        if(num <= 1){
            return false;
        }

        int sum = 1;

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
//                sum = sum + i;
                sum+=i;
                if(1 != num / i){
                    sum+= num / i;
                }
            }
        }
        return sum == num;
    }
}
