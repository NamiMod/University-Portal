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
     * @param s0 food name
     * @param p0 price
     * @param s1 food name
     * @param p1 price
     * @param s2 food name
     * @param p2 price
     * @param s3 food name
     * @param p3 price
     * @param s4 food name
     * @param p4 price
     * @throws IOException
     */
    public void addFoodSchedule(String s0,int p0 , String s1,int p1,String s2,int p2 , String s3,int p3 , String s4,int p4) throws IOException {
        try {
            FileWriter fww = new FileWriter(schedule, false);

            fww.write("");
            fww.close();

            FileWriter fw = new FileWriter(schedule, true);

            fw.write(s0 + "\n" + p0 + '\n');
            fw.write(s1 + "\n" + p1 + '\n');
            fw.write(s2 + "\n" + p2 + '\n');
            fw.write(s3 + "\n" + p3 + '\n');
            fw.write(s4 + "\n" + p4 + '\n');


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
