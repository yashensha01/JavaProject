/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.ac.gpckasaragod.project1;

/**
 *
 * @author student
 */
public class Program2 {
    public static void main(String args[]){
        Department department = new Department("Computer engineeering");
        Student student = new Student ("ABCD",23);
        student.setDepartment(department);
        System.out.println("STUDENT DETAILS");
        System.out.println("*****************");
        System.out.println("Name"+student.getName());
        System.out.println("Age"+student.getAge());
        System.out.println("Department"+student.getDepartment());
        
    }
}
