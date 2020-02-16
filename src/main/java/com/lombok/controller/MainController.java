package com.lombok.controller;

import com.lombok.model.*;
import com.lombok.model.Class;
import com.lombok.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping("/generate")
    public String generateObjectsByManual(){
            try {
                mainService.generateManual();
                return "Successfully generated.";
            }catch (Exception e){
                return e.getMessage();
            }
        }

    /*get*/
    @GetMapping("/getCityByName")
    public List<City> getCityByName(@RequestParam String name){
        return mainService.getCityByName(name);
    }

    @GetMapping("/getCityByPlateCode")
    public List<City> getCityByPlateCode(@RequestParam String plateCode){
        return mainService.getCityByPlateCode(plateCode);
    }

    @GetMapping("/getAllCities")
    public List<City> getAllCities(){
        return mainService.getAllCities();
    }

    @GetMapping("/getAllClasses")
    public List<Class> getAllClasses(){
        return mainService.getAllClasses();
    }

    @GetMapping("/getSchoolByName")
    public List<School> getSchoolByName(@RequestParam String name){
        return mainService.getSchoolByName(name);
    }

    @GetMapping("/getAllSchools")
    public List<School> getAllSchools(){
        return mainService.getAllSchools();
    }

    @GetMapping("/getStudentByFirstName")
    public List<Student> getStudentByFirstName(@RequestParam String firstName){
        return mainService.getStudentByFirstName(firstName);
    }

    @GetMapping("/getStudentByLastName")
    public List<Student> getStudentByLastName(@RequestParam String lastName){
        return mainService.getStudentByLastName(lastName);
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return mainService.getAllStudents();
    }

    @GetMapping("/getTeacherByFirstName")
    public List<Teacher> getTeacherByFirstName(@RequestParam String firstName){
        return mainService.getTeacherByFirstName(firstName);
    }

    @GetMapping("/getTeacherByLastName")
    public List<Teacher> getTeacherByLastName(@RequestParam String lastName){
        return mainService.getTeacherByLastName(lastName);
    }

    @GetMapping("/getAllTeachers")
    public List<Teacher> getAllTeachers(){
        return mainService.getAllTeachers();
    }

    /*create*/
    @PostMapping("/createNewCity")
    public City createNewCity(@RequestBody City city){
        return mainService.createNewCity(city);
    }

    @PostMapping("/createNewClass")
    public Class createNewCity(@RequestBody Class newClass){
        return mainService.createNewClass(newClass);
    }

    @PostMapping("/createNewSchool")
    public School createNewSchool(@RequestBody School school){
        return mainService.createNewSchool(school);
    }

    @PostMapping("/createNewStudent")
    public Student createNewStudent(@RequestBody Student student){
        return mainService.createNewStudent(student);
    }

    @PostMapping("/createNewTeacher")
    public Teacher createNewTeacher(@RequestBody Teacher teacher){
        return mainService.createNewTeacher(teacher);
    }

    /*update*/
    @PutMapping("/updateCity")
    public City updateCity(@RequestBody City city){
        return mainService.updateCity(city);
    }

    @PutMapping("/updateClass")
    public Class updateCity(@RequestBody Class updateClass){
        return mainService.updateClass(updateClass);
    }

    @PutMapping("/updateSchool")
    public School updateCity(@RequestBody School school){
        return mainService.updateSchool(school);
    }

    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return mainService.updateStudent(student);
    }

    @PutMapping("/updateTeacher")
    public Teacher updateStudent(@RequestBody Teacher teacher){
        return mainService.updateTeacher(teacher);
    }

    /*delete*/
    @DeleteMapping("/deleteCityById")
    public boolean deleteCityById(@RequestParam int id){
        return mainService.deleteCityById(id);
    }

    @DeleteMapping("/deleteClassById")
    public boolean deleteClassById(@RequestParam int id){
        return mainService.deleteClassById(id);
    }

    @DeleteMapping("/deleteSchoolById")
    public boolean deleteSchoolById(@RequestParam int id){
        return mainService.deleteSchoolById(id);
    }

    @DeleteMapping("/deleteStudentById")
    public boolean deleteStudentById(@RequestParam int id){
        return mainService.deleteStudentById(id);
    }

    @DeleteMapping("/deleteTeacherById")
    public boolean deleteTeacherById(@RequestParam int id){
        return mainService.deleteTeacherById(id);
    }

}
