package pal.appeal.userappealservice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pal.appeal.userappealservice.dao.Person;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {
}