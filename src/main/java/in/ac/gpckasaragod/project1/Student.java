/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.ac.gpckasaragod.project1;

/**
 *
 * @author student
 */
public class Student extends Person{
    
    private Department department;

    public Student(String name, int Age) {
        super.setName(name);
        super.setAge(Age);
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }
}
