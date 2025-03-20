import java.util.ArrayList;
public class FactoryPatternTest {
    public static void main(String[] args){
        Factory shapeFactory = new Factory();
        Shape aSquare = shapeFactory.getShape("square");
        Shape aTriangle = shapeFactory.getShape("triangle");
        Shape anOctagon = shapeFactory.getShape("octagon");

        ArrayList<Shape> myShapes = new ArrayList<>();
        myShapes.add(aSquare);
        myShapes.add(aTriangle);
        myShapes.add(anOctagon);

        for (Shape sh : myShapes){
            System.out.println(sh.getName() + " has "+ "sh.getNumberOfSides" + "Shapes");
            sh.draw();
        }
    }
}
