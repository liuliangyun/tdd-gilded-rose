package cn.xpbootcamp.gilded_rose;

public class ProductController {

    public Product decreaseSellInAndQuality(Product product) {
        int rate = 1; //每天减少多少价值

        int sellIn = product.getSellIn();
        int quality = product.getQuality();
        if (sellIn > 0) {
            quality = quality - rate;
        } else {
            quality = quality - rate * 2;
        }
        product.setSellIn(sellIn - 1);
        product.setQuality(quality);
        return product;
    }
}
