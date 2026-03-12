public class CalculateMain1 {
    public static void main(String[] args) {
        Calculate c1 = new Calculate();
        c1.add(10,15);
        c1.add(12L,13L);
        c1.add((byte)10,(byte)20);
        c1.add((short)15, (short)17 );
    }
}
