package co.com.example.mundial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.example.mundial.entities.Partido;
import co.com.example.mundial.repository.IPartidoRepository;

@RestController
@RequestMapping("/partido")
@CrossOrigin
public class PartidoController {
	@Autowired
	IPartidoRepository partidoRepository;
	
	@GetMapping
	public List<Partido>lista(){
		return partidoRepository.findAll();
	}
	
	
	

}
