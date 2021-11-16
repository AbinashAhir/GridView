package com.example.listview;

public class Gallary {
    private String course_name;
    private int imgId;

    public Gallary(String course_name, int imgId){
        this.course_name = course_name;
        this.imgId = imgId;
    }
    public String getCourse_name(){
        return course_name;
    }
    public void setCourse_name(String course_name){
        this.course_name = course_name;
    }
    public int getImgid(){
        return imgId;
    }
    public void setImgId(int imgId){
        this.imgId = imgId;
    }
}
