package com.orosales.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public SomeBean retrievesSomeBean() {
		return new SomeBean("field1", "field2", "field3");
	}
	
	@GetMapping("/filteringList")
	public List<SomeBean> retrievesSomeListBean() {
		return Arrays.asList(new SomeBean("field1", "field2", "field3"),
				new SomeBean("field12", "field22", "field32"));
	}
	
}
