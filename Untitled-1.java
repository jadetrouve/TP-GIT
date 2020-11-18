import java.util.*;
/**
* The LabClass class represents an enrolment list for one lab class. It stores the time, room and participants
* of the lab, as well as the instructor's name.
*/
public class LabClass
{
 private String instructeur3;
 private String room;
 private String timeAndDay;
 private List<Student> students;
 private int length;

 /**
 * Create a LabClass with a maximum number of enrolments. All other details are set to default values.
 */
 public LabClass(int nbStudMax)
 {
 instructeur3 = "ce que vous voulez";
 room = " mettez ce que vous voulez ";
 timeAndDay = " mettez ce que vous voulez ";
 students = new ArrayList<Student>();
 length = nbStudMax;
 }
}