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
public class Project extends LesEenheid {

    private double productCijfer;
    private double procesCijfer;
    private double methodenEnTechniekenCijfer;

    public Project(String lesNaam, int ects, int studieJaar) {
        super(lesNaam, ects, studieJaar);
        this.productCijfer = MINIMAAL_CIJFER;
        this.procesCijfer = MINIMAAL_CIJFER;
        this.methodenEnTechniekenCijfer = MINIMAAL_CIJFER;
    }

    public Project(String lesNaam, int ects, int studieJaar, double productCijfer, double procesCijfer, double methodenEnTechniekenCijfer) {
        super(lesNaam, ects, studieJaar);
        this.productCijfer = productCijfer;
        this.procesCijfer = procesCijfer;
        this.methodenEnTechniekenCijfer = methodenEnTechniekenCijfer;
    }

    public String toString() {
        return this.productCijfer + " " + this.procesCijfer + " " + this.methodenEnTechniekenCijfer + " " + super.toString();
    }

    public void setproductCijfer(double productCijfer) {
        this.productCijfer = productCijfer;
    }

    public void setprocesCijfer(double procesCijfer) {
        this.procesCijfer = procesCijfer;
    }

    public void setmethodenEnTechniekenCijfer(double methodenEnTechniekenCijfer) {
        this.methodenEnTechniekenCijfer = methodenEnTechniekenCijfer;
    }
     public boolean isGehaald(){
        return this.productCijfer >= VOLDOENDE_CIJFER && this.procesCijfer >= VOLDOENDE_CIJFER && this.methodenEnTechniekenCijfer >= VOLDOENDE_CIJFER; 
    }
}
