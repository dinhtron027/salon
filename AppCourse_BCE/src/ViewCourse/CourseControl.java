package ViewCourse;
import java.util.ArrayList;
import java.util.List;
import Course.Entity.*;
	public class CourseControl {
		// 1. Khởi tạo DAO (Người lấy dữ liệu)
	    private CourseDAO courseDAO = new CourseDAO();

	    // 2. Hàm xem chi tiết
	    public ResponseViewDTO viewCourseDetail(String courseCode) {
	        // Gọi hàm tìm kiếm bên DAO (Đã viết sẵn logic an toàn bên đó)
	        Course course = courseDAO.getCourseByCode(courseCode);
	        
	        // Kiểm tra nếu tìm thấy
	        if (course != null) {
	            return new ResponseViewDTO(course);
	        }
	        
	        // Không thấy trả về null
	        return null;
	    }
	}
