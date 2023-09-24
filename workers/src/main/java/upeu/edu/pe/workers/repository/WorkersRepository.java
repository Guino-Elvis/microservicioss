package upeu.edu.pe.workers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu.edu.pe.workers.entity.Workers;

public interface WorkersRepository extends JpaRepository<Workers, Integer> {

}
