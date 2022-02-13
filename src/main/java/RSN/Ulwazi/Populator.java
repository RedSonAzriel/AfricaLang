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

        //Nation List template - Nation(long id, String location, String description
        Nation algeria= new Nation(,,"Algeria");
        nationRepo.save(algeria);

        Nation angola= new Nation(,,"Angola");
        nationRepo.save(angola);

        Nation benin= new Nation(,,"Benin");
        nationRepo.save(benin);

        Nation botswana= new Nation(,,"Botswana");
        nationRepo.save(botswana);

        Nation burkinaFaso= new Nation(,,"Burkina Faso");
        nationRepo.save(burkinaFaso);

        Nation burundi= new Nation(,,"Burundi");
        nationRepo.save(burundi);

        Nation caboVerde= new Nation(,,"Cabo Verde");
        nationRepo.save(caboVerde);

        Nation cameroon= new Nation(,,"Cameroon");
        nationRepo.save(cameroon);

        Nation centralAfricanRepublic= new Nation(,,"Central African Republic");
        nationRepo.save(centralAfricanRepublic);

        Nation chad= new Nation(,,"Chad");
        nationRepo.save(chad);

        Nation comoros= new Nation(,,"Comoros");
        nationRepo.save(comoros);

        Nation congo= new Nation(,,"Congo");
        nationRepo.save(congo);

        Nation côtedIvoire= new Nation(,,"Côte d'Ivoire");
        nationRepo.save(côtedIvoire);

        Nation djibouti= new Nation(,,"Djibouti");
        nationRepo.save(djibouti);

        Nation drCongo= new Nation(,,"DR Congo");
        nationRepo.save(drCongo);

        Nation egypt= new Nation(,,"Egypt");
        nationRepo.save(egypt);

        Nation equatorialGuinea= new Nation(,,"Equatorial Guinea");
        nationRepo.save(equatorialGuinea);

        Nation eritrea = new Nation(,,"Eritrea");
        nationRepo.save(eritrea);

        Nation eswatini= new Nation(,,"Eswatini");
        nationRepo.save(eswatini);

        Nation ethiopia= new Nation(,,"Ethiopia");
        nationRepo.save(ethiopia);

        Nation gabon= new Nation(,,"Gabon");
        nationRepo.save(gabon);

        Nation gambia= new Nation(,,"Gambia");
        nationRepo.save(gambia);

        Nation ghana= new Nation(,,"Ghana");
        nationRepo.save(ghana);

        Nation guinea= new Nation(,,"Guinea");
        nationRepo.save(guinea);

        Nation guineaBissau= new Nation(,,"Guinea-Bissau");
        nationRepo.save(guineaBissau);

        Nation kenya= new Nation(,,"Kenya");
        nationRepo.save(kenya);

        Nation lesotho= new Nation(,,"Lesotho");
        nationRepo.save(lesotho);

        Nation liberia= new Nation(,,"Liberia");
        nationRepo.save(liberia);

        Nation libya= new Nation(,,"Libya");
        nationRepo.save(libya);

        Nation madagascar= new Nation(,,"Madagascar");
        nationRepo.save(madagascar);

        Nation malawi= new Nation(,,"Malawi");
        nationRepo.save(malawi);

        Nation mali= new Nation(,,"Mali");
        nationRepo.save(mali);

        Nation mauritania= new Nation(,,"Mauritania");
        nationRepo.save(mauritania);

        Nation mauritius= new Nation(,,"Mauritius");
        nationRepo.save(mauritius);

        Nation morocco= new Nation(,,"Morocco");
        nationRepo.save(morocco);

        Nation mozambique= new Nation(,,"Mozambique");
        nationRepo.save(mozambique);

        Nation namibia= new Nation(,,"Namibia");
        nationRepo.save(namibia);

        Nation niger= new Nation(,,"Niger");
        nationRepo.save(niger);

        Nation nigeria= new Nation(,,"Nigeria");
        nationRepo.save(nigeria);

        Nation rwanda= new Nation(,,"Rwanda");
        nationRepo.save(rwanda);

        Nation saoTomePrincipe= new Nation(,,"Sao Tome & Principe");
        nationRepo.save(saoTomePrincipe);

        Nation senegal= new Nation(,,"Senegal");
        nationRepo.save(senegal);

        Nation seychelles= new Nation(,,"Seychelles");
        nationRepo.save(seychelles);

        Nation sierraLeone= new Nation(,,"Sierra Leone");
        nationRepo.save(sierraLeone);

        Nation somalia= new Nation(,,"Somalia");
        nationRepo.save(somalia);

        Nation southAfrica= new Nation(,,"South Africa");
        nationRepo.save(southAfrica);

        Nation southSudan= new Nation(,,"South Sudan");
        nationRepo.save(southSudan);

        Nation sudan= new Nation(,,"Sudan");
        nationRepo.save(sudan);

        Nation tanzania= new Nation(,,"Tanzania");
        nationRepo.save(tanzania);

        Nation togo= new Nation(,,"Togo");
        nationRepo.save(togo);

        Nation tunisia= new Nation(,,"Tunisia");
        nationRepo.save(tunisia);

        Nation uganda= new Nation(,,"Uganda");
        nationRepo.save(uganda);

        Nation zambia= new Nation(,,"Zambia");
        nationRepo.save(zambia);

        Nation zimbabwe= new Nation(,,"Zimbabwe");
        nationRepo.save(zimbabwe);
    }
}
