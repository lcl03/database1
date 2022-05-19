package com.li.pojo;

public class Class {
    private String cid;
    private String cass;

    public Class(String cid, String cass) {
        this.cid = cid;
        this.cass = cass;
    }
 //注意必须要写无参构造
    public Class() {
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCass() {
        return cass;
    }

    public void setCass(String cass) {
        this.cass = cass;
    }

    @Override
    public String toString() {
        return "Class{" +
                "cid='" + cid + '\'' +
                ", cass='" + cass + '\'' +
                '}';
    }
}
