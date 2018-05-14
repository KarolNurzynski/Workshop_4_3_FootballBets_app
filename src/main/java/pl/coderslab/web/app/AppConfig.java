package pl.coderslab.web.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 //uruchamia Szwagra
@EnableScheduling //pozwala komponentom Springa na korzystanie z adnotacji @Scheduled - ktora uruchami metody co okreslony czas
@EnableWebMvc      // importujemy konfiguracje, mozemy ja potem nadpisac wewnatrz klasy
@ComponentScan(basePackages = "pl.coderslab")
public class AppConfig extends WebMvcConfigurerAdapter {       //dzieki temu ze rozszerzamy klase WMCA mamy od razu kilka potrzebnych metod

    // dzieki temu informujemy Springa zeby omijal obrazki, pliki css i js przy szukaniu plikow widoku (w zwiazku z viewResolverem)
    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    // dodaje prefix, sufix do sciezek plikow widoku (upraszcza sosob wskazywania widoku z akcji/metody kontrolera)
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver =
                new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    // Definiujemy jakie zasoby mają być dostępne dla wyszczególnionych ścieżek URL dla Szwagra
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    // rozwiazanie problemu bezpieczenstwa zadan AJAX (same-origin-policy) - CORS
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")                  //Określamy adres dla jakiego obsługa CORS ma być włączona, jeżeli api naszej aplikacji jest dostępne pod adresem /api określamy "/api/**".
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedOrigins("http://localhost");
    }


}