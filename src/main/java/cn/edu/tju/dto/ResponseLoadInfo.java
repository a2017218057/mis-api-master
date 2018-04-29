package cn.edu.tju.dto;

import cn.edu.tju.model.LoadInfo;

import java.sql.Blob;
import java.util.Date;

public class ResponseLoadInfo {
    private String name;
    private String dynasty;
    private String type;
    private String place;
    private Date loadtime;
    private String id;

    protected ResponseLoadInfo() {}
    public ResponseLoadInfo(LoadInfo la) {
        this.name = la.getName();
        this.dynasty = la.getDynasty();
        this.type = la.getType();
        this.place = la.getPlace();
        this.loadtime = la.getLoadtime();
        this.id = la.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDynasty() {
        return dynasty;
    }

    public void setDynasty(String dynasty) {
        this.dynasty = dynasty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getLoadtime() {
        return loadtime;
    }

    public void setLoadtime(Date loadtime) {
        this.loadtime = loadtime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

