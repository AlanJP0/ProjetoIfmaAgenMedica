package ifma.atv.agenda.modelo;


import javax.persistence.*;

@Entity
public class paciente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String nome;
    private String nomePais;
    private String sexo;
    private String datanas;
    private String endereco;
    private String fone;
    private String prontuario;
    private int peso;
    private int altura;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNomePais() {
        return nomePais;
    }

    public String getSexo() {
        return sexo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getDatanas() {
        return datanas;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }


}
