/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdatabasejpa;

import java.util.List;

/**
 *
 * @author Akiparn
 */
public class StudentDatabaseJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student std1 = new Student(1, "John", 12345.0);
       Student std2 = new Student(2, "Marry", 45678.0);
      // StudentTable.insertStudent(std1);
      //StudentTable.insertStudent(std2);
       
       Student std;
       std = StudentTable.findStudentById(1);
       if (std != null) {
           std.setName("Jack");
           //StudentTable.removeStudent(std);
           StudentTable.updateStudent(std);
       }
       List<Student> stdList = StudentTable.findStudentByName("Marry"); 
       //List<Student> stdList = StudentTable.findAllStudent();
       printAllStudent(stdList);
    }
    public static void printAllStudent(List<Student> studentList) {
        for(Student std : studentList) {
           System.out.print(std.getId() + " ");
           System.out.print(std.getName() + " ");
           System.out.println(std.getGpa()+ " ");
       }
    }
    
}
