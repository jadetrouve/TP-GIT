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
 private int capacity;

 /**
 * Create a LabClass with a maximum number of enrolments. All other details are set to default values.
 */
 public LabClass(int maxNumberOfStudents)
 {
 instructeur3 = "ce que vous voulez";
 room = " mettez ce que vous voulez ";
 timeAndDay = " Mercredi 18 Novembre ";
 students = new ArrayList<Student>();
 capacity = maxNumberOfStudents;
 }
}