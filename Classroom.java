public class Classroom extends Room {
    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public String getClassroomDescription() {
        return classroomDescription;
    }

    @Override  // I did this shortcut by alt + insert//
    public String toString() {
        return "Classroom{" +
                "classroomName='" + classroomName + '\'' +
                ", classroomDescription='" + classroomDescription + '\'' +
                '}';
    }

    public void setClassroomDescription(String classroomDescription) {
        this.classroomDescription = classroomDescription;

    }

    public String classroomName;
    public String classroomDescription; // variables //


    Classroom(){} // default constructors//

    Classroom(String classroomName, String classroomDescription) {
        this.classroomName =classroomName;
        this.classroomDescription=classroomDescription;

    }
}
