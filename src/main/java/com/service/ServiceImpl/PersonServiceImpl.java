package com.service.ServiceImpl;

import com.dao.PersonDao;
import com.service.PersonService;
import com.util.JsonUtil;
import com.util.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service("PersonServiceImpl")
@EnableAutoConfiguration
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Override
    public Long insertPerson(String name, Long age, String country) {

        Person person = new Person();
        person.setAge(age);
        person.setName(name);
        person.setCountry(country);

        personDao.insertPerson(person);

        stringRedisTemplate.opsForValue().set("tony_"+person.getId(), JsonUtil.convertObjectToJson(person));

        JsonUtil.convertJsonToObject(stringRedisTemplate.opsForValue().get("tony_"+person.getId()),Person.class);

        System.out.println(stringRedisTemplate.opsForValue().get("tony_"+person.getId()));

        System.out.println(person.getId());

        return null;
    }

    @Override
    public Long updatePerson(Long id, String name, Long age, String country) {

        Person person = new Person();
        person.setAge(age);
        person.setName(name);
        person.setId(id);
        person.setCountry(country);

        return personDao.updatePerson(person);

    }

    @Override
    public Long deletePerson(Long id) {

        return personDao.deletePerson(id);
    }

    @Override
    public Person selectPersonById(Long id) {

        return personDao.selectPersonById(id);
    }

    @Override
    public List<Person> selectPersonByAge(Long age) {

        return personDao.selectPersonByAge(age);
    }

    @Override
    public Person selectPersonByName(String name) {

        return personDao.selectPersonByName(name);
    }

    @Override
    public List<Person> selectPersonBySex(Integer sex){

        return personDao.selectPersonBySex(sex);

    }

    @Override
    public List<Person> selectAll() {

        Map<Long,String> maps = new HashMap<>();
        List<Person> tempPerson = new ArrayList<>();

        tempPerson =personDao.selectAll();

        maps = tempPerson.stream().collect(Collectors.toMap(Person::getId, Person::toString));

        System.out.println(maps);

        return personDao.selectAll();
    }

    @Override
    public List<Person> selectForeach() {
        List<Integer> ageList = new ArrayList<>();
        ageList.add(43);
        ageList.add(68);

        return personDao.selectForeach(ageList);
    }

    @Override
    public List<Person> selectIf(Long age) {

        return personDao.selectIf(age);
    }

    @Override
    public List<Person> selectChoose(Person person) {

        return personDao.selectChoose(person);
    }


    @Override
    public Person insertRedis(Person person) {
        System.out.println("Q:"+person.getAge()+person.getName());
        stringRedisTemplate.opsForValue().set("tony_1",person.getName()+person.getAge());
        System.out.println(stringRedisTemplate.opsForValue().get("tony_1"));

        return null;
    }


}
