package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Colaborador;
import com.example.demo.repositories.ColaboradorRepository;

@Service
public class ColaboradorService {
	private final ColaboradorRepository colaboradorRepository;
	
	@Autowired
	public ColaboradorService(ColaboradorRepository colaboradorRepository) {
		this.colaboradorRepository = colaboradorRepository;
	}
	
	public Colaborador saveColaborador(Colaborador colaborador) {
		return colaboradorRepository.save(colaborador);
	}
	
	public Colaborador getColaboradorById(Long id) {
		return colaboradorRepository.findById(id).orElse(null);
	}
	
	public List<Colaborador> getAllColaboradores(){
		return colaboradorRepository.findAll();
	}	
	
	public void deleteColaborador(Long id) {
		colaboradorRepository.deleteById(id);
	}
}
