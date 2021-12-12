package org.zup.paulo.comicsmanager.representations.response;

public class ComicPrice {

    private String type; // A description of the price (e.g. print price, digital price).,
    private Float price; // The price (all prices in USD).

    public String getType() {
        return type;
    }

    public Float getPrice() {
        return price;
    }
}
