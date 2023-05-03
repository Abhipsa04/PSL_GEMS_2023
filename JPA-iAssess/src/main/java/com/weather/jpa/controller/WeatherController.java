package com.weather.jpa.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.weather.jpa.domain.WeatherReport;
import com.weather.jpa.service.WeatherService;

//Fill your code here
@RestController
public class WeatherController {
    
	//Fill your code here
	@Autowired 
	WeatherService ws;

	@GetMapping("/weatherReport")
	public List<WeatherReport> getData() {
		//Fill your code here
		return ws.getData();

	}
	
	//Fill your code here
	@PostMapping("/weatherReport")
	public WeatherReport addCases(@RequestBody WeatherReport cases) {
		//Fill your code here
		return ws.addCases(cases);

	}

	//Fill your code here
	@PutMapping("/weatherReport")
	public WeatherReport updateCases(@RequestBody WeatherReport cases) {
		//Fill your code here
		return ws.updateCases(cases);
	}
	
	//Fill your code here
	@GetMapping("/weatherReport/{id}")
	public WeatherReport view(@PathVariable Long id) {
		//Fill your code 
		return ws.view(id);

	}
	
	//Fill your code here
	@DeleteMapping("/weatherReport/{id}")
	public Boolean deleteCases(@PathVariable Long id) {
		return ws.deleteCases(id);
        //Fill your code here
		

	}
	
}
