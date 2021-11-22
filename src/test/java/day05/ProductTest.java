package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testCreateProduct() {
        Product product = new Product("milk",Type.DIARY,3);
        assertEquals("milk", product.getName());
        assertEquals(3, product.getPrice());
        assertEquals(Type.DIARY, product.getType());
    }
}