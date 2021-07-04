package pl.edu.pjwstk.jazs20499nbp.controller;


import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pjwstk.jazs20499nbp.model.Data;
import pl.edu.pjwstk.jazs20499nbp.service.MyService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping
public class Controller {
    public final MyService myService;

    public Controller(MyService myService) {
        this.myService = myService;
    }

    @GetMapping ("/{startData}/{endData}")
    public ResponseEntity<Data> findRate(@PathVariable Date startData, @PathVariable Date endData) {
        return ResponseEntity.ok(myService.getExchangeRate(startData, endData));
    }
}
