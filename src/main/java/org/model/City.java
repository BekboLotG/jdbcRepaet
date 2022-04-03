package org.model;

public class City {
    private int id;
    private String name;
    private String location;
    private String sight;
    private int area;
    private int population;

    public City() {

    }

    public City(String name, String location, String sight, int area, int population) {
        this.name = name;
        this.location = location;
        this.sight = sight;
        this.area = area;
        this.population = population;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSight() {
        return sight;
    }

    public void setSight(String sight) {
        this.sight = sight;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", sight='" + sight + '\'' +
                ", area=" + area +
                ", population=" + population +
                '}';
    }
}
