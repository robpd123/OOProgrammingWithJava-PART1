/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comet
 */
public class Student {
    private String name;
    private String studentNumber;

    
    public Student(String newName, String newStudentNumber){
        this.name = newName;
        this.studentNumber = newStudentNumber;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getStudentNumber(){
        return this.studentNumber;
    }
    
    public String toString(){
        return this.name + " (" + this.studentNumber + ")";
    }
    
}
