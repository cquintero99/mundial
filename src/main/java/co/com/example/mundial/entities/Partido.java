package co.com.example.mundial.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
@Data
@Entity
public class Partido {
	@Id
	@SequenceGenerator(name="partido_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "partido_id_seq")
	private Integer id;
	private Date fecha;
	@Column(name="estadio_id")
	private Integer estadioId;

}
