package lesson3;

public class Product {
        private String name;
        private String productionData;
        private String manufacturer;
        private String countryOrOrigin;
        private double price;
        private boolean buyersBookingStatus;

    public Product(String name, String productionData, String manufacturer, String countryOrOrigin, double price, boolean buyersBookingStatus) {
        this.name = name;
        this.productionData = productionData;
        this.manufacturer = manufacturer;
        this.countryOrOrigin = countryOrOrigin;
        this.price = price;
        this.buyersBookingStatus = buyersBookingStatus;
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productionData=" + productionData +
                ", manufacturer='" + manufacturer + '\'' +
                ", countryOrOrigin='" + countryOrOrigin + '\'' +
                ", price=" + price +
                ", buyersBookingStatus=" + buyersBookingStatus +
                '}';
    }
    public void print (){
        System.out.println(this);
    }
}