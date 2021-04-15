package model;

public class Lab extends Room {

    public int labNumber;

    public Lab() {}

    public int getLabNumber() {
        return labNumber;
    }

    public void setLabNumber(int labNumber) {
        this.labNumber = labNumber;
    }

    public Lab(int labNumber) {
        this.labNumber = labNumber;
    }
    public String toString(){//overriding the toString() method
        return super.toString() + "Lab Class : Lab number =  "+labNumber;
    }

    public void lab() {
        super.room();
    }

}
