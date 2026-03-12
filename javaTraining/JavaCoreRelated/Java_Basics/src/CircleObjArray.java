public class CircleObjArray {
    public static void main(String[] args) {
        circle();
    }

    public static void circle(){
        Circle c[] ={
            new Circle(),
            new Circle(),
            new Circle()
        };

        c[0].area(2.5);
        c[1].area(3);
        c[2].area(3.5);
    }

}
