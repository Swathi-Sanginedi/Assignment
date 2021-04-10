public class Lab extends Room {
    public int getLabNumber() {
        return labNumber;
    }

    public void setLabNumber(int labNumber) {
        this.labNumber = labNumber;
    }

    public int labNumber;
    int i;

    @Override
    public String toString() {
        return "Lab{" +
                "labNumber=" + labNumber +
                '}';
    }

    Lab(){ }
    Lab(int labNumber)
    {
        this.labNumber = labNumber;
system.out.println("Modified lab file");
    }
}
