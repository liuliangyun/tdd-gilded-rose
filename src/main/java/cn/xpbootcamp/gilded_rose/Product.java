package cn.xpbootcamp.gilded_rose;

public class Product {

    private String name;
    private int quality;

    public Product(String name) {
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
}
