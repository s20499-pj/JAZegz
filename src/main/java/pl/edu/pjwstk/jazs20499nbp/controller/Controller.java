package pl.edu.pjwstk.jazs20499nbp.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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

    @ApiOperation(value =  "Find movie by given ID",
            response = Data.class,
            notes = "Getting movie from provided id")

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 404, message = "Req not found"),
            @ApiResponse(code = 500, message = "Req not found")
    })

    @GetMapping ("/{startData}/{endData}")
    public ResponseEntity<Data> findRate(
            @ApiParam(name = "startData",
                    type = "date",
                    value = "2021-01-01",
                    example = "2021-01-01",
                    required = true,
                    defaultValue = "1")
            @PathVariable Date startData,
            @ApiParam(name = "endData",
                    type = "date",
                    value = "2021-05-01",
                    example = "2021-05-01",
                    required = true,
                    defaultValue = "1")
            @PathVariable Date endData) {
        return ResponseEntity.ok(myService.getExchangeRate(startData, endData));
    }
}
