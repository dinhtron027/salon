package PrintAllCourses;
import AppCourse.BCE.FakeCourseDatabase;
import java.util.List;
import Course.Entity.*;
public class CourseDAO {    
    // ... (Giữ nguyên các hàm cũ như getCourseByCode) ...
   // --- BỔ SUNG CHO CHỨC NĂNG IN DANH SÁCH ---
    public List<Course> getAllCourses() {
        // Trả về toàn bộ danh sách đang có trong FakeDatabase
        return FakeCourseDatabase.courses;
    }

	public Course getCourseByCode(String code) {
		return null;
	}
}