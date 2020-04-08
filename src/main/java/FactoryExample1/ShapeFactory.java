package FactoryExample1;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType.equals("Rectangle")){
            return new Rectangle();
        }else if(shapeType.equals("Square")){
            return new Square();
        }else if(shapeType.equals("Circle")) {
            return new Circle();
        }else{
            return null;
        }
    }
}
