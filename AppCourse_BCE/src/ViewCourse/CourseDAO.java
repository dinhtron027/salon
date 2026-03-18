package ViewCourse;
import java.util.List;
import Course.Entity.*;
import AppCourse.BCE.FakeCourseDatabase;
public class CourseDAO {
    
    // Tìm khóa học theo mã
    public Course getCourseByCode(String code) {
        for (Course c : FakeCourseDatabase.courses) {
            if (c.getCourseCode().equalsIgnoreCase(code)) {
                return c;
            }
        }
        return null;
    }

    // Lấy tất cả khóa học
    public List<Course> getAllCourses() {
        return FakeCourseDatabase.courses;
    }
}