package com.projet1.beans;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

public class Personne implements Serializable{
	private String nom;
	private String prenom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void save () {
	   
	
		
		try {
			FileOutputStream fi = new FileOutputStream (new File("C:/personnes.txt"));
			ObjectOutputStream oj = new ObjectOutputStream(fi);
			
			oj.writeObject(this);
			System.out.println("object saved");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
