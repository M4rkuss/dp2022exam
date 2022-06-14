package exam2022.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import exam2022.table2.Data3;

@RepositoryRestResource
@CrossOrigin(origins = "*")

public interface Table2Repository extends JpaRepository<Table2, Integer> {


}