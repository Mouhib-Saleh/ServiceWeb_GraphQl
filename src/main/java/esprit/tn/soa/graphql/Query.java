package esprit.tn.soa.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import esprit.tn.soa.entity.Student;
import esprit.tn.soa.repository.StudentRepository;

public class Query implements GraphQLRootResolver{
	   
	   
    private final StudentRepository stdRepository;
    public Query(StudentRepository sRepository) {
            this.stdRepository = sRepository;
           
        }

     public List<Student> allstudents() {
            return stdRepository.getAll();
        }
     
   
}