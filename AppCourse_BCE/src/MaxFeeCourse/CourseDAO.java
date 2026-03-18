package MaxFeeCourse;
import java.util.List;

import AppCourse.BCE.FakeCourseDatabase;
import Course.Entity.Course;

public class CourseDAO {

	// Hàm này dùng cho chức năng 1: Tìm theo mã
    public Course getCourseByCode(String code) {
        for (Course c : FakeCourseDatabase.courses) {
            if (c.getCourseCode().equalsIgnoreCase(code)) {
                return c;
            }
        }
        return null;
    }
    // Hàm này dùng cho chức năng 2 & 3: Lấy tất cả
    // (Để tìm Max Fee, ta cần lấy tất cả về rồi mới so sánh)
    public List<Course> getAllCourses() {
        return FakeCourseDatabase.courses;
    }
}
