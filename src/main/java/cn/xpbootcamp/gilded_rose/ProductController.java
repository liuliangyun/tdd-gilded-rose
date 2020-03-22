package cn.xpbootcamp.gilded_rose;

public class ProductController {

    public Product decreaseSellInAndQuality(Product product) {
        int sellIn = product.getSellIn();
        int quality = product.getQuality();
        product.setSellIn(sellIn - 1);
        product.setQuality(quality - 1);
        return product;
    }
}
