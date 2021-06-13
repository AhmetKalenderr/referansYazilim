package com.ahmetkalender.referansyazilimproje.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="personals")
public class Personal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	
	@NotNull
	@Column(name="user_name")
	private String userName;
	
	@NotNull
	@Column(name="last_name")
	private String lastName;
	
	@javax.validation.constraints.Email
	@NotNull
	@NotBlank
	@Column(name="email")
	private String Email;
	
	
	@NotNull
	@NotBlank
	@Column(name="password")
	private String Password;
}
