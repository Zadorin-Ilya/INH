public class Repository {

    protected Product[] products = new Product[0];
    private Product[] result;


    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public void removeByid(int id) {
        Product[] tmp = new Product[products.length - 1];
        int copyToindex = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[copyToindex] = product;
                copyToindex++;
            }
        }
        products = tmp;

    }


    public Product[] findAll() {
        return products;
    }


}
