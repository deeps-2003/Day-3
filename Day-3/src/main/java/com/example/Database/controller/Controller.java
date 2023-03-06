package com.example.Database.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Database.Service.service;
import com.example.Database.entity.Student;
@RestController
public class Controller {
	@Autowired
	private service stuservice;
	@GetMapping("/getStudent")
	public List<Student> getDetails(){
		return stuservice.getAllDetails();
	}
	@PostMapping("/addstudent")
	public Student postDetails(@RequestBody Student s) {
		return stuservice.savedetails(s);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		stuservice.deleteDepartmentById(id);
	}
	@PutMapping("/update/{id}")
	public Student update(@PathVariable int id,@RequestBody Student s) {
		return stuservice.update(id,s);
	}
}
