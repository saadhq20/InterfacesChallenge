package com.company;



import java.util.ArrayList;
import java.util.List;

public class Employee implements Saveable {
    private String Name;
    private String Department;
    private String Title;

    public Employee(String name, String Department, String Title){
        this.Name = name;
        this.Title= Title;
        this.Department = Department;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public List<String> write(){
        List<String> list = new ArrayList<String>();
        list.add(0, this.Name);
        list.add(1 , this.Title);
        list.add(2 , this.Department);
        return list;


    }



    public void read(ArrayList<String> values){
        if(values!=null && values.size()<4 && values.size()>0){
            this.Name = values.get(0);
            this.Department = values.get(1);
            this.Title = values.get(2);
        }

    }

    public String toString(){
        return "Name is: "+ this.Name+ " The Department: "+ this.Department + " The Title:"+this.Title;
    }
}
