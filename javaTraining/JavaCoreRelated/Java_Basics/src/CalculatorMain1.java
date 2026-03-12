public class CalculatorMain1 {
    public static void main(String[] args) {
//        Declare an object reference to the calculator class.
        Calculator c1;  //object is declared , memory is not allocated till now.
        c1 = new Calculator();  //obj created and the memory is allocated to members of the class calculator

        c1.x=10;
        c1.y=20;

        int res=c1.sum();
        c1.prod();

        System.out.println("sum of x and y =" + res);

    }
}
