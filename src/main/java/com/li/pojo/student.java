package com.li.pojo;


import java.sql.Date;

public class student {
    private String sid;
    private String name;
    private String sex;
    private Date birthday;

    private Class aClass;
//必须要写无参构造
    public student() {
    }

    public student(String sid, String name, String sex, Date birthday, Class aClass) {
        this.sid = sid;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;

        this.aClass = aClass;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }



    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    @Override
    public String toString() {
        return "student{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +

                ", aClass=" + aClass +
                '}';
    }
}
