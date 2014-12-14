/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Dees
 */
public class Groep {
private String groepNaam;
private static final int MAXSTUDENTEN = 30;
private int aantalStudenten = 0; 
private Student[] studentenLijst;

public Groep(String naam){
this.groepNaam = naam;
this.studentenLijst = new Student[MAXSTUDENTEN];
}
public void voegStudentToe(Student student){
if(this.aantalStudenten < MAXSTUDENTEN){
this.studentenLijst[aantalStudenten++] = student;
}
else{ 
    System.err.println("Je kan niet meer studenten toevoegen");
}
}
public String toString(){
String studenten = "";
for(int i = 0; i < this.aantalStudenten; i++){
studenten = studenten + "\n" + this.studentenLijst[i].toString();
}
return this.groepNaam + "\t" + studenten;
}
}
