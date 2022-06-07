import java.util.Scanner;

public class Fortest {
    //     *       1   1
    //    ***      2   3
    //   *****     3   5
    //  *******    4   7
    // *********   5   9
    //  *******    6   7
    //   *****     7   5
    //    ***      8   3
    //     *       9   1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要的菱形行数:");
        int line = sc.nextInt();
        if (line % 2 != 0) {
            int ll = (line + 1) / 2;
            for (int i = 1; i <= ll; i++) {
                for (int k = 1; k <= ll - i; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            //下部
            for (int i = 1; i <= ll - 1; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int n = 1; n <= line - 2 * i; n++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }else{
            System.out.println("error");
        }
    }
    }

