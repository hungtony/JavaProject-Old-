package com.service;

import com.util.Person;

import java.util.List;

public interface PersonService {

    Long insertPerson(String name, Long age, String country);

    Long updatePerson(Long id, String name, Long age, String country);

    Long deletePerson(Long id);

    Person selectPersonById(Long id);

    Person selectPersonByName(String name);

    List<Person> selectPersonBySex(Integer sex);

    List<Person> selectPersonByAge(Long age);

    List<Person> selectAll();

    List<Person> selectForeach();

    List<Person> selectIf(Long age);

    List<Person> selectChoose(Person person);

    Person insertRedis(Person person);


}
