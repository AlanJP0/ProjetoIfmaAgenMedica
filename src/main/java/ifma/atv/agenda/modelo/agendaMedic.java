package ifma.atv.agenda.modelo;


import javax.persistence.*;


@Entity
public class agendaMedic {


    private String data;
    private String horario;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
