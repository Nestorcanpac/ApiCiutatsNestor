package com.example.ApiCiutatsNestor.Controller;


import com.example.ApiCiutatsNestor.Model.Ciutat;
import com.example.ApiCiutatsNestor.Model.CiutatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ciutats")
public class CiutatCrontroller {

    @Autowired
    CiutatRepository ciutatRepository;

    @GetMapping
    public List<Ciutat> obtenirCiutats(){
        return (List<Ciutat>) ciutatRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ciutat> obtenirCiutatPerId(@PathVariable(value = "id")Long id){
        Optional<Ciutat> ciutat = ciutatRepository.findById(id);

        if(ciutat.isPresent()){
            return ResponseEntity.ok().body(ciutat.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Ciutat crearCiutat(@RequestBody Ciutat ciutat){
        return ciutatRepository.save(ciutat);
    }

    @DeleteMapping("/{id}")
    public void eliminarCiutat(@PathVariable Long id){
        ciutatRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ciutat> actualizarCiutat(@PathVariable Long id,@RequestBody Ciutat ciutatActualizada){
        Optional<Ciutat> optionalCiutat= ciutatRepository.findById(id);

        if (optionalCiutat.isPresent()){
            Ciutat ciutat = optionalCiutat.get();
            ciutat.setNom(ciutatActualizada.getNom());
            ciutat.setPoblacio(ciutatActualizada.getPoblacio());
            ciutat.setDescripcio(ciutatActualizada.getDescripcio());
            ciutat.setImatge(ciutatActualizada.getImatge());

            return ResponseEntity.ok().body(ciutatRepository.save(ciutat));

        }
        else {
            return ResponseEntity.notFound().build();
        }

    }

}
