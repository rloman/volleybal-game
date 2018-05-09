package nl.capgemini.volleybal.controller;

import nl.capgemini.volleybal.model.Volleybal;
import nl.capgemini.volleybal.service.VolleybalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/volleybal")
public class VolleybalController {

    @Autowired
    private VolleybalService service;


    @PutMapping("{id}")
    // http://localhost:8080/api/volleybal/3
    public ResponseEntity<Volleybal> updateById(@PathVariable long id, @RequestBody Volleybal volleybal) {

        return new ResponseEntity<Volleybal>(this.service.update(id, volleybal), HttpStatus.OK);

    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable long id) {
         this.service.deleteById(id);
    }


    @GetMapping("{id}")
    public ResponseEntity<Volleybal> findById(@PathVariable long id) {

        Optional<Volleybal> optionalVolleybal = this.service.findById(id);
        if(optionalVolleybal.isPresent()) {
            return new ResponseEntity<>(optionalVolleybal.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
