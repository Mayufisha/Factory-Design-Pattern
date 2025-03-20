public class Factory {
    public Shape getShape(String shapeName){
        if(shapeName.equalsIgnoreCase("triangle"))
            return new Triangle();
        else if(shapeName.equalsIgnoreCase("square"))
            return new Square();
        else if(shapeName.equalsIgnoreCase("octagon"))
            return new Octagon();
        else
            System.out.println("Wrong shape name");
            return null;
    }
}
