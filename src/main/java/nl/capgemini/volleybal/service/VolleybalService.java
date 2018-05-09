package nl.capgemini.volleybal.service;

import nl.capgemini.volleybal.model.Volleybal;
import nl.capgemini.volleybal.repository.VolleybalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class VolleybalService {

    @Autowired
    private VolleybalRepository repo;

    public Optional<Volleybal> findById(long id) {
        return this.repo.findById(id);
    }

    @Transactional
    public Volleybal update(long id, Volleybal ball) {
        Optional<Volleybal> optionalVolleybal = this.repo.findById(id);
        if (optionalVolleybal.isPresent()) {
            Volleybal victim = optionalVolleybal.get();
            victim.setPressure(ball.getPressure());

            return this.repo.save(victim);
        } else {
            return null;
        }
    }

    public void deleteById(long id) {
        this.repo.deleteById(id);
    }
}
