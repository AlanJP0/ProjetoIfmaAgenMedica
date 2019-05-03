package ifma.atv.agenda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ifma.atv.agenda.modelo.medico;

@Repository
public class medicoRepositorio  extends JpaRepository<Produto, Integer> {
}
