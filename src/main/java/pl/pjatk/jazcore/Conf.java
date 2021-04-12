package pl.pjatk.jazcore;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Conf {
    @Bean
    @ConditionalOnProperty(value="module.enabled", havingValue = "true")
    public Pojo pojo() {
        return new Pojo();
    }
}
