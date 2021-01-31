import java.io.*;
import java.net.URL;
import java.util.*;

public class csvReader {
    private File csvFile;
    private String path;
    public csvReader(String path){
        this.path = path;
        URL fileUrl = getClass().getResource(path);
        csvFile = new File(fileUrl.getFile());
        if (!csvFile.isFile()) {
            System.out.println("File's not here");
        }
    }

    public Exam searchCourseList(String courseCode, String courseSection) throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader(this.csvFile));
        String line;
        while ((line= csvReader.readLine()) != null) {
            String[] row = line.split(",");
            String rowCourseNum = row[0].replaceAll(" ", "").toLowerCase();
            String rowCourseSec = row[1].replaceAll("0", "").toLowerCase();
            courseCode = courseCode.replaceAll(" ", "").toLowerCase();
            if (rowCourseNum.equals(courseCode) && rowCourseSec.equals(courseSection.replaceAll("0", ""))) {
                Exam anExam = new Exam(row[0], row[1], row[2], row[3], row[4], row[5]);
                return anExam;
            }

        }
        csvReader.close();
        return null;
    }
    public boolean checkifCourseExists(String courseCode, String courseSection) throws IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader(this.csvFile));
        String line;
        while ((line= csvReader.readLine()) != null) {
            String[] row = line.split(",");
            String rowCourseNum = row[0].replaceAll(" ", "").toLowerCase();
            String rowCourseSec = row[1].replaceAll("0", "").toLowerCase();
            courseCode = courseCode.replaceAll(" ", "").toLowerCase();
            if (rowCourseNum.equals(courseCode) && rowCourseSec.equals(courseSection.replaceAll("0", ""))) {
                return true;
            }
        }
        csvReader.close();
        return false;
    }
}