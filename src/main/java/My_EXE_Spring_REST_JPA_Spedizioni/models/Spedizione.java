package My_EXE_Spring_REST_JPA_Spedizioni.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Spedizione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSpedizione;
	private String indirizzo;
	private String stato;
	
	public Spedizione(String indirizzo, String stato) {
		this.indirizzo = indirizzo;
		this.stato = stato;
	}

	public Spedizione() {
	}

	public int getIdSpedizione() {
		return idSpedizione;
	}

	public void setIdSpedizione(int idSpedizione) {
		this.idSpedizione = idSpedizione;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}
	
}
