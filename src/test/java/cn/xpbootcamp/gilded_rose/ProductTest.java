package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import org.assertj.core.api.WithAssertions;

public class ProductTest implements WithAssertions {

    @Test
    public void qualityShouldSetWhenInRange0To50() {
        Product product = new Product("mock product");
        product.setQuality(20);
        assertThat(product.getQuality()).isEqualTo(20);
    }

}
