package PrintAllCourses; // Tên package theo file của bạn

import ViewCourse.*;
import Course.Entity.*;
import MaxFeeCourse.ResponseMaxFeeDTO;
import PrintAllCourses.CourseDAO;
import java.util.ArrayList;
import java.util.List;

public class CourseControl {
    private CourseDAO courseDAO = new CourseDAO();

    // --- 1. SỬA CHỨC NĂNG IN DANH SÁCH (Dùng ResponsePrintAllDTO) ---
    public List<ResponsePrintAllDTO> viewAllCourses() {
        List<Course> listEntity = courseDAO.getAllCourses();
        List<ResponsePrintAllDTO> listDTO = new ArrayList<>();
        
        if (listEntity != null) {
            for (Course c : listEntity) {
                // Đóng gói vào DTO mới dành riêng cho Print All
                listDTO.add(new ResponsePrintAllDTO(c));
            }
        }
        return listDTO;
    }

    // --- 2. SỬA CHỨC NĂNG TÌM MAX (Dùng ResponseMaxFeeDTO) ---
    public ResponseMaxFeeDTO findHighestFeeCourse() {
        List<Course> list = courseDAO.getAllCourses();
        if (list == null || list.isEmpty()) return null;

        Course maxCourse = list.get(0);
        for (Course c : list) {
            if (c.calculateFee() > maxCourse.calculateFee()) {
                maxCourse = c;
            }
        }
        
        // Đóng gói vào DTO mới dành riêng cho Max Fee
        return new ResponseMaxFeeDTO(maxCourse);
    }
    
    // ... (Hàm viewCourseDetail giữ nguyên dùng ResponseViewDTO cũ) ...
    public ResponseViewDTO viewCourseDetail(String code) {
         Course c = courseDAO.getCourseByCode(code);
         return (c != null) ? new ResponseViewDTO(c) : null;
    }
}