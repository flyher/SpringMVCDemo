package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.springapp.mvc.model.People;

/**
 * Created by flyher on 2017/11/9.
 */

@Controller
@RequestMapping("/people")
public class PeopleController {
    @RequestMapping(value = "{name}",method = RequestMethod.GET)
    public @ResponseBody
    com.springapp.mvc.model.People getPeople(@PathVariable String name){
        com.springapp.mvc.model.People people=new com.springapp.mvc.model.People();
        people.setName(name);
        people.setAge(99);
        people.setChildren(new String[]{"lucy","jack"});
        return people;
    }
}
