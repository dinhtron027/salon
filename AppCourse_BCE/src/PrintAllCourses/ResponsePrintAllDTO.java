package PrintAllCourses;
import Course.Entity.Course;
public class ResponsePrintAllDTO {
	public String code;
    public String type;
    public int credits;
    public double fee;

    public ResponsePrintAllDTO(Course c) {
        this.code = c.getCourseCode();
        this.type = c.getType();
        this.credits = c.getCredits();
        this.fee = c.calculateFee();
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

    public double getfee() {
        return fee;
    }
}
