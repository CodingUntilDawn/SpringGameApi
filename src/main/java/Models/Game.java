package Models;

public class Game {
    private int id;
    private String name;
    private String genra;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenra() {
        return genra;
    }

    public void setGenra(String genra) {
        this.genra = genra;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
