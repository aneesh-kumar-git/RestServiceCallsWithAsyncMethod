package com.example.AsyncDemo.Services;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.AsyncDemo.Model.Country;
import com.example.AsyncDemo.Model.Language;
import com.example.AsyncDemo.Repository.GlobalRepository;
@Service
public class UnitService extends GlobalRepository{


	@Async
	public CompletableFuture<List<Country>> getAllCountries() {
		GlobalRepository repo = new GlobalRepository();
		List<Country> countryList = repo.listOfCountry();

		return CompletableFuture.completedFuture(countryList);

	}
	@Async
	public CompletableFuture<List<Language>> getAllLanguages() {
		GlobalRepository repo = new GlobalRepository();
		List<Language> countryList = repo.listOfLanguages();

		return CompletableFuture.completedFuture(countryList);

	}
	
	public List<Country> getCountryList()
	{
		GlobalRepository repo = new GlobalRepository();
		List<Country> countryList = repo.listOfCountry();
		return countryList;
	}

}
