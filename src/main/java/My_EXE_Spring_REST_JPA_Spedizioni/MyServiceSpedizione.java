package My_EXE_Spring_REST_JPA_Spedizioni;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import My_EXE_Spring_REST_JPA_Spedizioni.models.Spedizione;
import My_EXE_Spring_REST_JPA_Spedizioni.repository.MySpedizioneRepository;

@Service
public class MyServiceSpedizione {
	@Autowired
	MySpedizioneRepository mySpedizioneRepository;
	
	public List<Spedizione> myFindAllSpedizione() {
		return mySpedizioneRepository.findAll();
	}
	
	public String myInsertSpedizione(Spedizione mySpedizione) {
		mySpedizioneRepository.save(mySpedizione);
		return "La Spedizione è stata inserita";
	}
	
	public String myUpdateSpedizione(Spedizione mySpedizione) {
		mySpedizioneRepository.myUpdateSpedizioneById(mySpedizione.getIndirizzo(),mySpedizione.getStato(),mySpedizione.getIdSpedizione());
		return "La Spedizione è stata aggiornata";
	}
	
	public String myDeleteSpedizione(int id) {
		mySpedizioneRepository.deleteById(id);
		return "La Spedizione è stata eliminata";
	}
	
}
