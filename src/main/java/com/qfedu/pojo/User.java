package com.qfedu.pojo;


public class User {

    private Integer id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private Integer focuscount;
    private Integer fanscount;
    private String headphoto;
    private String babyname;
    private Integer babyage;
    private String nickname;
    private String userdescribe;

    public String getUserdescribe() {
        return userdescribe;
    }

    public void setUserdescribe(String userdescribe) {
        this.userdescribe = userdescribe;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBabyname() {
        return babyname;
    }

    public void setBabyname(String babyname) {
        this.babyname = babyname;
    }

    public Integer getBabyage() {
        return babyage;
    }

    public void setBabyage(Integer babyage) {
        this.babyage = babyage;
    }

    public String getHeadphoto() {
        return headphoto;
    }

    public void setHeadphoto(String headphoto) {
        this.headphoto = headphoto;
    }

    public Integer getFocuscount() {
        return focuscount;
    }

    public void setFocuscount(Integer focuscount) {
        this.focuscount = focuscount;
    }

    public Integer getFanscount() {
        return fanscount;
    }

    public void setFanscount(Integer fanscount) {
        this.fanscount = fanscount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", focuscount=" + focuscount +
                ", fanscount=" + fanscount +
                ", headphoto='" + headphoto + '\'' +
                ", babyname='" + babyname + '\'' +
                ", babyage=" + babyage +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}