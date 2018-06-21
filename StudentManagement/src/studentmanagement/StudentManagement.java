/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

/**
 *
 * @author haiph
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentList StudentList_KMT17 = new StudentList();
        StudentList_KMT17.AddStudent(new Student("Ng.M. Anh",1999,0,17119001,8.3));
        StudentList_KMT17.AddStudent(new Student("Ng.Ph.H. An",1999,2,17119002,7.9));
        StudentList_KMT17.AddStudent(new Student("Ng.L.Q. Bao",1999,1,17119005,8.2));
        StudentList_KMT17.ShowList();
        System.out.println("Searching for \"Trinh\"");
        Student student = StudentList_KMT17.GetStudentByName("Trinh");
        if(student!=null) 
            student.ShowInfo();
        else 
            System.out.println("Student not found");
        System.out.println("Searching for \"Ng.M. Anh\"");
        student = StudentList_KMT17.GetStudentByName("Ng.M. Anh");
        if(student!=null) 
            student.ShowInfo();
        else 
            System.out.println("Student not found");
        System.out.println("Removing \"Ng.Ph.H. An\" from list");
        StudentList_KMT17.RemoveStudentByName("Ng.Ph.H. An");
        StudentList_KMT17.ShowList();
    }    
}
