package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdmisionController {

	@RequestMapping("/getAdmDt")
	public String getAdmissionData()
	{
		System.out.println("I am Get Admission Data method in Admission Client");
		return "Admission Data....!!!";
	}

	public static void m1()
	{

	}
}
