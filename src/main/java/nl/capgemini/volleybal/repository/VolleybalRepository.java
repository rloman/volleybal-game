package nl.capgemini.volleybal.repository;

import nl.capgemini.volleybal.model.Volleybal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolleybalRepository extends CrudRepository<Volleybal, Long>{
}
