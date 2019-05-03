package ifma.atv.agenda.modelo;

import javax.persistence.*;

@Entity
public class medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int cmr;

    public Integer getId() {
        return id;
    }

    public int getCmr() {
        return cmr;
    }


}

