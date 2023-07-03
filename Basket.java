import java.util.ArrayList;
import java.util.List;

    class Basket {
    private List<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}

