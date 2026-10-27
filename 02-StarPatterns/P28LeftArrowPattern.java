import java.util.Scanner;
public class P28LeftArrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int i, j;
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = rows - 1; i >= 1; i--) {
            for (j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}