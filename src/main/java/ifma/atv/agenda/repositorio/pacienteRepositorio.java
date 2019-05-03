package ifma.atv.agenda.repositorio;

import ifma.atv.agenda.modelo.paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class pacienteRepositorio extends JpaRepository<Produto, Integer> {
}
