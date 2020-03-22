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

        product = productController.changeSellInAndQuality(product);
        assertThat(product).matches(p -> p.getSellIn() == 6 && p.getQuality() == 9);
    }

    @Test
    public void qualityShouldDecreaseOnDoubleSpeedWhenSellInLessThanOrEqualTo0() {
        Product product = new Product("mock product");
        product.setSellIn(0);
        product.setQuality(10);

        product = productController.changeSellInAndQuality(product);
        assertThat(product).matches(p -> p.getSellIn() == -1 && p.getQuality() == 8);
    }

    @Test
    public void agedBrieQualityShouldIncrease() {
        Product agedBrie = new Product("Aged Brie");
        agedBrie.setSellIn(7);
        agedBrie.setQuality(10);

        agedBrie = productController.changeSellInAndQuality(agedBrie);
        assertThat(agedBrie).matches(p -> p.getSellIn() == 6 && p.getQuality() == 11);
    }

    @Test
    public void sulfurasQualityAndSellInShouldNotChange() {
        Product sulfuras = new Product("Sulfuras");
        sulfuras.setSellIn(7);
        sulfuras.setQuality(10);

        sulfuras = productController.changeSellInAndQuality(sulfuras);
        assertThat(sulfuras).matches(p -> p.getSellIn() == 7 && p.getQuality() == 10);
    }

    @Test
    public void backstagePassQualityShouldIncrease() {
        Product backstagePass = new Product("Backstage pass");
        backstagePass.setSellIn(15);
        backstagePass.setQuality(10);

        backstagePass = productController.changeSellInAndQuality(backstagePass);
        assertThat(backstagePass).matches(p -> p.getSellIn() == 14 && p.getQuality() == 11);
    }

    @Test
    public void backstagePassQualityShouldIncreaseOnDoubleSpeedWhenSellInLessThanOrEqualTo10() {
        Product backstagePass = new Product("Backstage pass");
        backstagePass.setSellIn(10);
        backstagePass.setQuality(10);

        backstagePass = productController.changeSellInAndQuality(backstagePass);
        assertThat(backstagePass).matches(p -> p.getSellIn() == 9 && p.getQuality() == 12);
    }

    @Test
    public void backstagePassQualityShouldIncreaseOnTripleSpeedWhenSellInLessThanOrEqualTo5() {
        Product backstagePass = new Product("Backstage pass");
        backstagePass.setSellIn(5);
        backstagePass.setQuality(10);

        backstagePass = productController.changeSellInAndQuality(backstagePass);
        assertThat(backstagePass).matches(p -> p.getSellIn() == 4 && p.getQuality() == 13);
    }

    @Test
    public void backstagePassQualityShouldBe0WhenSellInLessThanOrEqualTo0() {
        Product backstagePass = new Product("Backstage pass");
        backstagePass.setSellIn(0);
        backstagePass.setQuality(10);

        backstagePass = productController.changeSellInAndQuality(backstagePass);
        assertThat(backstagePass).matches(p -> p.getSellIn() == -1 && p.getQuality() == 0);
    }
}
