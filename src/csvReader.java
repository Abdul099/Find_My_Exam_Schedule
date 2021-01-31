import java.io.*;
import java.util.*;

public class csvReader {
    //TODO: You can use this class to read the csv - or you can use the backend class - up to you :)

    /* Few things to consider when accessing csv file:
    - Whatever cell you decide to check in the csv, always check that it's not empty. If its empty then you can print an error in the output
    - Some courses can have different exam locations for the same section (see biol 306). Students are divided based on last name.
      In that case, we can print out both options (we're not gonna ask for the student's name)
     */

    public static Exam searchCourseCsv(String courseCode, String courseSection) throws IOException {

        File csvFile = new File("/Users/beyzayildirim/Downloads/Find_My_Exam_Schedule-main/src/data.csv");
        if (!csvFile.isFile()) {
            System.out.println("File's not here");
        }

        BufferedReader csvReader = new BufferedReader(new FileReader("/Users/beyzayildirim/Downloads/Find_My_Exam_Schedule-main/src/data.csv"));
        String line = csvReader.readLine();
        //Exam anExam;

        while (line != null) {
            String[] row = line.split(",");

            //for(int i =0; i<928; i++){
            if (row[0].equals(courseCode) && row[1].equals(courseSection)) {
                Exam anExam = new Exam(row[0], row[1], row[2], row[3], row[4], row[4].concat(" ".concat(row[5])));
                return anExam;
            }
            // }

        }
        csvReader.close();
        return null;
    }
}