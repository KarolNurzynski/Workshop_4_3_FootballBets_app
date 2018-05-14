package pl.coderslab.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.coderslab.web.model.dao.CountryDao;
import pl.coderslab.web.model.dao.LeagueDao;
import pl.coderslab.web.model.dto.CountryDto;
import pl.coderslab.web.model.dto.LeagueDto;

@RestController
public class BetsController {
    private final Logger logger = LoggerFactory.getLogger(BetsController.class);   //logger wypisze nam pobrane dane z API apifootball na konsoli

    @Autowired
    CountryDao countryDao;

    @Autowired
    LeagueDao leagueDao;

    @RequestMapping("/get-countries")   // ta akcja laczy sie z API football, pobiera dane JSON i zamienia je na obiekty
    public String getCountriesAction() {

//        String url = "https://apifootball.com/api/?action=get_countries&" +
//                "APIkey=eee5028bd4f1a9645f0de3b18aa4c17c11a0eedd815aeaacf2cae4d5801e8969";  //adres API wraz z przykladowym kluczem

        String url = "http://localhost:8080/api/countries";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CountryDto[]> responseCountries = restTemplate.getForEntity(     // na obiekcie restTemplate wywolujemy zapytanie do API i dokonujemy autokonwersji na obiekty naszego typu (u nas CountryDto)
                url, CountryDto[].class);
        CountryDto[] countries = responseCountries.getBody();   //pobieramy tablice obiketow CDao

        for (CountryDto country: countries) {      //wyswietlamy dane na konsoli przy pomocy loggera
            logger.info("countries {}", country);
            countryDao.create(country);   //dla kazdego obiektu Dto (przechowuje JSONa) tworze zapytanie sql z zadaniem utworzenia nowej pozycji w bazie danych
                                         // dodaje obiekty countries do bazy danych (wykonuje metode addAll klasy CDao na obiekcie tej klasy)
        }

        return "some result";
    }

    @RequestMapping("/get-leagues")   // ta akcja laczy sie z API football, pobiera dane JSON i zamienia je na obiekty
    public String getLeaguesAction() {

//        String url = "https://apifootball.com/api/?action=get_countries&" +
//                "APIkey=eee5028bd4f1a9645f0de3b18aa4c17c11a0eedd815aeaacf2cae4d5801e8969";  //adres API wraz z przykladowym kluczem

        String url = "http://localhost:8080/api/leagues";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<LeagueDto[]> responseLeagues = restTemplate.getForEntity(     // na obiekcie restTemplate wywolujemy zapytanie do API i dokonujemy autokonwersji na obiekty naszego typu (u nas LeagueDto)
                url, LeagueDto[].class);
        LeagueDto[] leagues = responseLeagues.getBody();   //pobieramy tablice obiketow CDao

        for (LeagueDto league: leagues) {      //wyswietlamy dane na konsoli przy pomocy loggera
            logger.info("leagues {}", league);
            leagueDao.create(league);   //dla kazdego obiektu Dto (przechowuje JSONa) tworze zapytanie sql z zadaniem utworzenia nowej pozycji w bazie danych
            // dodaje obiekty leagues do bazy danych (wykonuje metode addAll klasy CDao na obiekcie tej klasy)
        }

        return "some result";
    }

}
