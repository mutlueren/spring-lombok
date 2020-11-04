package com.lombok.service;

import com.lombok.model.*;
import com.lombok.model.Class;
import com.lombok.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class MainService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    SchoolRepository schoolRepository;
    @Autowired
    ClassRepository classRepository;
    @Autowired
    CityRepository cityRepository;

    /* date of birth converter */
    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    /* generate datas by manual */
    @Transactional
    public void generateManual(){

        try {
            ArrayList<Class> classList = new ArrayList<>();
            ArrayList<Teacher> teacherList = new ArrayList<>();
            ArrayList<Student> studentList = new ArrayList<>();
            
            Student st1 = new Student();
            st1.setFirstName("Mutlu");
            st1.setLastName("Eren");
            st1.setDateOfBirth(parseDate("1995-03-02"));
            str.setClasses(classList);
            studentRepository.save(st1);

            Teacher t1 = new Teacher();
            t1.setFirstName("Mehmet Ali");
            t1.setLastName("Tuysuz");
            t1.setDateOfBirth(parseDate("1970-01-01"));
            t1.setClasses(classList);
            teacherRepository.save(t1);

            Class c1 = new Class();
            c1.setCode("CEN400");
            teacherList.add(t1);
            c1.setTeachers(teacherList);
            studentList.add(st1);
            c1.setStudents(studentList);
            classList.add(c1);
            classRepository.save(c1);

            School sh1 = new School();
            sh1.setName("Maltepe University");
            List<Class> classList = new ArrayList<>();
            classList.add(c1);
            sh1.setClasses(classList);
            schoolRepository.save(sh1);

            City istanbul = new City();
            istanbul.setName("Istanbul");
            istanbul.setPlateCode("34");
            List<School> schoolList = new ArrayList<>();
            schoolList.add(sh1);
            istanbul.setSchools(schoolList);
            cityRepository.save(istanbul);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    /* get mappings */
    public List<City> getCityByName(String name){
        return cityRepository.findByName(name);
    }

    public List<City> getCityByPlateCode(String plateCode){
        return cityRepository.findByPlateCode(plateCode);
    }

    public List<City> getAllCities(){
        return cityRepository.findAll();
    }

    public List<Class> getClassByCode(String code){
        return classRepository.findByCode(code);
    }

    public List<Class> getAllClasses(){
        return classRepository.findAll();
    }

    public List<School> getSchoolByName(String name){
        return schoolRepository.findByName(name);
    }

    public List<School> getAllSchools(){
        return schoolRepository.findAll();
    }

    public List<Student> getStudentByFirstName(String firstName){
        return studentRepository.findByFirstName(firstName);
    }

    public List<Student> getStudentByLastName(String lastName){
        return studentRepository.findByLastName(lastName);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public List<Teacher> getTeacherByFirstName(String firstName){
        return teacherRepository.findByFirstName(firstName);
    }

    public List<Teacher> getTeacherByLastName(String lastName){
        return teacherRepository.findByLastName(lastName);
    }

    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }

    /* post mappings */
    public City createNewCity(City city){
        try {
            return cityRepository.save(city);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Class createNewClass(Class newClass){
        try {
            return classRepository.save(newClass);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public School createNewSchool(School school){
        try {
            return schoolRepository.save(school);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Student createNewStudent(Student student){
        try {
            return studentRepository.save(student);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Teacher createNewTeacher(Teacher teacher){
        try {
            return teacherRepository.save(teacher);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    /* put mappings */
    public City updateCity(City city){
        try {
            return cityRepository.save(city);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Class updateClass(Class newClass){
        try {
            return classRepository.save(newClass);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public School updateSchool(School school){
        try {
            return schoolRepository.save(school);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Student updateStudent(Student student){
        try {
            return studentRepository.save(student);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Teacher updateTeacher(Teacher teacher){
        try {
            return teacherRepository.save(teacher);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    /* delete mappings */
    public boolean deleteCityById(int id) {
        try {
            cityRepository.deleteById(id);
            return true;
        }catch (Exception e){
            System.out.println("Error catched: "+e.getMessage());
            return false;
        }
    }

    public boolean deleteClassById(int id) {
        try {
            classRepository.deleteById(id);
            return true;
        }catch (Exception e){
            System.out.println("Error catched: "+e.getMessage());
            return false;
        }
    }

    public boolean deleteSchoolById(int id) {
        try {
            schoolRepository.deleteById(id);
            return true;
        }catch (Exception e){
            System.out.println("Error catched: "+e.getMessage());
            return false;
        }
    }

    public boolean deleteStudentById(int id) {
        try {
            studentRepository.deleteById(id);
            return true;
        }catch (Exception e){
            System.out.println("Error catched: "+e.getMessage());
            return false;
        }
    }

    public boolean deleteTeacherById(int id) {
        try {
            teacherRepository.deleteById(id);
            return true;
        }catch (Exception e){
            System.out.println("Error catched: "+e.getMessage());
            return false;
        }
    }

}
