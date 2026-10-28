import java.util.Scanner;
public class P29HourglassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (size - i + 1) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = size - 1; i >= 1; i--) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (size - i + 1) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}