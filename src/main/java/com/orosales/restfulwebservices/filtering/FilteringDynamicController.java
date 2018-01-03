package com.orosales.restfulwebservices.filtering;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringDynamicController {
	
	//fiel1, field2
	@GetMapping("/filteringDynamic")
	public MappingJacksonValue retrieveSomeBeanDynamic() {
		SomeBeanDynamic someBeanDynamic = new SomeBeanDynamic("field1", "field2", "field3");
		
		SimpleBeanPropertyFilter filter =  SimpleBeanPropertyFilter.filterOutAllExcept("field1");
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("someBeanFilter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(someBeanDynamic);
		mapping.setFilters(filters);
		
		return mapping;
	}


}
