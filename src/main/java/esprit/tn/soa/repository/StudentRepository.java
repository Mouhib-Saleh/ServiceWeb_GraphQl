package esprit.tn.soa.repository;
import java.util.ArrayList;
import java.util.List;

import esprit.tn.soa.entity.Student;

import java.util.ArrayList;
import java.util.List;

import esprit.tn.soa.entity.Student;

public class StudentRepository {
    private  List<Student> students;
   
    public StudentRepository() {
        students=new ArrayList<Student>();
        students.add(new Student("12345678", "Mohamed B.Med", "med@esprit.tn"));
        students.add(new Student("22551100", "Foulen B.Foulen", "foulen@esprit.tn"));

    }
   
    public List<Student> getAll(){
        return students;
    }
   
    public Student getById(String id){
        for (Student info:students) {
               if(info.getCin()==id) {
                  return info;
                                         
               }
            }
        return null;    
    }
   
    public void save(Student stud) {
        students.add(stud);
    }
}
