package cn.xpbootcamp.gilded_rose;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductControllerTest implements WithAssertions {

    private ProductController productController;

    @BeforeEach
    void setUp() {
        productController = new ProductController();
    }

    @Test
    public void qualityShouldDecrease() {
        Product product = new Product("mock product");
        product.setSellIn(7);
        product.setQuality(10);

        product = productController.decreaseSellInAndQuality(product);
        assertThat(product).matches(p -> p.getSellIn() == 6 && p.getQuality() == 9);
    }

    @Test
    public void qualityShouldDecreaseOnDoubleSpeed() {
        Product product = new Product("mock product");
        product.setSellIn(0);
        product.setQuality(10);

        product = productController.decreaseSellInAndQuality(product);
        assertThat(product).matches(p -> p.getSellIn() == -1 && p.getQuality() == 8);
    }

    @Test
    public void qualityShouldIncreaseWhenProductIsAgedBrie() {
        Product agedBrie = new Product("Aged Brie");
        agedBrie.setSellIn(7);
        agedBrie.setQuality(10);

        agedBrie = productController.decreaseSellInAndQuality(agedBrie);
        assertThat(agedBrie).matches(p -> p.getSellIn() == 6 && p.getQuality() == 11);
    }
}
