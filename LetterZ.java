import java.util.Scanner;
public class Z {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the size: ");
        int size = input.nextInt();
        int col = 1;

        for (int row = 1; row <= size; row++) { // patayo to
            for (int j = 1; j <= size; j++) { // merong pahiga pero hindi natatanggal sa git
                if (row == 1 || row == size || j == size - row + 1) {
                System.out.print("# ");
                }

                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
