package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductWithPieceTest {


    ProductWithPiece pwp = new ProductWithPiece(Type.BAKERY);

    @Test
    void testCreateProductWithPiece() {
        assertEquals(Type.BAKERY,pwp.getType());
    }

    @Test
    void testIncrementCount(){
        assertEquals(1, pwp.getCount());
        pwp.incrementCount();
        assertEquals(2, pwp.getCount());
    }

}