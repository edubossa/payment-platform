package cieloecommerce.sdk.tmp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by wallace on 11/07/17.
 */
public class TreinoTest {

    public static void main(String[] args) {

        Treino treino = new Treino();
        treino.setAluno("EDUARDO WALLACE DA SILVA");
        treino.setCod(52221038);
        treino.setTreino("INTERMEDIARIO I");
        treino.setProfessor("PATRICIA SOUZA BONETTI");
        treino.setRealizados(3);
        treino.setRestantes(7);
        treino.setRotina("A");

        treino.add(new Exercicio("Trote Leve", "1x", 1, "5 min aquecimento", "http://shopathletic.vteximg.com.br/arquivos/ids/156847-220-240/03.jpg"));
        treino.add(new Exercicio("Supino Vertical", "3x", 12, "Alternado por 2 exercicios", "http://shopathletic.vteximg.com.br/arquivos/ids/156847-220-240/03.jpg"));
        treino.add(new Exercicio("Tricips polia alta", "3x", 10, "", "http://shopathletic.vteximg.com.br/arquivos/ids/156847-220-240/03.jpg"));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(treino);
        System.out.println(json);


    }

}
