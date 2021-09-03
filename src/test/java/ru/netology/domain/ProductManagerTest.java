package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

public class ProductManagerTest {
    private ProductManager productManager = new ProductManager();
    private ProductRepository productRepository = new ProductRepository();
    private Smartphone newSmartphone = new Smartphone();

    @Test
    public void shouldAddProduct() {
        productManager.add();
        Product[] expected = new Product(productManager);
        Product[] actual = productRepository.findAll();
        assertArrayEquals(expected , actual);


    }

}
