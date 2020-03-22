package cn.xpbootcamp.gilded_rose;

import static java.util.Objects.isNull;

public class ProductController {

    public Product changeSellInAndQuality(Product product) {
        if (isNull(product)) {
            return null;
        }

        int rate = 1; //每天减少多少价值
        int sellIn = product.getSellIn();
        int quality = product.getQuality();

        switch (product) {
            case AGED_BRIE:
                quality = quality + rate;
                sellIn = sellIn - 1;
                break;
            case BACKSTAGE_PASS:
                quality = changeBackstagePassQuality(sellIn, quality, rate);
                sellIn = sellIn - 1;
                break;
            case NORMAL_PRODUCT:
                quality = changeNormalProductQuality(sellIn, quality, rate);
                sellIn = sellIn - 1;
            default:
                break;
        }

        product.setSellIn(sellIn);
        product.setQuality(quality);
        return product;
    }

    private int changeBackstagePassQuality(int sellIn, int quality, int rate) {
        if (sellIn > 10) {
            quality = quality + rate;
        }
        else if (sellIn > 5) {
            quality = quality + rate * 2;
        }
        else if (sellIn > 0) {
            quality = quality + rate * 3;
        }
        else {
            quality = 0;
        }
        return quality;
    }

    private int changeNormalProductQuality(int sellIn, int quality, int rate) {
        if (sellIn > 0) {
            quality = quality - rate;
        }
        else {
            quality = quality - rate * 2;
        }
        return quality;
    }
}
