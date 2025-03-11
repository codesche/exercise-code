package solution.mar12_2025;

class Parent2 {
    public int compute(int num) {
        if (num <= 1) {
            return num;
        }
        return compute(num - 1) + compute(num - 2);
    }
}

class Child2 extends Parent2 {
    public int compute(int num) {
        if (num <= 1) {
            return num;
        }
        return compute(num - 1) + compute(num - 3);
    }
}


public class Exercise10 {
    public static void main(String[] args) {
        Parent2 obj = new Child2();
        System.out.print(obj.compute(4));
    }
}
