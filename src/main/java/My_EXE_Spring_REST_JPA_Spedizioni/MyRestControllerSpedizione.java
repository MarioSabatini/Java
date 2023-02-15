package My_EXE_Spring_REST_JPA_Spedizioni;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import My_EXE_Spring_REST_JPA_Spedizioni.models.Spedizione;

@RestController
@RequestMapping("/spedizione")
public class MyRestControllerSpedizione {
	@Autowired
	private MyServiceSpedizione myServiceSpedizione;
	
	/* GET */
	@GetMapping("/mygetallspedizioni")
	public List<Spedizione> myGetAllSpedizione() {
		return myServiceSpedizione.myFindAllSpedizione();
	}
	/* Insert */
	@PostMapping("/myinsertspedizione")
	public String myInsertSpedizione(@RequestBody Spedizione mySpedizione) {
		return myServiceSpedizione.myInsertSpedizione(mySpedizione);
	}
	
	/* Update */
	@PostMapping("/myupdatespedizione")
	public String myUpdateCliente(@RequestBody Spedizione mySpedizione) {
		return myServiceSpedizione.myUpdateSpedizione(mySpedizione);
	}
	
	/* Delete */
	@DeleteMapping("/mydeletespedizione/{id}")
	public String myDeleteSpedizione(@PathVariable int id) {
		return myServiceSpedizione.myDeleteSpedizione(id);
	}
}
