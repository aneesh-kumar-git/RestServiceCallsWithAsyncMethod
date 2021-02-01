package com.example.AsyncDemo.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AsyncDemo.Model.Country;
import com.example.AsyncDemo.Model.Language;
import com.example.AsyncDemo.Services.UnitService;

@RestController
public class AsycController {
	
	org.slf4j.Logger logger=LoggerFactory.getLogger(AsycController.class);
	
	private final  UnitService unitservice;
	AsycController(UnitService unitservice)
	{
		this.unitservice=unitservice;
	}
	
	@RequestMapping("/get")
	public List<String> getResponse() throws Throwable
	{
		CompletableFuture<List<Country>> country=unitservice.getAllCountries();
		CompletableFuture<List<Language>> language=unitservice.getAllLanguages();
		
		List<String> languagecountry = null;
		try {
			languagecountry=new ArrayList<String>(country.get().stream().map(Country::getName).collect(Collectors.toList()));
			logger.info("country",languagecountry);
			languagecountry.retainAll(language.get().stream().map(Language::getLanguage).collect(Collectors.toList()));
		} catch (Throwable e) {
			e.getCause();
		} 
		
		return languagecountry;
		
	}
	@GetMapping("/getAll")
	public List<Country> getAll()
	{
		return unitservice.getCountryList();
	}
	

}
