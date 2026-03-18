package AppCourse.BCE;
import java.util.List;
import PrintAllCourses.ResponsePrintAllDTO;
public class ResultCoursePrintUI {
	// ... (Giữ nguyên hàm display hiển thị 1 cái) ...

    // --- BỔ SUNG CHO CHỨC NĂNG IN DANH SÁCH ---
    public static void displayList(List<ResponsePrintAllDTO> list) {
        if (list.isEmpty()) {
            System.out.println(">>> Danh sách trống!");
            return;
        }

        System.out.println("\n------------------------------------------------------------------");
        System.out.println("                   DANH SÁCH TẤT CẢ KHÓA HỌC                      ");
        System.out.println("------------------------------------------------------------------");
        // Định dạng cột: %-10s (Canh trái 10 ký tự), %-15s (Canh trái 15), %.2f (Số thực 2 số lẻ)
        System.out.printf("| %-10s | %-15s | %-10s | %-15s |\n", 
                          "MÃ CODE", "LOẠI HÌNH", "TÍN CHỈ", "HỌC PHÍ ($)");
        System.out.println("------------------------------------------------------------------");

        for (ResponsePrintAllDTO dto : list) {
            System.out.printf("| %-10s | %-15s | %-10d | $%-14.2f |\n", 
                              dto.getCode(), 
                              dto.getType(), 
                              dto.getCredits(), 
                              dto.getfee());
        }
        System.out.println("------------------------------------------------------------------");
    }
}
