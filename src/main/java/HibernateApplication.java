import configuration.Datasource;
import configuration.Environment;
import configuration.FlywayConfigurations;
import crud.ClientCrudService;
import crud.PlanetCrudService;
import entity.Client;
import entity.Planet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class HibernateApplication {
    public static void main(String[] args) throws IOException, SQLException {
        Environment environment = Environment.load();
        new FlywayConfigurations()
                .setup()
                .migrate();
        ClientCrudService repository = new ClientCrudService(new Datasource(environment));
        List<Client> list = repository.listAll();
        System.out.println(list);
        PlanetCrudService planetCrudService = new PlanetCrudService(new Datasource(environment));
        List<Planet> planetList = planetCrudService.listAll();
        System.out.println(planetList);
    }
}
