package MaxFeeCourse;
import ViewCourse.*;
import Course.Entity.*;
import java.util.List;
import java.util.ArrayList;
public class CourseControl {
	// Gọi anh bạn DAO để nhờ đi lấy dữ liệu
    private CourseDAO courseDAO = new CourseDAO();

    // --- LOGIC TÌM KHÓA HỌC ĐẮT NHẤT (MaxFeeCourse) ---
    public ResponseMaxFeeDTO MaxFeeCourse() {
        // Bước 1: Nhờ DAO lấy danh sách về
        List<Course> list = courseDAO.getAllCourses();
        
        // Kiểm tra danh sách rỗng
        if (list == null || list.isEmpty()) {
            return null; 
        }
        // Bước 2: Thuật toán tìm số lớn nhất (Max)
        // Giả định người đầu tiên là cao nhất
        Course maxCourse = list.get(0);
        
        // Chạy vòng lặp kiểm tra từng người còn lại
        for (Course c : list) {
            // Nếu tìm thấy ai có học phí cao hơn người đang giữ chức vô địch
            if (c.calculateFee() > maxCourse.calculateFee()) {
                // Thì người đó trở thành nhà vô địch mới
                maxCourse = c;
            }
        }
        
        // Bước 3: Đóng gói kết quả vào hộp DTO và trả về
        return new ResponseMaxFeeDTO (maxCourse);
    }

    // --- CÁC HÀM KHÁC (Giữ nguyên) ---
    public ResponseViewDTO viewCourseDetail(String courseCode) {
        Course c = courseDAO.getCourseByCode(courseCode);
        return (c != null) ? new ResponseViewDTO(c) : null;
    }

    public List<ResponseViewDTO> viewAllCourses() {
    	
        List<Course> list = courseDAO.getAllCourses();
        List<ResponseViewDTO> dtoList = new ArrayList<>();
        for (Course c : list) {
            dtoList.add(new ResponseViewDTO(c));
        }
        return dtoList;
    }

}
