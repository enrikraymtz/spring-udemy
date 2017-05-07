package com.enrikraymtz.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.enrikraymtz.model.Mensaje;
import com.enrikraymtz.service.EjercicioService;

@Service("ejercicioService")

public class MensajeServiceImpl implements EjercicioService {
	
	@Override
	public List<Mensaje> getListMensaje() {
		List<Mensaje> msj = new ArrayList();
		msj.add(new Mensaje(1, "Hola como estas"));
		msj.add(new Mensaje(2, "Bien bien y tu?"));
		return msj;
		
	}

}
