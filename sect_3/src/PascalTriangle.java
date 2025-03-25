import java.util.Scanner;

public class PascalTriangle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows : ");
//        int rows = sc.nextInt();
//
//        printPascalTriangle(rows);
//
//        sc.close();
//    }
//
//    public static void printPascalTriangle(int num) {
//        for(int i = 0; i < num; i++){
//            for(int j = 0; j <=  i; j++ ){
//                System.out.print(j + " ");
//                num = num * (i -j) / j;
//            }
//            System.out.println();
//        }
//    }

    // Pascal function
    public static void printPascal(int n)
    {
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {

                // for left spacing
                System.out.print(" ");
            }

            // used to represent C(line, i)
            int C = 1;
            for (int i = 1; i <= line; i++) {

                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 4;
        printPascal(n);
    }
}
