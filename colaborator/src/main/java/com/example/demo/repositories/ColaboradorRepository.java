package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Colaborador;

//classe de conexão
public interface ColaboradorRepository extends JpaRepository<Colaborador, Long>{

}
