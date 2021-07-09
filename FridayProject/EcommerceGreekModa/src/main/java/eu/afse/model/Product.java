package eu.afse.model;


public class Product {
    //fields
    private String name;
    private double price;
    private String description;
    private Color color;
    private int size;
    private String material;


    //constructors


    public Product() {
    }

    public Product(String name, double price, String description, Color color, int size, String material) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.color = color;
        this.size = size;
        this.material = material;
    }

    //methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", color=" + color +
                ", size=" + size +
                ", material='" + material + '\'' +
                '}';
    }



}


