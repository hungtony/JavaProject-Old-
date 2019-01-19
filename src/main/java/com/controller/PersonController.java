package com.controller;

import com.service.PersonService;
import com.util.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class PersonController {

    @Autowired
    private PersonService personService;

    @Transactional
    @RequestMapping("/insertPerson")
    public Long insertPerson(@RequestParam("name") String name, @RequestParam("age") Long age,
                             @RequestParam("country") String country) {
        return personService.insertPerson(name,age,country);

    }

    @RequestMapping("/updatePerson")
    public Long updatePerson(@RequestParam("id") Long id, @RequestParam("name") String name,
                        @RequestParam("age") Long age, @RequestParam String country ) {

        return personService.updatePerson(id,name,age,country);

    }

    @RequestMapping("/deletePerson")
    public Long deletePerson(@RequestParam("id") Long id)
    {
        return personService.deletePerson(id);
    }

    @RequestMapping("/selectPersonById")
    public Person selectPersonById(@RequestParam("id") Long id) {

        return personService.selectPersonById(id);

    }

    @RequestMapping("/selectPersonByName")
    public Person selectPersonByName(@RequestParam("name") String name) {

        return personService.selectPersonByName(name);

    }

    @RequestMapping("/selectPersonByAge")
    public List<Person> selectPersonByAge(@RequestParam("age") Long age) {

        return personService.selectPersonByAge(age);

    }

    @RequestMapping("/selectPersonBySex")
    public List<Person> selectPersonBySex(@RequestParam("sex") Integer sex) {

        return personService.selectPersonBySex(sex);

    }

    @RequestMapping("/selectAll")
    public List<Person> selectAll() {

        return personService.selectAll();
    }

    @RequestMapping("/selectForeach")
    public List<Person> selectForeach() {

        return personService.selectForeach();
    }

    @RequestMapping("/selectIf")
    public List<Person> selectIf(@RequestParam("age") Long age) {

        return personService.selectIf(age);
    }

    @RequestMapping("/selectChoose")
    public List<Person> selectChoose(@RequestParam("name") String name,
                                     @RequestParam("age") Long age, @RequestParam String country) {

        Person person = new Person();
        person.setAge(age);
        person.setName(name);
        person.setCountry(country);

        return personService.selectChoose(person);
    }


    @RequestMapping("/insertRedis")
    public Person insertRedis(@RequestParam("name") String name,@RequestParam("age") Long age) {

        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return personService.insertRedis(person);

    }

    @RequestMapping(value = "/getBetMultiple", method = RequestMethod.GET)
    @ResponseBody
    public String  getBetMultiple(){
        return null;
    }

    @RequestMapping(value = "/updateBetMultiple", method = RequestMethod.PUT)
    @ResponseBody
    public String  updateBetMultiple(){
        return null;
    }

}
