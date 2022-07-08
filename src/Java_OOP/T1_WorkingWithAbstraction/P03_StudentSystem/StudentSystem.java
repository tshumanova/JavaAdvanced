package Java_OOP.T1_WorkingWithAbstraction.P03_StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentsByName;

    public StudentSystem() {
        this.studentsByName = new HashMap<>();
    }

    public Map<String, Student> getStudentsByName() {
        return this.studentsByName;
    }

    public void ParseCommand(String[] args) {


        String command = args[0];

        String name=args[1];

        if (command.equals("Create")) {
                     int age = Integer.parseInt(args[2]);
            Double grade = Double.parseDouble(args[3]);

            if (!studentsByName.containsKey(name)) {
                var student = new Student(name, age, grade);
                studentsByName.put(name, student);
            }
        } else if (command.equals("Show")) {

                Student student= studentsByName.get(name);

            if (student !=null) {
                System.out.println(student.getInfo());
            }

        }else{
            throw new IllegalArgumentException("Unknown command"+command);
        }
    }
}