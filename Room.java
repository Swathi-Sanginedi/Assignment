//Jaimin
public class Room {
    public String getName() {
        return name;
    }

    public int getChairs() {
        return chairs;
    }

    public int getTotalChairs() {
        return totalChairs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }

    public void setTotalChairs(int totalChairs) {
        this.totalChairs = totalChairs;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", chairs=" + chairs +
                ", totalChairs=" + totalChairs +
                '}';
    }

    public String name;
    public int chairs;
    public int totalChairs;

    Room(){}

    Room(String name, int chairs, int totalChairs) {
        this.name =name;
        this.chairs=chairs;
        this.totalChairs=totalChairs;
    }





}
