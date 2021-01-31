import java.util.ArrayList;

public class Backend {
    private String csvFile;

    public Backend(){
    }
    //TODO: Check if the course number and section are in the csv, if they are --> return true
    public boolean verifycourse(String course, String section){
        if(course.trim().equals("") || section.trim().equals("")) return false; //check if empty input
        if(course.equals("comp551")) return false;//also a placeholder, we must check if course number and section exist in csv
        return true;
    }
    /*
    TODO: You have 2 parallel lists of course number& section. For each index (course number&section), we want to find the exam
          information. The output will be a large string that lists on each line the name of the course and the corresponding exam info
     */
    public String findOutputListToUI(ArrayList<String> list_of_classes, ArrayList<String> listOfSections){
        //this is just a filler for now, we need to change it once the backend is functional
        String dummyOutput = "";
        for(int i=0; i<list_of_classes.size(); i++){
            dummyOutput+=list_of_classes.get(i);
        }
        return dummyOutput;
    }
}
