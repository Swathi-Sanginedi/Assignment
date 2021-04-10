package model;

public class Classroom extends Room{
    public String classroomName;
    public String classroomDescription;

    public Classroom() {}

    public Classroom(String classroomName, String classroomDescription) {
        this.classroomName = classroomName;
        this.classroomDescription = classroomDescription;
    }

    public String toString(){//overriding the toString() method
        return super.toString() + "classroom class : classroom Name:" +classroomName+" classroom Description"+classroomDescription;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public String getClassroomDescription() {
        return classroomDescription;
    }

    public void setClassroomDescription(String classroomDescription) {
        this.classroomDescription = classroomDescription;
    }

    public void classroom() {
        super.room();
    }
}
