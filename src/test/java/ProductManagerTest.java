import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    @Test
    public void ManagerTest() {
        Repository repo = new Repository();
        ProductManager productManager = new ProductManager(repo);

        Book book1 = new Book(110, "Gray", 128, "Joy");
        Book book2 = new Book(210, "Gray 2", 420, "Joy");
        Book book3 = new Book(368, "Summer", 800, "Joy");
        Book book4 = new Book(404, "Apple", 128, "Joy");

        ProductManager.add(book1);
        ProductManager.add(book2);
        ProductManager.add(book3);
        ProductManager.add(book4);

        Product[] actual = ProductManager.searchBy("Gray");
        Product[] expected = {book1, book2};


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeById() {
        Repository repo = new Repository();
        ProductManager productManager = new ProductManager(repo);

        Book book1 = new Book(110, "Gray", 128, "Joy");
        Book book2 = new Book(210, "Gray 2", 420, "Joy");
        Book book3 = new Book(368, "Summer", 800, "Joy");
        Book book4 = new Book(404, "Apple", 128, "Joy");

        ProductManager.add(book1);
        ProductManager.add(book2);
        ProductManager.add(book3);
        ProductManager.add(book4);

        Product[] actual = ProductManager.removeById(210);
        Product[] expected = {};


        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void Test() {
        Repository repo = new Repository();
        ProductManager productManager = new ProductManager(repo);

        Book book1 = new Book(110, "Gray", 128, "Joy");
        Book book2 = new Book(210, "Gray 2", 420, "Joy");
        Book book3 = new Book(368, "Summer", 800, "Joy");
        Book book4 = new Book(404, "Apple", 128, "Joy");

        ProductManager.add(book1);
        ProductManager.add(book2);
        ProductManager.add(book3);
        ProductManager.add(book4);

        Product[] actual = ProductManager.searchBy("Aple");
        Product[] expected = {};


        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void Testauthor() {
        Repository repo = new Repository();
        ProductManager productManager = new ProductManager(repo);

        Book book1 = new Book(110, "Gray", 128, "Joy");
        Book book2 = new Book(210, "Gray 2", 420, "Joy");
        Book book3 = new Book(368, "Gray 3", 800, "Joy");
        Book book4 = new Book(404, "Gray 4", 128, "Joy");
        Book book5 = new Book(1000, "Gray 5", 900, "Joy");

        ProductManager.add(book1);
        ProductManager.add(book2);
        ProductManager.add(book3);
        ProductManager.add(book4);
        ProductManager.add(book5);

        Product[] actual = ProductManager.searchBy("Gray");
        Product[] expected = {book1,book2,book3,book4,book5};


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Testsma() {
        Repository repo = new Repository();
        ProductManager productManager = new ProductManager(repo);

        Smartphone smartphone1 = new Smartphone(110, "Nokia", 1280, "123");
        Smartphone smartphone2 = new Smartphone(110, "Gray", 1285, "123");
        Smartphone smartphone3 = new Smartphone(110, "Apple", 1289, "123");
        Smartphone smartphone4 = new Smartphone(110, "Moto", 1287, "123");

        ProductManager.add(smartphone1);
        ProductManager.add(smartphone2);
        ProductManager.add(smartphone3);
        ProductManager.add(smartphone4);


        Product[] actual = ProductManager.searchBy("Nokia");
        Product[] expected = {smartphone1};


        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void Testsmart() {
        Repository repo = new Repository();
        ProductManager productManager = new ProductManager(repo);

        Smartphone smartphone1 = new Smartphone(110, "Apple 5", 1280, "123");
        Smartphone smartphone2 = new Smartphone(110, "Apple 5", 1285, "123");
        Smartphone smartphone3 = new Smartphone(110, "Apple", 1289, "123");
        Smartphone smartphone4 = new Smartphone(110, "Apple 2", 1287, "123");

        ProductManager.add(smartphone1);
        ProductManager.add(smartphone2);
        ProductManager.add(smartphone3);
        ProductManager.add(smartphone4);


        Product[] actual = ProductManager.searchBy("Nokia");
        Product[] expected = {};


        Assertions.assertArrayEquals(expected, actual);
    }
}
