package ro.hms.lesson01.services;

public class User1 {

    private String name;
    private String Id;

    public User1(String name, String id) {
        this.name = name;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", Id=" + Id + "]";
    }

}
