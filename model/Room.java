package model;

public class Room{

    public String name;
    public int chairs;
    public int totalChairs;

    public Room() {}
    public Room(String name, int chairs, int totalChairs) {
        this.name = name;
        this.chairs = chairs;
        this.totalChairs = totalChairs;
    }
    public String toString(){//overriding the toString() method
        return "Room class: Room Name = "+name+"; chairs = "+chairs+"; Total Chairs = "+totalChairs +"\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }

    public int getTotalChairs() {
        return totalChairs;
    }

    public void setTotalChairs(int totalChairs) {
        this.totalChairs = totalChairs;
    }

    public void room() {}
}
