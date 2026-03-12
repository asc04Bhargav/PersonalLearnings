public class Product implements Comparable<int>{
    private int prodId;
    private String prodName;

    public Product() {
    }

    public Product(int prodId, String prodName) {
        this.prodId = prodId;
        this.prodName = prodName;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {

        return p;
    }
}
