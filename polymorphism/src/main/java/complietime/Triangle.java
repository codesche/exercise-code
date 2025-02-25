package complietime;

// 메서드 오버로딩: 컴파일 타임 다형성
public class Triangle {
    public void draw() {
        System.out.println("Draw default triangle ...");
    }

    public void draw(String color) {
        System.out.println("Draw a triangle of color " + color);
    }

    public void draw(int size, String color) {
        System.out.println("Draw a triangle of color "
            + "color + and scale it up with the new size of "  + size);
    }

}
