package com.example.retrofitmarvel;

public class Hero {
    String name;
    String realName;
    String team;
    String firstAppearance;
    String CreatedBy;
    String publisher;
    String imageURl;
    String bio;

    public Hero(String name, String realName, String team, String firstAppearance, String createdBy, String publisher, String imageURl, String bio) {
        this.name = name;
        this.realName = realName;
        this.team = team;
        this.firstAppearance = firstAppearance;
        CreatedBy = createdBy;
        this.publisher = publisher;
        this.imageURl = imageURl;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(String firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getImageURl() {
        return imageURl;
    }

    public void setImageURl(String imageURl) {
        this.imageURl = imageURl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                ", team='" + team + '\'' +
                ", firstAppearance='" + firstAppearance + '\'' +
                ", CreatedBy='" + CreatedBy + '\'' +
                ", publisher='" + publisher + '\'' +
                ", imageURl='" + imageURl + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}
