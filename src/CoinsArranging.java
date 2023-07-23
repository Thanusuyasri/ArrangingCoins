import java.util.Scanner;

public class CoinsArranging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        int row = 1, completerow = 0 ;
        while(row < num)
        {
            num -= row;
            row++;
            completerow++;
        }
        System.out.println(completerow);
    }
}
