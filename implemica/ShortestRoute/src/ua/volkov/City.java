package ua.volkov;

public class City {

    private int id;
    private String name;
    private int[][] routes;

    public City(int id, String name, int[][] routes){
        this.id = id;
        this.name = name;
        this.routes = routes;
    }

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

    public int[][] getRoutes() {
        return routes;
    }
}
