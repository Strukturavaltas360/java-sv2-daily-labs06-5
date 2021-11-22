package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store = new Store();

    @BeforeEach
    void init(){
        store.addProduct(new Product("milk",Type.DIARY,0.8));
        store.addProduct(new Product("butter",Type.DIARY,2.1));
        store.addProduct(new Product("bread", Type.BAKERY, 3.2));
        store.addProduct(new Product("croissant",Type.BAKERY,1.8));
        store.addProduct(new Product("apple", Type.FRUIT, 1.2));
        store.addProduct(new Product("banana", Type.FRUIT, 2.2));
        store.addProduct(new Product("peach", Type.FRUIT, 1.8));

    }

    @Test
    void numberOfProductsByType(){
        List<ProductWithPiece> result = store.numberOfProductsByType();
        assertEquals(3, result.size());
        assertEquals(Type.DIARY,result.get(0).getType());
        assertEquals(Type.BAKERY,result.get(1).getType());
        assertEquals(Type.FRUIT,result.get(2).getType());
        assertEquals(2,result.get(0).getCount());
        assertEquals(2,result.get(1).getCount());
        assertEquals(3,result.get(2).getCount());
    }

    @Test
    void testEmptyStore() {
        Store store2 = new Store();
        List<ProductWithPiece> result = store2.numberOfProductsByType();
        assertEquals(0, result.size());
    }
}