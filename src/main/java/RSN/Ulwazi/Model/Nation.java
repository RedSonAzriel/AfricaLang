package RSN.Ulwazi.Model;

@Entity
public class Nation {
    @Id
    @GeneratedValue
    private long id;
    private int population;
    private String description;

    public Nation(long id, Integer population, String description) {
        this.id = id;
        this.population = population;
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
