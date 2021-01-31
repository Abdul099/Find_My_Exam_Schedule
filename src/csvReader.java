import java.io.*;
import java.net.URL;
import java.util.*;

public class csvReader {
    //TODO: You can use this class to read the csv - or you can use the backend class - up to you :)

    /* Few things to consider when accessing csv file:
    - Whatever cell you decide to check in the csv, always check that it's not empty. If its empty then you can print an error in the output
    - Some courses can have different exam locations for the same section (see biol 306). Students are divided based on last name.
      In that case, we can print out both options (we're not gonna ask for the student's name)
     */
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
        String line = csvReader.readLine();
        //Exam anExam;

        while ((line= csvReader.readLine()) != null) {
            String[] row = line.split(",");
            String rowCourseNum = row[0].replaceAll(" ", "").toLowerCase();
            String rowCourseSec = row[1].replaceAll("0", "");
            if (rowCourseNum.equals(courseCode.toLowerCase()) && rowCourseSec.equals(courseSection.replaceAll("0", ""))) {
                Exam anExam = new Exam(row[0], row[1], row[2], row[3], row[4], row[4].concat(" ".concat(row[5])));
                return anExam;
            }
            // }

        }
        csvReader.close();
        return null;
    }
}