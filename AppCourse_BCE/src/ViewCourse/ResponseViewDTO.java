package ViewCourse;
import Course.Entity.*;

public class ResponseViewDTO {
	// 2. Private fields for encapsulation
    private String code; // 3. camelCase naming (was Code)
    private String type;
    private int credits;
    private double totalFee;

    public ResponseViewDTO(Course c) {
        this.code = c.getCourseCode();
        this.type = c.getType();
        this.credits = c.getCredits();
        this.totalFee = c.calculateFee();
    }

    // 4. Getters to access the data
    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public int getCredits() {
        return credits;
    }

    public double getTotalFee() {
        return totalFee;
    }
}