package Course.Entity;

public class InpersonCourse extends Course {
    private double roomFee;

    public InpersonCourse(String CourseCode, int credits, double roomFee) {
        super(CourseCode, credits);
        this.roomFee = roomFee;
    }

    @Override
    public double calculateFee() {
        return credits * 700 + roomFee;
    }
    public String getType() {
        return "Inperson";
    }
}
