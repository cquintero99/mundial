package co.com.example.mundial.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Seleccion implements Serializable {
	@Id
	@SequenceGenerator(name="seleccion_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seleccion_id_seq")
	private Integer id;
	private String nombre;
	@Column(name="continente_id")
	private Integer idContinente;
	private String grupo;

}
