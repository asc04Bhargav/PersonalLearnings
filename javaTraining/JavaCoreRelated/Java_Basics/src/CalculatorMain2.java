public class CalculatorMain2 {
    public static void main(String[] args) {
        Calculator c2;
        c2= new Calculator();

        c2.x=15;
        c2.y=25;

        int res1 = c2.sum();
        c2.prod();

        System.out.println("sum of x and y = "+ res1);

        Calculator c3 = new Calculator();
        c3.x=20;
        c3.y=30;

        int res3= c3.sum();
        c3.prod();

        System.out.println(res3);
    }
}
