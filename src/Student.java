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
     *
     * @param studentName name of student
     * @param x           amount of credit
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
        } catch (IOException e) {
            System.out.println("Cant read or write files !");
        }

    }

    /**
     * reserve food
     *
     * @param studentName name of student
     * @param x           price of food
     * @return possible or not
     * @throws IOException when cant read or write in file
     */
    public boolean foodReserve(String studentName, int x) throws IOException {
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

                if (name.equals(studentName) && kind.equals("0")) {
                    if (Integer.parseInt(credit) > x) {
                        result = Integer.parseInt(credit) - x;
                        flag = true;
                        break;
                    }
                }
                if (name.equals(studentName) && kind.equals("1")) {
                    if (Integer.parseInt(credit) > x) {
                        result = Integer.parseInt(credit) - x/2;
                        flag = true;
                        break;
                    }
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

        } catch (IOException e) {
            System.out.println("Cant read or write files !");
            return false;
        }

    }

    /**
     * get list of classes
     *
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
        } catch (IOException e) {
            System.out.println("Cant get list !");
            return null;
        }
    }


    /**
     * get capacity of class
     * @param name of class
     * @param proName professor name
     * @return capacity
     * @throws IOException when cant read file
     */
    public int getCapacity(String name , String proName) throws IOException {
        FileReader fr = new FileReader("classes.txt");
        Scanner s = new Scanner(fr);
        String[] u = new String[19];

        while (s.hasNextLine()){
            for(int i = 0 ; i < 19 ; i++){
                u[i] = s.nextLine();
            }
            if (u[0].equals(name) && u[3].equals(proName)){
                return Integer.parseInt(u[2]);
            }
        }
        fr.close();
        s.close();
        return -1;
    }
    public void capacityDown(String name , String proName){
    }

    /**
     * add class to student
     *
     * @param studentName    name of student
     * @param classNameToAdd class name
     * @param professorName  professor of class
     * @throws IOException when cant read file
     */
    public void addClass(String studentName, String classNameToAdd, String professorName) throws IOException {


        if (getCapacity(classNameToAdd,professorName) > 0) {
            capacityDown(classNameToAdd, professorName);

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
                int result2 = 0;
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
                        result = 1 + Integer.parseInt(classCounter);
                        result2 = Integer.parseInt(courseCounter) + getCounter(name);
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
                    fw.write(credit + '\n');
                    kind = getString2.nextLine();
                    fw.write(kind + '\n');
                    grade = getString2.nextLine();
                    fw.write(grade + '\n');
                    courseCounter = getString2.nextLine();
                    if (name.equals(studentName)) {
                        fw.write("" + result2 + '\n');
                    } else {
                        fw.write(courseCounter + '\n');
                    }
                    classCounter = getString2.nextLine();
                    if (name.equals(studentName)) {
                        fw.write("" + result + '\n');
                    } else {
                        fw.write(classCounter + '\n');
                    }
                    String t1;
                    String t2;
                    for (int i = 0; i < Integer.parseInt(classCounter); i++) {
                        t1 = getString2.nextLine();
                        fw.write(t1 + '\n');
                        t2 = getString2.nextLine();
                        fw.write(t2 + '\n');
                    }
                    if (name.equals(studentName)) {
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
            } catch (IOException e) {
                System.out.println("Cant read or write file !");
            }
        }
    }

    /**
     * return counter of course
     * @param className name of class
     * @return counter
     * @throws IOException when cant read file
     */
    public int getCounter(String className) throws IOException {
        FileReader fileReader = new FileReader("classes.txt");
        Scanner getString = new Scanner(fileReader);
        String name;
        String counter="";
        String capacity;
        String professorName;
        String t;
        while(getString.hasNextLine()){

            name = getString.nextLine();
            counter = getString.nextLine();
            capacity = getString.nextLine();
            professorName = getString.nextLine();

            for ( int i = 0 ; i < 15 ; i++){
                t = getString.nextLine();
            }

            if (name.equals(className)){
                break;
            }

        }
        fileReader.close();
        getString.close();
        return Integer.parseInt(counter);
    }

    /**
     * update grade
     * @param studentName name of student
     * @param newGrade new grade
     * @param counter counter of course
     */
    public void updateGrade(String studentName , float newGrade , int counter){

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
            float result = 0;
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
                    result = (Float.parseFloat(grade)*Integer.parseInt(courseCounter) + newGrade * counter)/(counter+Integer.parseInt(courseCounter));
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
                fw.write(credit + '\n');
                kind = getString2.nextLine();
                fw.write(kind + '\n');
                grade = getString2.nextLine();
                if (name.equals(studentName)){
                    fw.write(""+ result + '\n');
                }else {
                    fw.write(grade + '\n');
                }
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
        } catch (IOException e) {
            System.out.println("Cant read or write files !");
        }
    }

    /**
     * set new grade
     * @param names students and classes
     * @param grades grades
     * @throws IOException when cant read file
     */
    public void setGrades(String names , String grades) throws IOException {

        FileWriter copy1 = new FileWriter("grade1.txt", false);
        FileWriter copy2 = new FileWriter("grade2.txt", false);
        copy1.write(names);
        copy2.write(grades);
        copy1.close();
        copy2.close();

        FileReader fileReader1 = new FileReader("grade1.txt");
        Scanner getString1 = new Scanner(fileReader1);
        FileReader fileReader2 = new FileReader("grade2.txt");
        Scanner getString2 = new Scanner(fileReader2);

        String course;
        String studentName;
        String grade;

        while (getString1.hasNextLine()){

            course = getString1.nextLine();
            studentName = getString1.nextLine();
            grade = getString2.nextLine();
            updateGrade(studentName,Float.parseFloat(grade),getCounter(course));

        }
        fileReader1.close();
        fileReader2.close();
        getString1.close();
        getString2.close();

    }

    /**
     * get grade of student
     * @param studentName name of student
     * @return grade
     * @throws IOException when cant read file
     */
    public float getGrade(String studentName) throws IOException {
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
        int result2 = 0;
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
                return Float.parseFloat(grade);
            }
        }
        fileReader.close();
        getString.close();
        return -1;
    }

    /**
     * get credit of student
     * @param studentName name of student
     * @return credit
     * @throws IOException when cant read file
     */
    public int getCredit(String studentName) throws IOException {
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
        int result2 = 0;
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
                return Integer.parseInt(credit);
            }
        }
        fileReader.close();
        getString.close();
        return -1;
    }

    /**
     * get class counter of student
     * @param studentName name of student
     * @return counter
     * @throws IOException when cant read file
     */
    public int getClassCounter(String studentName) throws IOException {
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
        int result2 = 0;
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
                return Integer.parseInt(classCounter);
            }
        }
        fileReader.close();
        getString.close();
        return -1;
    }

    /**
     * get kind of student
     * @param studentName name of student
     * @return kind of student
     * @throws IOException when cant read file
     */
    public int getKind(String studentName) throws IOException {
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
        int result2 = 0;
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
                if (Float.parseFloat(grade) >= 17){
                    return 1;
                }else {
                    return Integer.parseInt(kind);
                }
            }
        }
        fileReader.close();
        getString.close();
        return -1;
    }


}
