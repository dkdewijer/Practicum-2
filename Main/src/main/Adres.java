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
public class Adres {
 private String straat;
 private String huisnummer;
 private String plaats;
 
 public Adres(String straat, String huisnummer, String plaats){
 this.huisnummer = huisnummer;
 this.plaats = plaats;
 this.straat = straat;
 }
 
 public String toString(){
 return this.straat + " " + this.huisnummer + " " + this.plaats;
 }
 
}
