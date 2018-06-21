/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import studentmanagement.Human;

/**
 *
 * @author haiph
 */
// Class Student inherits class Human.
public final class Student extends Human{
    // @ATTRIBUTES inherited from Human class : Name, Born year, Sex, ID
    // @ATTRIBUTES of Student class : Score    
    protected double Score;
    
    // @METHODS inherited form Human class : Getting and setting Name, Born year, Sex    
    // @METHODS of Student class : Getting and setting ID, Score; Showing student's info  
    public void SetScore(double score){
        this.Score = score;
    }
    public double GetScore(){
        return this.Score;
    }
    public void ShowInfo(){
        System.out.format("%-20s | %-10d | %-10s | %-10d | %-10.2f\n",this.Name,this.BornYear,((this.Sex==0)?"MALE":((this.Sex==1)?"FEMALE":"UNKNOWN")),this.ID,this.Score);
    }
	
	// @CONSTRUCTORS 
    Student(){
        this.SetName("");
        this.SetBornYear(1950);
        this.SetSex(0);
        this.SetID(0);
        this.SetScore(0);
    }    
    Student(String name){
        this.SetName(name);
        this.SetBornYear(1950);
        this.SetSex(0);
        this.SetID(0);
        this.SetScore(0);
    }    
    Student(String name, int bornyear, int sex, int id, double score){
        this.SetName(name);
        this.SetBornYear(bornyear);
        this.SetSex(sex);
        this.SetID(id);
        this.SetScore(score);
    }
}
