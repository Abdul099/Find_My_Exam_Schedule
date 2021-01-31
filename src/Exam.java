import java.util.Comparator;

public class Exam {

    private String Course;
    private String Section;
    private String Title;
    private String Date;
    private String Time;
    private String Place = "Not Available Yet";

    public Exam(String Course, String Section, String Title, String Date, String Time, String Place) {
        this.Course = Course;
        this.Section = Section;
        this.Title = Title;
        this.Date = Date;
        this.Time = Time;
        this.Course = Course;
        this.Place = Place;
    }

    public String getCourse() {
        return this.Course;
    }

    public String getSection() {
        return this.Section;
    }

    public String getTitle() {
        return this.Title;
    }

    public String getDate() {
        return this.Date;
    }

    public String getTime() {
        return this.Time;
    }

    public String getPlace() {
        return this.Place;
    }

    public void setCourse(String s) {
        this.Course = s;
    }

    public void setSection(String s) {
        this.Section = s;
    }

    public void setDate(String s) {
        this.Date = s;
    }

    public void setTitle(String s) {
        this.Title = s;
    }

    public void setPlace(String s) {
        this.Place = s;
    }

}