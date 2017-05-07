package com.enrikraymtz.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.enrikraymtz.model.Persona;
import com.enrikraymtz.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

	private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);
	
	@Override
	public List<Persona> getListPeople() {
		List<Persona> people = new ArrayList<>();
		people.add(new Persona("Henry", 25));
		people.add(new Persona("David", 30));
		people.add(new Persona("Uriel", 27));
		people.add(new Persona("Daniel", 18));
		LOG.info("Hola desde exampleService");
		return people;		
	}
	
	
}
