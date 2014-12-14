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
public class ProfessionalSkills extends LesEenheid {

    private boolean gehaald;
    private static final boolean GEHAALD_DEFAULT = false;

    public ProfessionalSkills(String lesNaam, int ects, int studieJaar) {
        super(lesNaam, ects, studieJaar);
        this.gehaald = GEHAALD_DEFAULT;
    }

    public ProfessionalSkills(String lesNaam, int ects, int studieJaar, boolean gehaald) {
        super(lesNaam, ects, studieJaar);
        this.gehaald = gehaald;
    }

    public String toString() {
        return this.gehaald + " " + super.toString();
    }

    public void setGehaald(boolean gehaald) {
        this.gehaald = gehaald;
    }
     public boolean isGehaald(){
     return this.gehaald;
     }
}
