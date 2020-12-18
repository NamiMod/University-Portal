/**
 * --Admin--
 * in this class we can use admin functions in portal
 * University Portal
 * @since 2020
 * @author Seyed Nami Modarressi
 * @version 1.0
 */
import java.io.*;
import java.util.Scanner;

public class Admin {


    private File schedule;
    private File students;
    private File professors;
    private File classes;

    /**
     * create admin
     */
    public Admin() {
        schedule = new File("food_schedule.txt");
        students = new File("students_name.txt");
        professors = new File("professors.txt");
        classes = new File("classes_name.txt");
    }

    /**
     * add schedule to portal
     *
     * @param s food schedule
     * @throws IOException cant write file
     */
    public void addFoodSchedule(FoodSchedule s) throws IOException {
        try {
            FileWriter fww = new FileWriter(schedule, false);

            fww.write("");
            fww.close();

            FileWriter fw = new FileWriter(schedule, true);

            for (int i = 0; i < 5; i++) {
                fw.write(s.getFood(i).getName() + "\n" + s.getFood(i).getPrice() + '\n');
            }

            fw.close();

        } catch (IOException e) {
            System.out.println("Cant write food schedule !");
        }
    }

    /**
     * @return list of students as String
     */
    public String seeListOfStudents() throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader(students);
            Scanner getString = new Scanner(fileReader);
            String name;
            String result = "";

            while (getString.hasNextLine()) {
                result = result + getString.nextLine() + "\n";
            }
            fileReader.close();
            getString.close();
            return result;
        } catch (IOException e) {
            System.out.println("Cant read file !");
            return null;
        }
    }

    /**
     * @return list of professors as String
     */
    public String seeListOfProfessors() throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader(professors);
            Scanner getString = new Scanner(fileReader);
            String name;
            String result = "";

            while (getString.hasNextLine()) {
                result = result + getString.nextLine() + "\n";
            }
            fileReader.close();
            getString.close();
            return result;
        } catch (IOException e) {
            System.out.println("Cant read file !");
            return null;
        }
    }

    /**
     * @return list of classes as String
     */
    public String seeListOfClasses() throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader(classes);
            Scanner getString = new Scanner(fileReader);
            String name;
            String result = "";

            while (getString.hasNextLine()) {
                result = result + getString.nextLine() + "\n";
            }
            fileReader.close();
            getString.close();
            return result;
        } catch (IOException e) {
            System.out.println("Cant read file !");
            return null;
        }
    }

    /**
     * add new student if it's possible
     * @param name name of student
     * @param password of student
     * @param kind of student
     * @return it's possible or nor
     * @throws IOException when cant write in file
     */
    public boolean addStudent(String name,String password , char kind ) throws IOException {
        try {

            FileReader fr = new FileReader("students_name.txt");
            Scanner s = new Scanner(fr);
            String temp;

            while (s.hasNextLine()){
                temp = s.nextLine();
                if (temp.equals(name)){
                    return false;
                }
            }

            FileWriter fw1 = new FileWriter("students.txt", true);
            FileWriter fw2 = new FileWriter("students_name.txt", true);
            FileWriter fw3 = new FileWriter("login_data.txt", true);

            fw3.write(name + '\n' + password + '\n' + "student\n");
            fw3.close();

            fw2.write(name + '\n');
            fw2.close();

            fw1.write(name + '\n');
            fw1.write('0');
            fw1.write('\n');
            fw1.write(kind);
            fw1.write('\n');
            fw1.write('0');
            fw1.write('\n');
            fw1.write('0');
            fw1.write('\n');
            fw1.write('0');
            fw1.write('\n');
            fw1.close();
            return true;
        }catch (IOException e){
            System.out.println("Cant write !");
            return false;
        }
    }

    /**
     * add new professor if it's possible
     * @param name of professor
     * @param password of professor
     * @return possible or not
     * @throws IOException when cant read / write file
     */
    public boolean addProfessor(String name , String password) throws IOException {

        try {
            FileReader fr = new FileReader("professors.txt");
            Scanner s = new Scanner(fr);
            String temp;

            while (s.hasNextLine()){
                temp = s.nextLine();
                if (temp.equals(name)){
                    return false;
                }
            }

            FileWriter fw1 = new FileWriter("login_data.txt", true);
            FileWriter fw2 = new FileWriter("professors.txt", true);

            fw1.write(name + '\n' + password + '\n' + "professor\n");
            fw1.close();

            fw2.write(name+'\n');
            fw2.close();

            return true;

        }catch (IOException e){
            System.out.println("Cant write !");
            return false;
        }

    }


}
