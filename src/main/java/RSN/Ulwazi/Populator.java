package RSN.Ulwazi;

import RSN.Ulwazi.Repositories.NationRepository;

@Component
public class Populator implements CommandLineRunner {

    private NationRepository nationRepo;
    private CityRepository cityRepo;

    public Populator(NationRepository nationRepo, CityRepository cityRepo) {
        this.nationRepo = nationRepo;
        this.cityRepo = cityRepo;
    }

    @Override
    public void run(String...args) throws Exception {

        //Nation List
        
    }
}
