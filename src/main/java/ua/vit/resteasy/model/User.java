package ua.vit.resteasy.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
    private Long id;
    private String name;
    private String email;

    public User() {

    }

    public User(Long id, String name, String email) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
    }
}
