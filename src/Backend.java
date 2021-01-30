import java.util.ArrayList;

public class Backend {
    private String csvFile;
    public Backend(){
    }
    public boolean verifyclass(String course){
        if(course.equals("comp551")) return false;//also a placeholder, we must check if course number and section exist
        return true;
    }
    public String findOutputListToUI(ArrayList<String> list_of_classes){
        //this is just a filler for now, we need to change it once the backend is functional
        String dummyOutput = "";
        for(int i=0; i<list_of_classes.size(); i++){
            dummyOutput+=list_of_classes.get(i);
        }
        return dummyOutput;
    }
}
