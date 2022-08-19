package pal.appeal.userappealservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pal.appeal.userappealservice.dao.Person;
import pal.appeal.userappealservice.services.PersonService;

@RestController
@RequiredArgsConstructor
public class ApiController {

    private final PersonService service;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping("/persons/{personId}")
    public ResponseEntity<Person> getPersonById(@PathVariable("personId") Integer personId) {
        return ResponseEntity.ok(service.getPerson(personId));
    }

}
