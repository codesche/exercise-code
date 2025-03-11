package solution.mar12_2025;

class Parent {
    void show() {
        System.out.println("parent");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("child");
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Parent pa = new Child();
        pa.show();
    }
}
