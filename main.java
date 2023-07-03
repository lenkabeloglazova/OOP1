import java.util.Locale.Category;

class main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Создание продуктов
        Product product1 = new Product("Товар 1", 100, 4);
        Product product2 = new Product("Товар 2", 200, 5);
        Product product3 = new Product("Товар 3", 150, 3);

        // Создание категорий
        final Category category1 = new Category("Категория 1");
        Category category2 = new Category("Категория 2");

        // Добавление продуктов в категории
        category1.addProduct(product1);
        category1.addProduct(product2);
        category2.addProduct(product3);

        // Создание пользователей
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        // Добавление продуктов в корзину пользователей
        user1.getBasket().addProduct(product1);
        user1.getBasket().addProduct(product2);
        user2.getBasket().addProduct(product3);

        // Вывод каталога продуктов
        System.out.println("Каталог продуктов:");
        System.out.println("Категория 1:");
        for (Product product : category1.getProducts()) {
            System.out.println(product);
        }
        System.out.println("Категория 2:");
        for (Product product : category2.getProducts()) {
            System.out.println(product);
        }

        // Вывод покупок пользователей
        System.out.println("Покупки пользователей:");
        System.out.println("Пользователь " + user1.getUsername() + ":");
        for (Product product : user1.getBasket().getProducts()) {
            System.out.println(product);
        }
        System.out.println("Пользователь " + user2.getUsername() + ":");
        for (Product product : user2.getBasket().getProducts()) {
            System.out.println(product);
        }
    }
}

