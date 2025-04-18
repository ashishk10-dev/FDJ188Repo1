package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdmisionController {

	@RequestMapping("/getAdmDt")
	public String getAdmissionData()
	{
		return "Admission Data....!!!";
	}
}
