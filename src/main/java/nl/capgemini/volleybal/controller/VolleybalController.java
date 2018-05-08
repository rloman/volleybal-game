package nl.capgemini.volleybal.controller;

import nl.capgemini.volleybal.model.Volleybal;
import nl.capgemini.volleybal.repository.VolleybalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/volleybal")
public class VolleybalController {


    @Autowired
    private VolleybalRepository repo;

    @PutMapping("{id}")
    // http://localhost:8080/api/volleybal/3
    public ResponseEntity<Volleybal> updateById(@PathVariable long id, @RequestBody Volleybal volleybal) {

        Optional<Volleybal> optionalVolleybal = this.repo.findById(id);
        if(optionalVolleybal.isPresent()) {
            Volleybal victim = optionalVolleybal.get();
            victim.setPressure(volleybal.getPressure());

            return new ResponseEntity<Volleybal>(this.repo.save(victim), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<Volleybal>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable long id) {
         this.repo.deleteById(id);
    }


    @GetMapping("{id}")
    public ResponseEntity<Volleybal> findById(@PathVariable long id) {

        Optional<Volleybal> optionalVolleybal = this.repo.findById(id);
        if(optionalVolleybal.isPresent()) {
            return new ResponseEntity<Volleybal>(optionalVolleybal.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<Volleybal>(HttpStatus.NOT_FOUND);
        }
    }

}
