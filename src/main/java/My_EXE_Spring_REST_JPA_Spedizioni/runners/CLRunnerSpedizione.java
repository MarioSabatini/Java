package My_EXE_Spring_REST_JPA_Spedizioni.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import My_EXE_Spring_REST_JPA_Spedizioni.models.Spedizione;
import My_EXE_Spring_REST_JPA_Spedizioni.repository.MySpedizioneRepository;

@Component
@Order(1)
public class CLRunnerSpedizione implements CommandLineRunner{
	@Autowired
	MySpedizioneRepository mySpedizioneRepository;
	@Override
	public void run(String... args) throws Exception {	
//		mySpedizioneRepository.save(new Spedizione("Milano, Via Roma 1","In consegna"));
//		mySpedizioneRepository.save(new Spedizione("Roma, Via Roma 2","In preparazione"));

	}
}
