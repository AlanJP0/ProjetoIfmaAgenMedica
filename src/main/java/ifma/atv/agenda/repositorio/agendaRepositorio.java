package ifma.atv.agenda.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ifma.atv.agenda.modelo.agendaMedic;


@Repository
public class agendaRepositorio  extends JpaRepository<Produto, Integer> {
}
