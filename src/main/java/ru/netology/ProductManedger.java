package ru.netology;

public class ProductManedger {
    ProductRepository repository;

    public ProductManedger(ProductRepository repository) {
        this.repository = repository;
    }
    public void add(Product product){
        repository.add(product);
    }
    public Product[] searchBy(String text) {
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        for (Product product: repository.findAll()) {
            if (matches(product, text)) {
                // "добавляем в конец" массива result продукт product
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
    public boolean matches(Product product, String search) {
        if (product.getTitle().contains(search)) {
             return true;
        }
        return false;
    }


}
