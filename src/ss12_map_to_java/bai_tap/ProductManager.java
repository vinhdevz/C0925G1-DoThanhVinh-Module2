package ss12_map_to_java.bai_tap;

import java.util.*;

public class ProductManager implements Comparator<Product> {
    private static final LinkedList<Product> list = new LinkedList<>();

    static {
        list.add(new Product(1, "Vinh", 50000));
        list.add(new Product(2, "Long", 60000));
        list.add(new Product(3, "Hải", 70000));
        list.add(new Product(2, "Hải", 90000));
    }

    public void addProduct(Product product) {
        list.add(product);
    }

    public boolean editProduct(int id, String newName, double newPrice) {
        for (Product product : list) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }

    public boolean removeProduct(int id) {
        return list.removeIf(product -> product.getId() == id);
    }

    public void showProduct() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public void searchProduct(String name) {
        boolean found = false;
        for (Product product : list) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy sản phẩm nào!");
    }

    public List<Product> sortByAscending() {
        list.sort(this);
        return list;
    }

    public void sortByDescending() {
        Collections.reverse(sortByAscending());
    }

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getId() == o2.getId()) {
            return (int) (o1.getPrice() - o2.getPrice());
        }
        return o1.getId() - o2.getId();
    }
}

