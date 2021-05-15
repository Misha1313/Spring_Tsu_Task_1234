package com.example.spring_tsu_task_1;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Paths;

@RestController
public class SimpleController {
    @GetMapping
    public String WriteCarServiceData ()
    {
        try
        {
            CarService carService = new CarService("toyota camry 2016", "Faulty fuel pump", 560);

            ObjectMapper mapper = new ObjectMapper();

            // create an instance of DefaultPrettyPrinter
            ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());


            // convert book object to JSON file
            writer.writeValue(Paths.get("C:\\Users\\Public\\RaxanEsGamovida.json").toFile(), carService);
            return "Record added successfully";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "error occurred";
        }
    }
}

