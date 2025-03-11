package solution.mar12_2025;

import static solution.mar12_2025.Main.arr;

class Main {
    static int[] arr() {
        int a[] = new int[4];
        int b = a.length;
        for (int i = 0; i < b; i++) {
            a[i] = i;
        }
        return a;
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        int[] a = arr();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}


// 출력결과는?
// 0 1 2 3