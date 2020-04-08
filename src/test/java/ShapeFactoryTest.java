import FactoryExample1.Shape;
import FactoryExample1.ShapeFactory;

public class ShapeFactoryTest {
    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Square");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("Circle");
        shape3.draw();
    }
}
