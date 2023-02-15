package My_EXE_Spring_REST_JPA_Spedizioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import My_EXE_Spring_REST_JPA_Spedizioni.models.Spedizione;
import jakarta.transaction.Transactional;

//JpaRepository <Tipo entity, tipo PrimaryKey dell'entity>
public interface MySpedizioneRepository extends JpaRepository<Spedizione, Integer>{
	@Transactional
	@Modifying
	@Query("UPDATE Spedizione s SET s.indirizzo = ?1, s.stato = ?2 where s.idSpedizione = ?3")
	void myUpdateSpedizioneById(String indirizzo, String stato, int id);
	
//	Spedizione findByIdCliente(int id_cliente);
}
