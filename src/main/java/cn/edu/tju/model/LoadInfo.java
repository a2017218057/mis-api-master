package cn.edu.tju.model;

import javax.persistence.Entity;
import java.sql.Blob;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoadInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int uid;//自增主键

    private String name;//物品名称
    private String dynasty;
    private String type;
    private String place;
    private String loadtime;
    private String storagepicture;
    private String  smallpicture;
    private String id;//员工ID
    private String updatetime;

    protected LoadInfo() {}

    public LoadInfo(String name, String dynasty, String type, String place, String loadtime, String storagepicture, String smallpicture, String id, String updatetime) {
        this.name = name;
        this.dynasty = dynasty;
        this.type = type;
        this.place = place;
        this.loadtime = loadtime;
        this.storagepicture = storagepicture;
        this.smallpicture = smallpicture;
        this.id = id;
        this.updatetime = updatetime;
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

    public String getStoragepicture() {
        return storagepicture;
    }

    public void setStoragepicture(String storagepicture) {
        this.storagepicture = storagepicture;
    }

    public String getSmallpicture() {
        return smallpicture;
    }

    public void setSmallpicture(String smallpicture) {
        this.smallpicture = smallpicture;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
}
