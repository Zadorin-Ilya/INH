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
    public void ProductManagerTest() {
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

        Product[] actual = ProductManager.searchBy("2");
        Product[] expected = {book2};


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
}