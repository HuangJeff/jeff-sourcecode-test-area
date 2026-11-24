import java.util.Scanner;

public class Stars01 {
    public Stars01() {
        System.out.println("This is Stars Math...");
    }
    public static void main(String[] args) {
        new Stars01();

        System.out.print("請輸入字串::");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("STR :: " + str);

        scanner.close();
    }
}