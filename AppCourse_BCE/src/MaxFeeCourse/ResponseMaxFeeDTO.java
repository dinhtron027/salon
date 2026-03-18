package MaxFeeCourse;
import Course.Entity.Course;
	public class ResponseMaxFeeDTO {
	    public String code;
	    public String type;
	    public double maxFee; // Đặt tên maxFee cho rõ nghĩa

	    public ResponseMaxFeeDTO(Course c) {
	        this.code = c.getCourseCode();
	        this.type = c.getType();
	        this.maxFee = c.calculateFee();
	    }
	    public String getcode() {
	    	return code;
	    }
	    public String gettype() {
	    	return type;
	    }
	    public double getmaxFee() {
	    	return maxFee;
	    }
	}
