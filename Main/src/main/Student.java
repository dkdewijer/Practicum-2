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
public class Student {
private String voornaam;
private String achternaam;
private Adres adres;

public Student(String voornaam, String achternaam, Adres adres){
this.voornaam = voornaam;
this.achternaam = achternaam;
this.adres = adres;
}

public String toString(){
return voornaam + " " + achternaam + " " + adres.toString(); 
}

}
