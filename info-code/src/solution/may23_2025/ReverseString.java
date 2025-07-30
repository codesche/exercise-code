package solution.may23_2025;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String input = sc.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("역순 문자열: " + reversed);
    }
}
