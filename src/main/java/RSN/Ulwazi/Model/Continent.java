package RSN.Ulwazi.Model;

public class Continent {
    @Id
    @GeneratedValue
    private long id;
    private String location;
    private String description;

    public Continent(long id, String location, String description) {
        this.id = id;
        this.location = location;
        this.description = description;
    }

    public Continent() {
    }

    public long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }
}
