package com.springboot.controller;

import com.springboot.dao.DoctorDAO;
import com.springboot.domain.Doctor;
import com.springboot.service.DoctorServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Fill your code here
@RestController
public class DoctorController 
{
    //Fill your code here
	@Autowired 
	DoctorServiceImpl service;

	@GetMapping("/doctor/list")
    List<Doctor> getDoctors() 
    {
        //Fill your code here
    	return service.list();

    }

    //Fill your code here
	@PostMapping("/doctor/create")
    Boolean create(@RequestBody Doctor doctor) 
    {
        //Fill your code here
		return service.save(doctor);

    }
}