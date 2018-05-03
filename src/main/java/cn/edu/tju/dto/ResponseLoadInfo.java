package cn.edu.tju.dto;

import cn.edu.tju.model.LoadInfo;

import java.sql.Blob;
import java.util.Date;

public class ResponseLoadInfo {
    private int uid;
    private String name;
    private String dynasty;
    private String type;
    private String place;
    private String  loadtime;
    private String id;
    private String storagepicture;
    private String updatetime;

    protected ResponseLoadInfo() {}

    public ResponseLoadInfo(LoadInfo loadInfo) {
        this.uid = loadInfo.getUid();
        this.name = loadInfo.getName();
        this.dynasty = loadInfo.getDynasty();
        this.type = loadInfo.getType();
        this.place = loadInfo.getPlace();
        this.loadtime = loadInfo.getLoadtime();
        this.id = loadInfo.getId();
        this.storagepicture = loadInfo.getStoragepicture();
        this.updatetime = loadInfo.getUpdatetime();
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public String getLoadtime() {
        return loadtime;
    }

    public void setLoadtime(String loadtime) {
        this.loadtime = loadtime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStoragepicture() {
        return storagepicture;
    }

    public void setStoragepicture(String storagepicture) {
        this.storagepicture = storagepicture;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
}

