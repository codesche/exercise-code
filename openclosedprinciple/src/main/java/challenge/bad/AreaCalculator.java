package challenge.bad;

import java.util.List;

public class AreaCalculator {
    private final List<Shape> shapes;

    public AreaCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    /**
     * 도형을 추가하려면 이 클래스를 수정해야 한다.
     * 이 코드는 개방-폐쇄 원칙에 맞지 않는다.
     */
    public double sum() {
        int sum = 0;
        for (Shape shape : shapes) {
            if (shape.getClass().equals(Circle.class)) {
                sum += (int) (Math.PI * Math.pow(((Circle) shape).getRadius(), 2));
            } else if (shape.getClass().equals(Rectangle.class)) {
                sum += ((Rectangle) shape).getHeight() * ((Rectangle) shape).getWidth();
            }
        }

        return sum;
    }

}
