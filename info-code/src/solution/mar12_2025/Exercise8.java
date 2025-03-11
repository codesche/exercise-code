package solution.mar12_2025;

// 10진수를 2진수로 변환
public class Exercise8 {
    public static void main(String[] args) {
        int[] a = new int[8];
        int i = 0; int n = 10;
        while (n > 0) {
            a[i++] = (n % 2);
            n /= 2;
        }
        for(i = 7; i >= 0; i--){
            System.out.print(a[i]);
        }
    }
}
