package com.avijit.stock.dbservice.resource;


import com.avijit.stock.dbservice.model.Student;
import com.avijit.stock.dbservice.Util.Message;
import com.avijit.stock.dbservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rest/db")
public class DbServiceResource {

   @Autowired
    StudentRepository studentRepository;

    @RequestMapping(value = "/addStudent", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public Message saveStudent(@RequestBody Student student) {
        try {
            studentRepository.save(student);

            return new Message(200, "quote saved Successfully");

        } catch (Exception e) {
            return new Message(500, "quote can't be saved");
        }

    }


}
