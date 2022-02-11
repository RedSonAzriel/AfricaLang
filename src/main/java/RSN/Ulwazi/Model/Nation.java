package RSN.Ulwazi.Model;

@Entity
public class Nation {
    @Id
    @GeneratedValue
    private long id;
    private String location;
    private String description;

    public Nation(long id, String location, String description) {
        this.id = id;
        this.location = location;
        this.description = description;
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
