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

    @Override
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
    public String classroomDescription;


    Classroom(){}

    Classroom(String classroomName, String classroomDescription) {
        this.classroomName =classroomName;
        this.classroomDescription=classroomDescription;
system.out.println("Modified file"); #prat
    }
    System.out.println("Mary");
}


