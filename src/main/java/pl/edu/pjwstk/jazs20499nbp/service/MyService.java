package pl.edu.pjwstk.jazs20499nbp.service;


import pl.edu.pjwstk.jazs20499nbp.model.Data;
import pl.edu.pjwstk.jazs20499nbp.repository.Repository;

import java.util.List;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    //private final Repository repository;
    private final RestTemplate restTemplate;

    public MyService(RestTemplate restTemplate) {
        //this.repository = repository;
        this.restTemplate= restTemplate;
    }

    public Data getExchangeRate(java.util.Date startDate, java.util.Date endDate){
        Data data = restTemplate.getForEntity("http://api.nbp.pl/api/cenyzlota/"+startDate+"/"+endDate+"/", Data.class).getBody();
        return data;
    }
}
