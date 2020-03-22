package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.assertj.core.api.WithAssertions;

public class ProductTest implements WithAssertions {

    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product("mock product");
    }

    @Test
    public void qualityShouldSetWhenInRange0To50() {
        product.setQuality(20);
        assertThat(product.getQuality()).isEqualTo(20);
    }

    @Test
    public void qualityShouldNotSetWhenLessThan0() {
        product.setQuality(-1);
        assertThat(product.getQuality()).isEqualTo(0);
    }

    @Test
    public void qualityShouldNotSetWhenGreaterThan50() {
        product.setQuality(51);
        assertThat(product.getQuality()).isEqualTo(0);
    }

}
