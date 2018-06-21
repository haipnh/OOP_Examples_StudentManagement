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
public class Human {
    // @ATTRIBUTES
    protected String Name;  // i.e : "John". (SHOULD NOT BE LONGER THAN 20 CHARACTERS (20 is optional)) 
    protected int BornYear; // i.e : 1980
    protected int Sex;      // 0 is MALE, 1 is FEMALE, 2 is UNKNOWN
	protected int ID;		// i.e : 15119001
    // @METHODS
    public void SetName(String name){
        this.Name = name;
    }
    public String GetName(){
        return this.Name;
    }    
    public void SetBornYear(int bornyear){
        this.BornYear = bornyear;
    }
    public int GetBornYear(){
        return this.BornYear;
    }    
    public void SetSex(int sex){
        this.Sex = sex;
    }
    public int GetSex(){
        return this.Sex;
    }
	public void SetID(int id){
        this.ID = id;    }
    public int GetID(){
        return this.ID;
    }  
	// @CONSTRUCTORS
	Human(){
		this.SetName("");
        this.SetBornYear(1950);
        this.SetSex(0);
        this.SetID(0);
	}
}
