package pal.appeal.userappealservice.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pal.appeal.userappealservice.dao.Person;
import pal.appeal.userappealservice.repository.PersonRepository;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    public Person getPerson(Integer id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Can't find person with id" + id));
    }
}
