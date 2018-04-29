package cn.edu.tju.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String id;  // username

    private String password;

    private int previlege;

    public User(String id, String password, int previlege) {
        this.id = id;
        this.password = password;
        this.previlege = previlege;
    }

    protected User() {}

    public int getPrevilege() {
        return previlege;
    }

    public void setPrevilege(int previlege) {
        this.previlege = previlege;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
