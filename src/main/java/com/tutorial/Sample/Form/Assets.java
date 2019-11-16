package com.tutorial.Sample.Form;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class Assets implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1165866591268152643L;
	
	@NotBlank(message = "NoBlank")
	private String userName;
	
	private String useDate;
	
	private String compName;
	
}
