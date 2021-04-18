package ru.netology.domain;

public class Geo {
    private String type; //  тип места
    private String coordinates; //  координаты места
    private Place place; // описание места (если оно добавлено)

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
