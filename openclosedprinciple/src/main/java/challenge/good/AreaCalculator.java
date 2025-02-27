package challenge.good;

import java.util.List;

public class AreaCalculator {
    private final List<Shape> shapes;

    public AreaCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public double sum() {
        int sum = 0;

        for (Shape shape : shapes) {
            sum += (int) shape.area();
        }

        return sum;
    }

}
