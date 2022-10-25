package esprit.tn.soa.graphql;

import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;

import esprit.tn.soa.repository.StudentRepository;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;



@WebServlet(urlPatterns = "/graph")
public class GraphQLEndpoint extends SimpleGraphQLServlet{
    public GraphQLEndpoint() {
        super(buildSchema());
    }    
    private static GraphQLSchema buildSchema() {
        StudentRepository stdRepository = new StudentRepository();
         
        return SchemaParser.newParser()
                .file("schema.graphqls")
                .resolvers(new Query(stdRepository))
                .build()
                .makeExecutableSchema();
    }
}