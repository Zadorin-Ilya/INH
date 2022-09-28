public class ProductManager {
    protected static Repository repository;

    public ProductManager(Repository repository) {
        this.repository = repository;
    }

    public static void add(Product product) {
        repository.add(product);
    }

    public static Product[] removeById(int id) {
        repository.removeByid(id);
        return new Product[0];
    }

    public static Product[] searchBy(String text) {
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        for (Product product : repository.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = product;
                result = tmp;

            }
        }
        return result;
    }

    // метод определения соответствия товара product запросу search
    public static boolean matches(Product product, String search) {
        if (product.getTitle().contains(search)) {
            return true;
        } else {
            return false;
        }
        // или в одну строку:
        // return product.getName().contains(search);
    }
}
