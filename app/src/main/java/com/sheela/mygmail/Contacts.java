package com.sheela.mygmail;

import java.util.Date;

public class Contacts {
    private int imageId;
    private String date;
    private String Name ;
    private String Title;
    private String Content;

    public Contacts(  String Name,String date,String Title, String Content ,int imageId ){
        this.imageId=imageId;
        this.Name=Name;
        this.date=date;
       this.Title=Title;
       this.Content=Content;

    }
    public int getimageId(){
        return imageId;
    }
    public void imageId(){
        this.imageId=imageId;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date=date;
    }

    public String getName(){
        return Name;
    }
    public void setName(String name){
        this.Name=Name;
    }
    public String getTitle(){
        return Title;
    }
    public void Title(String Title){
        this.Title=Title;
    }
    public String getContent(){
        return Content;
    }
    public void Content(String Content){
        this.Content=Content;
    }
}

