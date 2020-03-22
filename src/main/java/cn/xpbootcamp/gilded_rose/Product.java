package cn.xpbootcamp.gilded_rose;

public enum  Product {
    NORMAL_PRODUCT("Normal product"),
    AGED_BRIE("Aged Brie"),
    SULFURAS("Sulfuras"),
    BACKSTAGE_PASS("Backstage pass");

    private String name;
    private int quality;
    private int sellIn;

    Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        if (quality >= 0 && quality <= 50) {
            this.quality = quality;
        }
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }
}
