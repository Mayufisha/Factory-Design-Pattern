public class Square  implements Shape{

    private final static int numberOfSides = 4;
    private final static String shapeName = "square";
    //private float area;

    public Square(){

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
        System.out.println("______");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("|     |");
        System.out.println("______");

    }
}
