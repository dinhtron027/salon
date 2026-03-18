package Course.Entity;

public abstract class Course {
    protected String CourseCode;
    protected int credits;

    public Course(String code, int credits) {
        this.CourseCode = code;
        this.credits = credits;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public int getCredits() {
        return credits;
    }

    public abstract double calculateFee();
    public abstract String getType();

    // Xuất 1 dòng theo dạng bảng
    
    public String toTableRow() {
        return String.format(
            "%-15s\t%-10s\t%-10d\t%-10.2f",
            CourseCode,
            getType(),
            credits,
            calculateFee()
        );
    }
}