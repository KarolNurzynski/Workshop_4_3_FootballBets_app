package pl.coderslab.web.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.coderslab.web.model.dto.CountryDto;
import pl.coderslab.web.model.dto.LeagueDto;
import pl.coderslab.web.utils.FactoryConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

@Component
public class LeagueDao {

    @Autowired
    FactoryConnection factoryConnection;

    private	static final String ADD_ALL_COUNTRIES_QUERY = "INSERT INTO league(id,name,country_id) VALUES (?,?,?)";

    public void create(LeagueDto leagueDto) {

        try	(Connection connection = factoryConnection.getConnection();
                PreparedStatement statement	= connection.prepareStatement(ADD_ALL_COUNTRIES_QUERY)) {
            statement.setLong(1, leagueDto.getId());
            statement.setString(2, leagueDto.getName());
            statement.setString(3, leagueDto.getCountry_id());
            statement.executeUpdate();

        }catch	(Exception e) {
            e.printStackTrace();
            System.out.println("Error occured - by KN.");

        }


    }
}