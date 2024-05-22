import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = s.nextInt();
        for (int i = 1 ; i <= rows ; i++){
            for(int j = 1 ; j < ((2 * i) - 2) ; j++){
                System.out.println("*");
            }
            for (int k = 1 ; k <= 6 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}