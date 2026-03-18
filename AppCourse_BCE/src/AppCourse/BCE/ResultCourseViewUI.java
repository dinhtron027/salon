package AppCourse.BCE;

import java.util.List;
import ViewCourse.ResponseViewDTO; // Import rõ ràng class DTO

public class ResultCourseViewUI {

    // Nhận vào List<ResponseViewDTO>
    public static void displayList(List<ResponseViewDTO> list) {
        
        // 1. Kiểm tra danh sách rỗng
        if (list == null || list.isEmpty()) {
            System.out.println(">>> Danh sách trống!");
            return;
        }

        // 2. In tiêu đề bảng
        System.out.println("\n--- DANH SÁCH TẤT CẢ KHÓA HỌC ---");
        // %-10s: Căn lề trái, độ rộng 10 ký tự
        System.out.printf("| %-10s | %-10s | %-10s | %-15s |\n", "MÃ", "LOẠI", "TÍN CHỈ", "HỌC PHÍ");
        System.out.println("----------------------------------------------------------");
        
        // 3. Duyệt danh sách
        for (ResponseViewDTO dto : list) {
            
            // LƯU Ý QUAN TRỌNG: 
            // Cần đảm bảo bên class ResponseViewDTO tên biến là 'code' (hoặc bạn phải sửa ở đây thành dto.Code nếu giữ nguyên cũ)
            System.out.printf("| %-10s | %-10s | %-10d | %-15.2f |\n", 
            		dto.getCode(), 
                    dto.getType(), 
                    dto.getCredits(), 
                    dto.getTotalFee());
        }
        System.out.println("----------------------------------------------------------");
    }
}