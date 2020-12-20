/**
 * --Professor--
 * in this class we can use professor's functions in portal
 * University Portal
 * @since 2020
 * @author Seyed Nami Modarressi
 * @version 1.0
 */
import java.io.*;
import java.util.Scanner;

public class Professor {

    private File classes;

    /**
     * create new Professor
     */
    public Professor() {
        classes = new File("classes.txt");
    }

    /**
     * create new class
     *
     * @param name          of class
     * @param counter       of class
     * @param capacity      of class
     * @param professorName of class
     * @param time          of class
     * @return possible or not
     * @throws IOException when cant write in file
     */
    public boolean addClass(String name, String counter, String capacity, String professorName, int[][] time) throws IOException {

        try {
            FileReader fr = new FileReader("classes_name.txt");

            Scanner s = new Scanner(fr);
            String temp;

            while (s.hasNextLine()) {
                temp = s.nextLine();
                if (temp.equals(name)) {
                    return false;
                }
            }

            FileWriter fw1 = new FileWriter("classes_name.txt", true);
            FileWriter fw2 = new FileWriter(classes, true);

            fw1.write(name + '\n');
            fw1.close();

            fw2.write(name + '\n');
            fw2.write(counter + '\n');
            fw2.write(capacity + '\n');
            fw2.write(professorName + '\n');
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 3; j++) {
                    fw2.write("" + time[i][j] + '\n');
                }
            }
            fw2.close();

            return true;
        } catch (IOException e) {
            System.out.println("Cant write !");
            return false;
        }
    }

    /**
     * close class
     *
     * @param name of the class
     * @return possible or not
     */
    public boolean closeClass(String name) throws IOException {

        try {
            FileWriter fww = new FileWriter("temp.txt", false);
            fww.write("");
            fww.close();
                FileReader fr3 = new FileReader("classes.txt");
                Scanner getString3 = new Scanner(fr3);
                FileWriter fw3 = new FileWriter("temp.txt", true);

                String[] u = new String[19];

                while (getString3.hasNextLine()) {

                    for (int i = 0; i < 19; i++) {
                        u[i] = getString3.nextLine();
                    }
                    if (!(u[0].equals(name))) {
                        for (int i = 0; i < 19; i++) {
                            fw3.write(u[i] + '\n');
                        }
                    }
                }
                fr3.close();
                getString3.close();
                fw3.close();
                FileWriter copy2 = new FileWriter("classes.txt", false);
                FileReader fileReader4 = new FileReader("temp.txt");
                Scanner getString4 = new Scanner(fileReader4);

                while (getString4.hasNextLine()) {
                    copy2.write(getString4.nextLine() + '\n');
                }
                copy2.close();
                fileReader4.close();
                getString4.close();

                return true;

        } catch (IOException e) {
            System.out.println("Cant write !");
            return false;
        }
    }

    /**
     * see list of students for Professor
     *
     * @param professorName professor name
     * @return list as String
     * @throws FileNotFoundException cant read file
     */
    public String getStudents(String professorName) throws FileNotFoundException {

        try {
            FileReader fileReader = new FileReader("students.txt");

            Scanner getString = new Scanner(fileReader);

            String name;
            String credit;
            String kind;
            String grade;
            String courseCounter;
            String classCounter;
            String className;
            String result = "";

            while (getString.hasNextLine()) {

                name = getString.nextLine();
                credit = getString.nextLine();
                kind = getString.nextLine();
                grade = getString.nextLine();
                courseCounter = getString.nextLine();
                classCounter = getString.nextLine();
                String t1;
                String t2;
                for (int i = 0; i < Integer.parseInt(classCounter); i++) {
                    t1 = getString.nextLine();
                    t2 = getString.nextLine();
                    if (t2.equals(professorName)) {
                        result = result + t1 + '\n' + name + '\n';
                    }
                }
            }
            fileReader.close();
            getString.close();
            return result;
        } catch (IOException e) {
            System.out.println("Cant read!");
            return null;
        }

    }

    /**
     * get class of professor
     * @param name name of professor
     * @return list of classes
     * @throws FileNotFoundException when cant read file
     */
    public String getClasses(String name) throws FileNotFoundException {

        try {
            FileReader f = new FileReader("classes.txt");

            Scanner s = new Scanner(f);
            String n;
            String capacity;
            String counter;
            String proname;
            String k;
            String result = "";

            while (s.hasNextLine()) {
                n = s.nextLine();
                counter = s.nextLine();
                capacity = s.nextLine();
                proname = s.nextLine();
                for (int i = 0; i < 15; i++) {
                    k = s.nextLine();
                }

                if (name.equals(proname)) {
                    result = result + n + '\n';
                }
            }
            return result;
        }catch (IOException e){
            System.out.println("Cant read file !");
            return null;
        }

    }

}
