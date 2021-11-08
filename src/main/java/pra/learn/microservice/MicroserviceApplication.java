package pra.learn.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pra.learn.microservice.entity.Country;
import pra.learn.microservice.repo.CountryRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
//		(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@RestController
public class MicroserviceApplication {

	@Autowired
	private CountryRepo countryRepo;

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApplication.class, args);
	}

	@RequestMapping("/list")
	public java.util.List<String>getCountries(){
		return Arrays.asList("CONGO","SWAZILAND","CZEK","PANAMA");
	}

	@RequestMapping("/insertnprint")
	public String insertNPrint(){
		pra.learn.microservice.entity.Country country = new Country("TURKEY",131313l);
		countryRepo.save(country);
		country = null;
		country = new Country("BUSSIA",141414l);
		countryRepo.save(country);
		country = countryRepo.getByCountryName("BUSSIA");
		return country.getCountryName();
	};
}
