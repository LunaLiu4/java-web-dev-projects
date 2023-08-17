package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Please enter the student name(or ENTER to finish): ");

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();
            if(!newStudent.equals("")){
                System.out.println("ID: ");
                Integer newID = input.nextInt();
                students.put(newStudent,newID);

                input.nextLine();
            }
        }while(!newStudent.equals("") );
        input.close();

        System.out.println("\nClass roster:");
        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getValue() + " 's ID:" + student.getKey());
        }
        System.out.println("Number of student in roster: " + students.size());
    }
}
