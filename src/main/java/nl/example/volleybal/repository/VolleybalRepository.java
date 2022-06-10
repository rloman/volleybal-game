package nl.example.volleybal.repository;

import nl.example.volleybal.model.Volleybal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolleybalRepository extends CrudRepository<Volleybal, Long>{
}
