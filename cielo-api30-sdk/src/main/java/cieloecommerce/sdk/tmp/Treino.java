package cieloecommerce.sdk.tmp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wallace on 11/07/17.
 */
public class Treino {

    private String aluno;
    private int cod;
    private String treino;
    private String professor;
    private int realizados;
    private int restantes;
    private String rotina;
    private List<Exercicio> exercicios = new ArrayList<>();

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTreino() {
        return treino;
    }

    public void setTreino(String treino) {
        this.treino = treino;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getRealizados() {
        return realizados;
    }

    public void setRealizados(int realizados) {
        this.realizados = realizados;
    }

    public int getRestantes() {
        return restantes;
    }

    public void setRestantes(int restantes) {
        this.restantes = restantes;
    }

    public String getRotina() {
        return rotina;
    }

    public void setRotina(String rotina) {
        this.rotina = rotina;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public void add(Exercicio exercicio) {
        this.exercicios.add(exercicio);
    }

    @Override
    public String toString() {
        return "Treino{" +
                "aluno='" + aluno + '\'' +
                ", cod=" + cod +
                ", treino='" + treino + '\'' +
                ", professor='" + professor + '\'' +
                ", realizados=" + realizados +
                ", restantes=" + restantes +
                ", rotina='" + rotina + '\'' +
                ", exercicios=" + exercicios +
                '}';
    }
}
