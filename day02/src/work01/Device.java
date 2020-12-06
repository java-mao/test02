package work01;

public class Device {
    private String pingPai;
    private String type;
    private String kinds;
    private double price;

    public Device() {
    }

    public Device(String pingPai, String type, String kinds, double price) {
        this.pingPai = pingPai;
        this.type = type;
        this.kinds = kinds;
        this.price = price;
    }

    public String getPingPai() {
        return pingPai;
    }

    public void setPingPai(String pingPai) {
        this.pingPai = pingPai;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
