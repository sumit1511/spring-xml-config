package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


public class Employee
{
    private String name;
    private Integer age;
    private Double salary;
    private List<String> taskList; // will use this at the end

    public List<String> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<String> taskList) {
        this.taskList = taskList;
    }

    private  Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public  void show()
    {
        System.out.println("Name-:"+name);
        System.out.println("Age-:"+age);
        System.out.println("Salary-:"+salary);
        System.out.println("tasks-:"+taskList);
        department.print();
    }
}
