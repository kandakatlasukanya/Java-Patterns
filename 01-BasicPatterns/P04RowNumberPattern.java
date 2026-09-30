import java.util.Scanner;
public class P04RowNumberPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int num = sc.nextInt();
        System.out.println("Number Grid : ");
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= num; j++){
                System.out.print(i + " ");
            }
        }
    }
}
