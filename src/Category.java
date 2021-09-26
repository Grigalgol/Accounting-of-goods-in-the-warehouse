import java.util.ArrayList;

public class Category {
    private String name;
    ArrayList<Product> product;
    private int i = 0;

    public Category(String name) {
        this.name = name;
        product = new ArrayList<>();
    }

    public void getListOfProducts() {
        for (Product p : product) {
            System.out.println(++i + ") " + p.getName());
        }
    }

    public boolean deleteProduct(String nameOfProduct) {
        for (int iterator = 0; iterator < product.size(); iterator++) {
            if (product.get(iterator).getName().equals(nameOfProduct)) {
                product.remove(iterator);
                return true;
            }
        }
        return false;
    }
}
