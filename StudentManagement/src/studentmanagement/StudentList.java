/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.util.ArrayList;

/**
 *
 * @author haiph
 */
public class StudentList {
    // @ATTRIBUTES
    private ArrayList<Student> _StudentList;
    // @CONSTRUCTORS
    public StudentList(){
        _StudentList = new ArrayList<Student>();
    }
    // @METHODS
    public void AddStudent(Student student){
        _StudentList.add(student);
    }
    public void AddStudent(String name){
        Student student = new Student(name);
        _StudentList.add(student);
    }
    public void AddStudent(String name, int bornyear, int sex, int id, double score){
        Student student = new Student(name,bornyear,sex,id,score);
        _StudentList.add(student);
    }     
    public Student GetStudentByName(String name){
        if(!_StudentList.isEmpty( )){
            for(Student student : _StudentList){
                if (student.GetName().equals(name))
                    return student;
            }            
        }
        return null;
    }
    public void RemoveStudentByName(String name){
        if(!_StudentList.isEmpty( )){
            for(Student student : _StudentList){
                if (student.GetName().equals(name))
                    _StudentList.remove(student);
            }
        }
    }
    public void ShowList(){
        int index=0;
        System.out.println("                 =====STUDENT MANAGEMENT=====");
        System.out.format("%-5s | %-20s | %-10s | %-10s | %-10s | %-10s\n","Index","Name","Born year","Sex","ID","Score");
        for(int i = 0 ; i < 75; i++)
            System.out.print("=");
        System.out.println();
        if(!_StudentList.isEmpty( )){            
            for(Student student : _StudentList){
                System.out.format("%-5d | ",index+1);
                student.ShowInfo();
                index++;
            }
        }
        System.out.println("                    =====END OF LIST=====");
    }
}
