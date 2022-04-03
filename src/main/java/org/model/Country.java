package org.model;

public class Country {
    private int id;
    private String state;
    private String type;
    private String headOfState;
    private long population;

    public Country() {
    }

    public Country(String state, String type, String headOfState, long population) {
        this.state = state;
        this.type = type;
        this.headOfState = headOfState;
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", type='" + type + '\'' +
                ", headOfState='" + headOfState + '\'' +
                ", population=" + population +
                '}';
    }
}
