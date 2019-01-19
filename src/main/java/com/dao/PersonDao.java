package com.dao;

import com.util.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PersonDao {

    Person selectPersonById(Long id);
    Person selectPersonByName(String name);
    List<Person> selectPersonByAge(Long age);
    List<Person> selectPersonBySex(Integer sex);
    List<Person> selectAll();
    List<Person> selectForeach(List<Integer> ageList);
    List<Person> selectIf(@Param("age") Long age);
    List<Person> selectChoose(Person person);

    Long insertPerson(Person person);
    Long updatePerson(Person person);
    Long deletePerson(Long id);


    Person insertRedis(Person person);
}
