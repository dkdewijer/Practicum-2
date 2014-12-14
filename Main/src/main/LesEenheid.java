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
public class LesEenheid {

    private String lesNaam;
    private int ects;
    private int studieJaar;
    public static final int MINIMAAL_CIJFER = -1;
    public static final double VOLDOENDE_CIJFER = 5.5;
    
    public LesEenheid(String lesNaam, int ects, int studieJaar) {
        this.lesNaam = lesNaam;
        this.ects = ects;
        this.studieJaar = studieJaar;
    }

    public String toString() {
    return (lesNaam + " " + ects + " " + studieJaar);
    }
}
