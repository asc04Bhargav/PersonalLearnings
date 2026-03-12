public class SalesMain1 {
    public static void main(String[] args) {
        Sales s1 = new Sales();
        Sales s2 = new Sales();
        Sales s3 = new Sales();

        s1.salesAcheived=70;
        s2.salesAcheived=60;
        s3.salesAcheived=65;

        Sales.totalSales = s1.salesAcheived + s2.salesAcheived + s3.salesAcheived;

        Sales.printTotalSales();

    }
}
