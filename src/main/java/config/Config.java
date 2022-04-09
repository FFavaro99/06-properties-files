package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/pets/pets.properties")
public class Config {

//    Using the Environment bean
//    @Autowired
//    private Environment env;

//    Using @Value with placeholders
    @Value("${dog-name}")
    private String dogName;
    @Value("${cat-name}")
    private String catName;


    @Bean("dog")
    public Pet dog() {
        var dog = new Pet();
//        dog.name =env.getProperty("dog-name");
        dog.name = dogName;
        return dog;
    }

    @Bean("cat")
    public Pet cat() {
        var cat = new Pet();
//        cat.name = env.getProperty("cat-name");
        cat.name = catName;
        return cat;
    }
}