package solution.jun29_2025;

public class Test5 {
    public static void main(String[] args){
        int a, b, c, hap;
        a = b = c = 2;
        hap = ++a | b-- & c--;
        System.out.printf("%d %d %d %d", hap, a, b, c);
    }
}
