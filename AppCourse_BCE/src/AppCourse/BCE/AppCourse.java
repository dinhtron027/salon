package AppCourse.BCE;

import java.util.List;
import java.util.Scanner;

// --- IMPORT CÁC DTO ---
import ViewCourse.ResponseViewDTO;
import PrintAllCourses.ResponsePrintAllDTO;
import MaxFeeCourse.ResponseMaxFeeDTO;

// --- IMPORT CÁC UI (GIAO DIỆN) ---
// Đảm bảo bạn đã tạo các file UI này trong đúng package
import AppCourse.BCE.ResultCourseViewUI;     // UI Xem chi tiết
import AppCourse.BCE.ResultCoursePrintUI; // UI In danh sách
import AppCourse.BCE.ResultCourseMaxUI;      // UI Tìm Max

// --- IMPORT CÁC CONTROL RIÊNG BIỆT ---
// Vì các class đều tên là "CourseControl", ta dùng tên đầy đủ (Full name)
// để tránh trùng lặp khi khai báo bên dưới.

public class AppCourse {

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        // --- KHỞI TẠO 3 BỘ ĐIỀU KHIỂN RIÊNG BIỆT ---
        // 1. Control chuyên xử lý in danh sách (Dùng cho Hint và Case 2)
        PrintAllCourses.CourseControl printControl = new PrintAllCourses.CourseControl();

        // 2. Control chuyên xử lý xem chi tiết (Dùng cho Case 1)
        ViewCourse.CourseControl viewControl = new ViewCourse.CourseControl();

        // 3. Control chuyên xử lý tìm Max (Dùng cho Case 3)
        // (Giả sử bạn đã tạo class này trong package MaxFeeCourse)
        MaxFeeCourse.CourseControl maxControl = new MaxFeeCourse.CourseControl();

        while (true) {
            System.out.println("\n========================================");
            System.out.println("      HỆ THỐNG QUẢN LÝ KHÓA HỌC");
            System.out.println("========================================");

            // --- PHẦN GỢI Ý: HIỂN THỊ CÁC MÃ KHÓA HỌC ---
            // Sử dụng printControl để lấy danh sách
            List<ResponsePrintAllDTO> hintList = printControl.viewAllCourses();
            
            System.out.println(">>> Các mã môn học khả dụng:");
            System.out.print("[ ");
            if (hintList != null) {
                for (int i = 0; i < hintList.size(); i++) {
                    // Lưu ý: DTO in danh sách dùng thuộc tính .code
                    System.out.print(hintList.get(i).code);
                    
                    if (i < hintList.size() - 1) {
                        System.out.print(", ");
                    }
                    if ((i + 1) % 5 == 0 && i < hintList.size() - 1) {
                        System.out.print("\n  ");
                    }
                }
            }
            System.out.println(" ]");
            System.out.println("----------------------------------------");

            // --- MENU CHÍNH ---
            System.out.println("1. Xem chi tiết khóa học (Theo mã)");
            System.out.println("2. In danh sách tất cả khóa học");
            System.out.println("3. Tìm khóa học có học phí cao nhất");
            System.out.println("0. Thoát");
            System.out.print(">>> Mời nhập lựa chọn: ");
            
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("!!! Lỗi: Vui lòng chỉ nhập số (0-3).");
                continue;
            }

            // --- XỬ LÝ LỰA CHỌN ---
            switch (choice) {
            case 1:
                System.out.print("Nhập mã khóa học (VD: JAVA01): ");
                String code = scanner.nextLine().trim();
                
                ResponseViewDTO detailResult = viewControl.viewCourseDetail(code);
                
                if (detailResult != null) {
                    // Biến đối tượng đơn thành List chứa 1 phần tử
                    java.util.List<ResponseViewDTO> singleList = java.util.Collections.singletonList(detailResult);
                    ResultCourseViewUI.displayList(singleList);
                } else {
                    System.out.println(">>> KHÔNG TÌM THẤY khóa học có mã: " + code);
                }
                break;

                case 2:
                    // CASE 2: Dùng printControl
                    List<ResponsePrintAllDTO> listResult = printControl.viewAllCourses();
                    
                    // Giả sử bạn có class UI tên là ResultCoursePrintUI để in bảng
                    ResultCoursePrintUI.displayList(listResult);
                    break;

                case 3:
                    // CASE 3: Dùng maxControl
                    ResponseMaxFeeDTO maxResult = maxControl.MaxFeeCourse();
                    
                    if (maxResult != null) {
                        // 2. Sửa lỗi cú pháp: Gọi hàm display() và truyền biến kết quả vào trong ngoặc
                        ResultCourseMaxUI.display(maxResult); 
                    } else {
                         System.out.println(">>> Danh sách rỗng.");
                    }
                    break;

                case 0:
                    System.out.println("Đã thoát chương trình. Tạm biệt!");
                    scanner.close();
                    return;

                default:
                    System.out.println("!!! Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}