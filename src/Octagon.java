public class Octagon implements Shape{

    private final static int numberOfSides = 8;
    private final static String shapeName = "octagon";
    //private float area;

    public Octagon(){

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
        System.out.println("  _____");
        System.out.println(" /     \\");
        System.out.println("/       \\");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("\\       /");
        System.out.println(" \\     /");
        System.out.println("  _____");
    }
}
