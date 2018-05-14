package pl.coderslab.web.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.coderslab.web.model.dto.CountryDto;
import pl.coderslab.web.utils.FactoryConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

@Component
public class CountryDao {

    @Autowired
    FactoryConnection factoryConnection;

    private	static final String ADD_ALL_COUNTRIES_QUERY = "INSERT INTO country(id,name) VALUES (?,?)";

    public void create(CountryDto country) {

        try	(Connection connection = factoryConnection.getConnection();
                PreparedStatement statement	= connection.prepareStatement(ADD_ALL_COUNTRIES_QUERY)) {
            statement.setLong(1, country.getApiCountryId());
            statement.setString(2, country.getName());
            statement.executeUpdate();

        }catch	(Exception e) {
            e.printStackTrace();
            System.out.println("Error occured - by KN.");

        }


    }
}