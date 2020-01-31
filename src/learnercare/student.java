/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnercare;

/**
 *
 * @author medoo
 */
class student {
    private int USN;
    private String OptionalCourse, Semester, FirstName, MiddleName, LastName;
    public student(int USN, String OptionalCourse, String Semester, String FirstName, String MiddleName, String LastName ){
        this.USN = USN;
        this.OptionalCourse=OptionalCourse;
        this.FirstName=FirstName;
        this.Semester=Semester;
        this.MiddleName= MiddleName;
        this.LastName=LastName;
    }
    public int getUSN(){
    return USN;
}
    public String getOptionalCourse(){
        return OptionalCourse;
    }
    public String getFirstName(){
        return FirstName;
    }
    public String getSemester(){
        return Semester;
        
    }
    public String getMiddleName(){
        return MiddleName;
    }
    public String getLastName(){
        return LastName;
    }
}
