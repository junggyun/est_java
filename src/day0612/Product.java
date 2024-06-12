package day0612;

public class Product {
    private static final String CATEGORY = "clothes";
    private final int productId;
    private String productName;

    public Product() {
        this(0, "준비중인 상품"); // this 키워드가 첫 줄에 와야함!!
    }

    public Product(int productId) {
        this.productId = productId;
    }

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public static String getCategory() {
        return CATEGORY;
    }
    public int getProductId() {
        return productId;
    }

    public static void main(String[] args) {
        System.out.println(Product.CATEGORY);

        Product product = new Product();
        System.out.println(product.productId);
    }
}
