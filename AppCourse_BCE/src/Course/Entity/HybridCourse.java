package Course.Entity;

public class HybridCourse extends Course {
    private double techFee;
    private double roomFee;

    public HybridCourse(String CourseCode, int credits, double techFee, double roomFee) {
        super(CourseCode, credits);
        this.techFee = techFee;
        this.roomFee = roomFee;
    }

    @Override
    public double calculateFee() {
        return credits * 600 + techFee + roomFee;
    }
    public String getType() {
        return "Hybrid";
    }
}
