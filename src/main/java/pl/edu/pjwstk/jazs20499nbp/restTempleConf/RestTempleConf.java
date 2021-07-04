package pl.edu.pjwstk.jazs20499nbp.restTempleConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTempleConf {

    @Bean
    public RestTemplate restTemple() {
        return new RestTemplate();
    }
}


