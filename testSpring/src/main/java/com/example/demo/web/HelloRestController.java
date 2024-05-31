package com.example.demo.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Personne;
import com.example.demo.repositories.PersonneRepo;

@RestController
public class HelloRestController {

	private PersonneRepo personneRepo;
	public HelloRestController(PersonneRepo personneRepo) {
		this.personneRepo = personneRepo;
	}
	
	@GetMapping("/personnes/{id}")
	public Personne findBy(@PathVariable("id") int id){
		return personneRepo.findById(id).get();
	}
}
