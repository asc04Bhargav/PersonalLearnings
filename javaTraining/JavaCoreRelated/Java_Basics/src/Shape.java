public class Shape {
    public void area(int length, int breadth){
        System.out.println("Area of the rectangle: "+ length*breadth);
    }
    public void area(double base, double height){
        System.out.println("Area of the traingle: "+ (0.5*base*height));
    }
    public void area(int side){
        System.out.println("Area of the square: "+ side*side);
    }



}
