package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.beans.Personne;

public interface PersonneRepo  extends JpaRepository<Personne, Integer>{

}
