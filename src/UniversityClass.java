/**
 * --University Class--
 * in this class we define classe for university
 * @author Seyed Nami Modarressi
 * @since 2020
 * @version 1.0
 */
import java.util.ArrayList;

public class UniversityClass {

    private String name;
    private int[] code;
    private int counter;
    private int capacity;
    private String professorName;
    // time is array for example : time[0][0] - > shanbe 8 - 10 OR time[1][2] - > yekshanbe 14 - 16 OR ...
    // time is 3*5 int array
    private int[][] time;
    private ArrayList<Student> students;

    /**
     * create new class
     *
     * @param name          of class
     * @param counter       of class
     * @param capacity      of class
     * @param professorName of class
     * @param code code of class
     * @param time          time(s) of class
     */
    public UniversityClass(String name, int counter, int capacity, String professorName,int[] code, int[][] time) {
        this.name = name;
        this.counter = counter;
        this.code = code;
        this.capacity = capacity;
        this.professorName = professorName;
        this.time = time;
        students = new ArrayList<Student>();
    }

    /**
     * @return name of class
     */
    public String getName() {
        return name;
    }

    /**
     * @return counter of class
     */
    public int getCounter() {
        return counter;
    }

    /**
     * @return capacity of class
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @return name of professor of class
     */
    public String getProfessorName() {
        return professorName;
    }

    /**
     * @return time(s) of class
     */
    public int[][] getTime() {
        return time;
    }

    public void addStudents(Student s) {
        if (capacity>0){
            students.add(s);
            capacity-=1;
        }
    }

    /**
     * remove student from class
     * @param s student
     * @return is it possible or not
     */
    public int removeStudents(Student s) {
        int temp=-1;
        int i=0;
        for (Student e : students){
            if (e.getname().equals(s.getname())){
                temp = i;
                break;
            }else {
                i++;
            }
        }
        if (temp != -1){
            students.remove(temp);
            return 1;
        }
        return 0;
    }

    /**
     * get students of class
     * @return students list
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * @return code of class
     */
    public int[] getCode() {
        return code;
    }
}
