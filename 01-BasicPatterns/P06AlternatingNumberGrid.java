import java.util.Scanner;
public class P06AlternatingNumberGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int num = 1;
        for(int i = 1; i <= rows; i++){
            for(int j = 1;j <= cols; j++){
                if((i + j) % 2 == 0){
                    System.out.print( "1");
                }else{
                    System.out.print("2 ");
                }
            }
            System.out.println();

        }

    }
}