package com.springapp.mvc.model;

/**
 * Created by flyher on 2017/11/9.
 */
public class People {
    String name;
    Integer age;
    String children[];

    /**
     * get
     * @return
     */
    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    public String[] getChildren(){
        return children;
    }

    /**
     * set
     */
    public void setName(String name){
        this.name=name;
    }
    public void setAge(Integer age){
        this.age=age;
    }
    public void setChildren(String[] children){
        this.children=children;
    }
}
