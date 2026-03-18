package AppCourse.BCE;
import MaxFeeCourse.ResponseMaxFeeDTO;
public class ResultCourseMaxUI {
    public static void display(ResponseMaxFeeDTO dto) { // <--- Đổi tham số ở đây
        if (dto == null) {
            System.out.println("Dữ liệu rỗng.");
            return;
        }
        System.out.println("\n********************************************");
        System.out.println("   KHÓA HỌC CÓ HỌC PHÍ CAO NHẤT ");
        System.out.println("********************************************");
        System.out.println("   MÃ KHÓA HỌC : " + dto.code);
        System.out.println("   LOẠI HÌNH   : " + dto.type);
        System.out.printf("    TỔNG HỌC PHÍ: $%.2f\n", dto.maxFee);
        System.out.println("********************************************\n");
    }
}


