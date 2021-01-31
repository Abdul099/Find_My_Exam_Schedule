import java.io.IOException;
import java.util.ArrayList;

public class Backend {
    private String csvFile;
    private csvReader reader;
    private ExamSchedule listOfExams;
    public Backend(csvReader reader){
        this.reader = reader;
        listOfExams = new ExamSchedule();
    }

    public boolean verifycourse(String course, String section) throws IOException {
        if(course.trim().equals("") || section.trim().equals("")) return false; //check if empty input
        return reader.checkifCourseExists(course, section);
    }

    public String findOutputListToUI(ArrayList<String> list_of_classes, ArrayList<String> listOfSections) throws IOException {
        for(int i=0; i<list_of_classes.size(); i++){
        Exam exam =  reader.searchCourseList(list_of_classes.get(i), listOfSections.get(i));
        listOfExams.addExam(exam);
        }
        String output = listOfExams.printSchedule();
        System.out.print(output);
        return output;
    }
}
