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
public class Vak extends LesEenheid {

    private double cijfer;
    
            
    public Vak(String lesNaam, int ects, int studieJaar) {
        super(lesNaam, ects, studieJaar);
        this.cijfer = MINIMAAL_CIJFER;
    }

    public Vak(String lesNaam, int ects, int studieJaar, double cijfer) {
        super(lesNaam, ects, studieJaar);
        setCijfer(cijfer);
    }

    public String toString() {
        return this.cijfer + " " + super.toString();
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }
    public boolean isGehaald(){
        return this.cijfer >= VOLDOENDE_CIJFER; 
    }
}
