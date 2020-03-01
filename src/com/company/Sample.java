package com.company;

import java.util.ArrayList;
import java.util.List;

public class Sample implements Saveable {
    private String  name;
    private int studentID;
    private String Year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public Sample(String name, int studentID , String Year){
        this.name = name;
        this.studentID = studentID;
        this.Year    = Year;
    }

    public String toString(){
        return "The name is: " + this.name+ ", StudentID is: "+ this.studentID+", Year is: " +this.Year;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<String>();
        list.add(0,this.name);
        list.add(1,Integer.toString(this.studentID));
        list.add(2,this.Year);
        return list;
    }

    @Override
    public void read(ArrayList<String> Value) {
        if(Value.size()>0 && Value!=null && Value.size()<3){
            this.name = Value.get(0);
            this.studentID = Integer.parseInt(Value.get(1));
            this.Year = Value.get(2);

        }

    }

}
