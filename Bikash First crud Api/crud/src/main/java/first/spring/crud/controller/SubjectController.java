package first.spring.crud.controller;

import first.spring.crud.bean.Subject;
import first.spring.crud.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/subjects")
    public List<Subject> getAllSubjects()
    {
        return subjectService.getALlSubjects();
    }

    @RequestMapping(method= RequestMethod.POST, value = "/subjects")
    void addSubject(@RequestBody Subject subject)
    {
        subjectService.addSubject(subject);
    }

    @RequestMapping(method= RequestMethod.PUT, value = "/subjects/{id}")
    void updateSubject(@PathVariable String id, @RequestBody Subject subject)
    {
        subjectService.updateSubject(id, subject);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "subjects/{id}")
    void DeleteSubject(@PathVariable String id)
    {
        subjectService.deleteSubject(id);
    }

}
