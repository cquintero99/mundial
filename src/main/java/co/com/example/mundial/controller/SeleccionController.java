package co.com.example.mundial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.example.mundial.entities.Seleccion;
import co.com.example.mundial.repository.ISeleccionRepository;

@RestController
@RequestMapping("/seleccion")
@CrossOrigin
public class SeleccionController {
	@Autowired
	ISeleccionRepository seleccionRepository;
	
	@GetMapping
	public List<Seleccion> lista(){
		return seleccionRepository.findAll();
	}

}
