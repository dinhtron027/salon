package Course.Entity;

public class OnlineCourse extends Course {
    private double techFee;

    public OnlineCourse(String CourseCode, int credits, double techFee) {
        super(CourseCode, credits);
        this.techFee = techFee;
    }
    public String getType() {
        return "Online";
    }
    @Override
    public double calculateFee() {
        return credits * 500 + techFee;
    }
}