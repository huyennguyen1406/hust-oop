public class Rooms {
    public Rooms(double v, String s) {
    }

    public static void main(String[] args) {
        Rooms r = new Rooms(100.0, "701");
        System.out.println("Name: " + r.getName());
        System.out.println("Dien tich:" + r.getArea());
    }

    private String getName() {
        return null;
    }

    private String getArea() {
        return null;
    }

}

class Room {
    private Double area;
    private String name;

    public Room() {
    }

    public Room(Double area, String name) {
        this.area = area;
        this.name = name;
    }

    public Double getArea() {
        return this.area;
    }

    public String getName() {
        return this.name;
    }

}
