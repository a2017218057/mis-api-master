package cn.edu.tju.model;

import javax.persistence.Entity;
import java.sql.Blob;
import java.util.Date;
import javax.persistence.Id;

@Entity
public class LoadInfo {
    @Id
    private String name;

    private String dynasty;
    private String type;
    private String place;
    private Date loadtime;
    private String storagepicture;
    private Blob smallpicture;
    private String id;

    protected LoadInfo() {}

    public LoadInfo(String name, String dynasty, String type, String place, Date loadtime, String storagepicture, Blob smallpicture, String id) {
        this.name = name;
        this.dynasty = dynasty;
        this.type = type;
        this.place = place;
        this.loadtime = loadtime;
        this.storagepicture = storagepicture;
        this.smallpicture = smallpicture;
        this.id = id;
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

    public String getStoragepicture() {
        return storagepicture;
    }

    public void setStoragepicture(String storagepicture) {
        this.storagepicture = storagepicture;
    }

    public Blob getSmallpicture() {
        return smallpicture;
    }

    public void setSmallpicture(Blob smallpicture) {
        this.smallpicture = smallpicture;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
