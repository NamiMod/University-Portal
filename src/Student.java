/**
 * --Student--
 * in this class we can use student's functions in portal
 * University Portal
 * @since 2020
 * @author Seyed Nami Modarressi
 * @version 1.0
 */
import java.io.*;
import java.util.Scanner;

public class Student {

    /**
     * add credit to student
     * @param studentName name of student
     * @param x amount of credit
     * @throws IOException when cant read or write file
     */
    public void addCredit(String studentName, int x) throws IOException {

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
            int result = 0;
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
                }

                if (name.equals(studentName)) {
                    result = x + Integer.parseInt(credit);
                    break;
                }
            }
            fileReader.close();
            getString.close();

            FileReader fr = new FileReader("students.txt");
            Scanner getString2 = new Scanner(fr);

            FileWriter fww = new FileWriter("temp.txt", false);
            fww.write("");
            fww.close();
            FileWriter fw = new FileWriter("temp.txt", true);

            while (getString2.hasNextLine()) {

                name = getString2.nextLine();
                fw.write(name + '\n');
                credit = getString2.nextLine();
                if (name.equals(studentName)) {
                    fw.write("" + result + '\n');
                } else {
                    fw.write(credit + '\n');
                }
                kind = getString2.nextLine();
                fw.write(kind + '\n');
                grade = getString2.nextLine();
                fw.write(grade + '\n');
                courseCounter = getString2.nextLine();
                fw.write(courseCounter + '\n');
                classCounter = getString2.nextLine();
                fw.write("" + classCounter + '\n');
                String t1;
                String t2;
                for (int i = 0; i < Integer.parseInt(classCounter); i++) {
                    t1 = getString2.nextLine();
                    fw.write(t1 + '\n');
                    t2 = getString2.nextLine();
                    fw.write(t2 + '\n');
                }

            }

            fw.close();
            fr.close();
            getString2.close();


            FileWriter copy = new FileWriter("students.txt", false);
            FileReader fileReader3 = new FileReader("temp.txt");
            Scanner getString3 = new Scanner(fileReader3);

            while (getString3.hasNextLine()) {
                copy.write(getString3.nextLine() + '\n');
            }

            copy.close();
            fileReader3.close();
            getString3.close();
        }catch (IOException e){
            System.out.println("Cant read or write files !");
        }

        }

    /**
     * reserve food
     * @param studentName name of student
     * @param x price of food
     * @return possible or not
     * @throws IOException when cant read or write in file
     */
        public boolean foodReserve(String studentName , int x)throws IOException{
            try {
                FileReader fileReader = new FileReader("students.txt");

                Boolean flag = false;
                Scanner getString = new Scanner(fileReader);
                String name;
                String credit;
                String kind;
                String grade;
                String courseCounter;
                String classCounter;
                String className;
                int result = 0;
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
                    }

                    if (name.equals(studentName)) {
                        if (Integer.parseInt(credit) > x)
                        result = Integer.parseInt(credit) - x ;
                        flag = true;
                        break;
                    }
                }
                fileReader.close();
                getString.close();

                FileReader fr = new FileReader("students.txt");
                Scanner getString2 = new Scanner(fr);

                FileWriter fww = new FileWriter("temp.txt", false);
                fww.write("");
                fww.close();
                FileWriter fw = new FileWriter("temp.txt", true);

                while (getString2.hasNextLine()) {

                    name = getString2.nextLine();
                    fw.write(name + '\n');
                    credit = getString2.nextLine();
                    if (name.equals(studentName)) {
                        fw.write("" + result + '\n');
                    } else {
                        fw.write(credit + '\n');
                    }
                    kind = getString2.nextLine();
                    fw.write(kind + '\n');
                    grade = getString2.nextLine();
                    fw.write(grade + '\n');
                    courseCounter = getString2.nextLine();
                    fw.write(courseCounter + '\n');
                    classCounter = getString2.nextLine();
                    fw.write("" + classCounter + '\n');
                    String t1;
                    String t2;
                    for (int i = 0; i < Integer.parseInt(classCounter); i++) {
                        t1 = getString2.nextLine();
                        fw.write(t1 + '\n');
                        t2 = getString2.nextLine();
                        fw.write(t2 + '\n');
                    }

                }

                fw.close();
                fr.close();
                getString2.close();


                FileWriter copy = new FileWriter("students.txt", false);
                FileReader fileReader3 = new FileReader("temp.txt");
                Scanner getString3 = new Scanner(fileReader3);

                while (getString3.hasNextLine()) {
                    copy.write(getString3.nextLine() + '\n');
                }

                copy.close();
                fileReader3.close();
                getString3.close();

                return flag;

            }catch (IOException e){
                System.out.println("Cant read or write files !");
                return false;
            }

        }

    /**
     * get list of classes
     * @param studentName name of student
     * @return list as string
     * @throws FileNotFoundException cant read file
     */
        public String listOfClasses(String studentName) throws FileNotFoundException {
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
                    if (name.equals(studentName)) {
                        for (int i = 0; i < Integer.parseInt(classCounter); i++) {
                            t1 = getString.nextLine();
                            t2 = getString.nextLine();
                            result = result + t1 + "-" + t2 + '\n';
                        }
                    } else {
                        for (int i = 0; i < Integer.parseInt(classCounter); i++) {
                            t1 = getString.nextLine();
                            t2 = getString.nextLine();
                        }
                    }
                }
                return result;
            }catch (IOException e){
                System.out.println("Cant get list !");
                return null;
            }
        }

        public void addClass(String studentName , String classNameToAdd , String professorName) throws IOException {

            FileReader fileReader = new FileReader("students.txt");

            Scanner getString = new Scanner(fileReader);
            String name;
            String credit;
            String kind;
            String grade;
            String courseCounter;
            String classCounter;
            String className;
            int result = 0;
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
                }

                if (name.equals(studentName)) {
                    result = 1 + Integer.parseInt(credit);
                    break;
                }
            }
            fileReader.close();
            getString.close();

            FileReader fr = new FileReader("students.txt");
            Scanner getString2 = new Scanner(fr);

            FileWriter fww = new FileWriter("temp.txt", false);
            fww.write("");
            fww.close();
            FileWriter fw = new FileWriter("temp.txt", true);

            while (getString2.hasNextLine()) {

                name = getString2.nextLine();
                fw.write(name + '\n');
                credit = getString2.nextLine();
                if (name.equals(studentName)) {
                    fw.write("" + result + '\n');
                } else {
                    fw.write(credit + '\n');
                }
                kind = getString2.nextLine();
                fw.write(kind + '\n');
                grade = getString2.nextLine();
                fw.write(grade + '\n');
                courseCounter = getString2.nextLine();
                fw.write(courseCounter + '\n');
                classCounter = getString2.nextLine();
                fw.write("" + classCounter + '\n');
                String t1;
                String t2;
                for (int i = 0; i < Integer.parseInt(classCounter); i++) {
                    t1 = getString2.nextLine();
                    fw.write(t1 + '\n');
                    t2 = getString2.nextLine();
                    fw.write(t2 + '\n');
                }
                if (name.equals(studentName)){
                    fw.write(classNameToAdd + '\n');
                    fw.write(professorName + '\n');
                }

            }

            fw.close();
            fr.close();
            getString2.close();


            FileWriter copy = new FileWriter("students.txt", false);
            FileReader fileReader3 = new FileReader("temp.txt");
            Scanner getString3 = new Scanner(fileReader3);

            while (getString3.hasNextLine()) {
                copy.write(getString3.nextLine() + '\n');
            }

            copy.close();
            fileReader3.close();
            getString3.close();


        }



}
