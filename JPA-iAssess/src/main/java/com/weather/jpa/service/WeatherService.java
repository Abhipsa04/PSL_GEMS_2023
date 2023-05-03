package com.weather.jpa.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.weather.jpa.domain.WeatherReport;
import com.weather.jpa.repository.WeatherRepository;

//Fill your code here
@Service
public class WeatherService {
//Fill your code here
	@Autowired
	WeatherRepository wr;
    
    public List<WeatherReport> getData() {
    	//Fill your code here 
    	return (List<WeatherReport>) wr.findAll();

	}
	
	public WeatherReport addCases(WeatherReport cases) {
		//Fill your code here
		return wr.save(cases);

	}

	public WeatherReport updateCases(WeatherReport cases) {
		//Fill your code here
		return wr.save(cases);

	}
	
	public WeatherReport view(Long id) {
		//Fill your code here
		return wr.findById(id).get();

	}
	
	public Boolean deleteCases(Long id) {
        //Fill your code here
		try {
			wr.deleteById(id);
			return true;
		}
		catch(Exception e){
			return false;
		}
		

	}

}