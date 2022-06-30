package com.enit.demo.entities;
import lombok.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.ArrayList;
import java.util.Collection;

@Document
@Data
@ToString
public class Postuler {
    @Id
    private String posId;
    private String username;
    private String jobOfferId;
    private String entreprise;
    private int phoneNumber;
    private String email;
    
    
    public String getEntreprise() {
		return entreprise;
	}



	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}



	public int getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}


	private String career ;
    
    private String certification;
    
    private String skills;

    
    public Postuler() {
		super();
		// TODO Auto-generated constructor stub
	}

/*

	public Postuler(String posId, String username, String jobOfferId, String career,
			String certification, String skills) {
		super();
		this.posId = posId;
		this.username = username;
		this.jobOfferId = jobOfferId;
	
		this.career = career;
		this.certification = certification;
		this.skills = skills;
	}
*/

	public String getPosId() {
		return posId;
	}


	public void setPosId(String posId) {
		this.posId = posId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getJobOfferId() {
		return jobOfferId;
	}


	public void setJobOfferId(String jobOfferId) {
		this.jobOfferId = jobOfferId;
	}



	public Postuler(String posId, String username, String jobOfferId, String entreprise, int phoneNumber, String email,
			String career, String certification, String skills) {
		super();
		this.posId = posId;
		this.username = username;
		this.jobOfferId = jobOfferId;
		this.entreprise = entreprise;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.career = career;
		this.certification = certification;
		this.skills = skills;
	}



	public String getCareer() {
		return career;
	}


	public void setCareer(String career) {
		this.career = career;
	}


	public String getCertification() {
		return certification;
	}


	public void setCertification(String certification) {
		this.certification = certification;
	}


	public String getSkills() {
		return skills;
	}


	public void setSkills(String skills) {
		this.skills = skills;
	}

    



}
