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

    public String printSchedule(){
        String output = "";
        //Iterator<Exam> it = examList.iterator();
        //int i = 1;
        for(int i=0; i<this.examList.size(); i++)
        {
            Exam exam = this.examList.get(i);
            System.out.println(this.examList.size());
            output += "Exam #" + i + ": " + exam.getCourse() + "-" + exam.getSection() + ", " + exam.getTitle() + "\n";
            output+="Course name: " + exam.getTitle() + "\n";
            output+="Date and time: " + exam.getDate() + ", " + exam.getTime() + "\n";
            output+="Location: " + exam.getPlace() + "\n";
            output+="\n=========================================\n\n";
            i++;
        }
        return output;
    }
}
