package Class21HwComputer;


class Computer {
    String brand;
    String model;
    int year;
    double price;

    public Computer(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void printInfo() {
        System.out.println(brand + " " + model + " " + year + " " + price);
    }

    void turnOn() {
        System.out.println("Turning on ");
    }

    void turnOff() {
        System.out.println("Turning off ");
    }

    void useKeyboard() {
        System.out.println("Using keyboard on ");
    }
}

class Apple extends Computer {
    public Apple(String brand, String model, int year, double price) {
        super(brand, model, year, price);
    }

    void turnOn() {
        System.out.println("Booting up ");
    }

    void turnOff() {
        System.out.println("Using AirDrop on ");
    }
}

class Lenovo extends Computer {
    private String color;

    public Lenovo(String brand, String model, int year, double price, String color) {
        super(brand, model, year, price);
        this.color = color;
    }

    void turnOff() {
        System.out.println("Shutting down ");
    }

    void useTrackPoint() {
        System.out.println("Using TrackPoint on ");
    }
}

class HP extends Computer {
    private String processor;

    public HP(String brand, String model, int year, double price, String processor) {
        super(brand, model, year, price);
        this.processor = processor;
    }

    void useTouchscreen() {
        System.out.println("Using touchscreen on ");
    }
}

class Dell extends Computer {
    private String warranty;

    public Dell(String brand, String model, int year, double price, String warranty) {
        super(brand, model, year, price);
        this.warranty = warranty;
    }
    void useStylus() {
        System.out.println("Using stylus on ");
    }
}

