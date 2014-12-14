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
public class Main {

    public static void main(String[] args) {
        /**
        Adres adresTest = new Adres("meeh", "skuurt", "12");
        System.out.println(adresTest.toString());

        Student studentTest = new Student("dees", "de Wijer", adresTest);
        Student nieuwStudent = new Student("niels", "meeh", adresTest);
        System.out.println(studentTest.toString());

        Groep groepTest = new Groep("IS106");
        groepTest.voegStudentToe(studentTest);
        groepTest.voegStudentToe(nieuwStudent);
        System.out.println(groepTest.toString());
        */
        
        LesEenheid test = new LesEenheid("meeeeeh", 2, 2);
        System.out.println(test.toString());
        
        Vak test2 = new Vak("meeeh", 5, 3, 5);
        test2.setCijfer(8);
        System.out.println(test2.toString() + " " + test2.isGehaald());
        
        ProfessionalSkills test3 = new ProfessionalSkills("meeeh", 4, 4, true);
        test3.setGehaald(false);
        System.out.println(test3.toString() + test3.isGehaald());
       }

}
