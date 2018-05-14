package pl.coderslab.web.model.entity;

public class League {

    private long id;
    private String name;
    private long country_id;

    public League(long id, String name, long country_id) {
        this.id = id;
        this.name = name;
        this.country_id = country_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCountry_id() {
        return country_id;
    }

    public void setCountry_id(long country_id) {
        this.country_id = country_id;
    }
}
