package cieloecommerce.sdk.tmp;

/**
 * Created by wallace on 11/07/17.
 */
public class Exercicio {

    private String exercicio;
    private String serie;
    private int repeticao;
    private String observacao;
    private String urlImagem;

    public Exercicio() {}

    public Exercicio(String exercicio, String serie, int repeticao, String observacao, String urlImagem) {
        this.exercicio = exercicio;
        this.serie = serie;
        this.repeticao = repeticao;
        this.observacao = observacao;
        this.urlImagem = urlImagem;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getRepeticao() {
        return repeticao;
    }

    public void setRepeticao(int repeticao) {
        this.repeticao = repeticao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    @Override
    public String toString() {
        return "Exercicio{" +
                "exercicio='" + exercicio + '\'' +
                ", serie='" + serie + '\'' +
                ", repeticao=" + repeticao +
                ", observacao='" + observacao + '\'' +
                ", urlImagem='" + urlImagem + '\'' +
                '}';
    }

}
