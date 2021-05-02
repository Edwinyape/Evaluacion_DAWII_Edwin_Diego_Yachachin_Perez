package com.empresa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Transnacional;
import com.empresa.repository.TransnacionalRepository;

@Service
public class TransnacionalserviceImpl implements TransnacionalService{
	
	@Autowired
	private TransnacionalRepository repositorio;
	@Override
	public Transnacional insertaTransnacional(Transnacional obj) {
		return repositorio.save(obj);
	}

}
