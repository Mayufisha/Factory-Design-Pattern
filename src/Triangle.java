public class Triangle implements Shape{

    private final static int numberOfSides = 3;
    private final static String shapeName = "triangle";
   //private float area;

    public Triangle(){

    }

    @Override
    public int getNumberOfSides() {
        return numberOfSides;
    }

    @Override
    public String getName() {
        return shapeName;
    }

    @Override
    public void draw() {
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/    \\");
        System.out.println("______");

    }
}
