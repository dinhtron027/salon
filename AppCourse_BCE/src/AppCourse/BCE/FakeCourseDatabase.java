package AppCourse.BCE;
import java.util.ArrayList;
import java.util.List;
import Course.Entity.*;
public class FakeCourseDatabase {
	
	public static List<Course> courses = new ArrayList<>();

    static {
        // Dữ liệu mẫu (Giả lập database có sẵn)
        courses.add(new OnlineCourse("JAVA01", 3, 20));       
        courses.add(new InpersonCourse("MATH02", 4, 50));    
        courses.add(new HybridCourse("AI03", 3, 30, 40));    
        courses.add(new OnlineCourse("WEB04", 2, 10));
        courses.add(new OnlineCourse("PYTHON05", 3, 15));
        courses.add(new InpersonCourse("DSA06", 4, 60)); 
        courses.add(new HybridCourse("NET07", 3, 25, 35)); 
        courses.add(new InpersonCourse("DB08", 3, 45)); 
        courses.add(new OnlineCourse("CLOUD09", 3, 100)); 
        courses.add(new HybridCourse("SEC10", 4, 50, 60)); 
        courses.add(new OnlineCourse("ENG11", 2, 10)); 
        courses.add(new InpersonCourse("GRAPH12", 3, 80)); 
        courses.add(new HybridCourse("SAD13", 3, 20, 20)); 
        courses.add(new OnlineCourse("PHIL14", 2, 5));
        courses.add(new HybridCourse("CYBER15", 3, 40, 50));    
        courses.add(new OnlineCourse("ML16", 4, 45));         
        courses.add(new InpersonCourse("IOT17", 3, 70));       
        courses.add(new OnlineCourse("BLOCK18", 3, 60));        
        courses.add(new HybridCourse("UIUX19", 2, 15, 25));     
        courses.add(new OnlineCourse("MKT20", 3, 12));          
        courses.add(new InpersonCourse("ACC21", 4, 40));       
        courses.add(new HybridCourse("FIN22", 3, 30, 30));      
        courses.add(new OnlineCourse("MAN23", 2, 10));         
        courses.add(new InpersonCourse("HRM24", 3, 35));        
        courses.add(new InpersonCourse("JPN25", 4, 55));       
        courses.add(new OnlineCourse("FRE26", 3, 20));         
        courses.add(new HybridCourse("KOR27", 3, 25, 25));      
        courses.add(new InpersonCourse("CHI28", 4, 50));        
        courses.add(new HybridCourse("PHY29", 3, 20, 40));      
        courses.add(new InpersonCourse("CHEM30", 3, 65));       
        courses.add(new OnlineCourse("BIO31", 2, 15));          
        courses.add(new HybridCourse("STAT32", 3, 35, 35));     
        courses.add(new InpersonCourse("CALC33", 4, 45));      
        courses.add(new OnlineCourse("ASTRO34", 2, 25));
    }
}