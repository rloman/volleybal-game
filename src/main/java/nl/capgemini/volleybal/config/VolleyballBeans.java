package nl.capgemini.volleybal.config;

import nl.capgemini.volleybal.model.Volleybal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VolleyballBeans {

    @Bean
    public Volleybal sietske(@Value("${volleyball.name}") String name) {

        Volleybal volleybal = new Volleybal();
        volleybal.setId(24);
        volleybal.setName(name);
        volleybal.setPressure(100);

        return volleybal;
    }
}