package com.example.Database.Service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Database.entity.Student;
import com.example.Database.repository.repo;


@Service
public class service {
     @Autowired     
     private repo stu;
     
     public Student savedetails(Student s)
     {
    	 return stu.save(s);
     }
     
     public List<Student> getAllDetails()
     {
    	 List<Student> arr = new ArrayList<>();
    	 arr=stu.findAll();
    	 return arr;
//    	 return stu.findAll() ;   
    	 }
     public void deleteDepartmentById(int id)
     {
    	 stu.deleteById(id);
     }
     public Student update(int id,Student s ) {
    	 return stu.saveAndFlush(s);
     }
}