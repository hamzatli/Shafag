package az.shafag.testapp.dao.repository;

import az.shafag.testapp.model.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecifitacionRepository extends CrudRepository<Specification,Long> {
}
