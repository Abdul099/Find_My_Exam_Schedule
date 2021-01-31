import java.util.*;

public class ExamSchedule {

    private ArrayList<Exam> examList = new ArrayList<>();

    public ExamSchedule(){
    }

    public void addExam(Exam exam) {
        examList.add(exam);
    }

    public ArrayList<Exam> getList() {
        return this.examList;
    }

    public void printSchedule(){
        Iterator<Exam> it = examList.iterator();
        int i = 1;
        while (it.hasNext())
        {
            Exam exam = it.next();
            System.out.print("Exam #" + i + ": " + exam.getCourse() + "-" + exam.getSection() + ", " + exam.getTitle() + "\n");
            System.out.print("Course name: " + exam.getTitle() + "\n");
            System.out.print("Date and time: " + exam.getDate() + ", " + exam.getTime() + "\n");
            System.out.print("Location: " + exam.getPlace() + "\n");
            System.out.print("\n=========================================\n\n");
            i++;
        }
    }
}
