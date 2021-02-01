package com.example.AsyncDemo.Repository;

import java.util.ArrayList;
import java.util.List;

import com.example.AsyncDemo.Model.Country;
import com.example.AsyncDemo.Model.Language;

public class GlobalRepository {

	public List<Country> listOfCountry() {
	
		List<Country> countryList = new ArrayList<Country>();
		Country country = new Country();
		country.setId(1);
		country.setName("india");
		
		
		Country country1 = new Country();
		country1.setId(2);
		country1.setName("usa");
	
		
		Country country2 = new Country();
		country2.setId(3);
		country2.setName("uk");
	
		
		Country country3 = new Country();
		country3.setId(4);
		country3.setName("france");
		
		
		Country country4 = new Country();
		country4.setId(5);
		country4.setName("sri lanka");
		
		
		Country country5 = new Country();
		country5.setId(6);
		country5.setName("australia");
		
		countryList.add(country4);
		countryList.add(country3);
		countryList.add(country1);
		countryList.add(country);
		countryList.add(country2);
		countryList.add(country5);
		
		return countryList;

	}
	protected void cancels()
	{
		
	}

	public List<Language> listOfLanguages() {
		List<Language> languageList = new ArrayList<Language>();
		Language language = new Language();
		language.setLanguage("hindi");
		language.setLanguage("english");
		language.setLanguage("french");
		language.setLanguage("singala");
		language.setLanguage("tamil");
		language.setLanguage("malayalam");
		languageList.add(language);

		return languageList;

	}

}
