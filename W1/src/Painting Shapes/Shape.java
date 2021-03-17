abstract public class Shape
{
    private String shapeName;

    public Shape(String shapeName){
        this.shapeName = shapeName;
    }

    public String toString(){
        return "Shape Name : " + shapeName;
    }

    abstract public double getArea();

}
