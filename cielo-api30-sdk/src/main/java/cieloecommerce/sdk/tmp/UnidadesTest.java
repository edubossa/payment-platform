package cieloecommerce.sdk.tmp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wallace on 11/07/17.
 *
 * http://novosite.runner.com.br/unidades
 */
public class UnidadesTest {

    public static void main(String[] args) {

        List<Unidade> unidades = new ArrayList<>();
        //----------------------------------------------//
        Unidade butanta = new Unidade();
        butanta.setNome("ACADEMIA RUNNER");
        butanta.setCidade("BUTANTÃ CLUB");
        butanta.setEndereco("Av. Dr. Cândido Motta Filho, 731 - Butantã/Vila São Francisco - São Paulo");
        butanta.setTelefone("(11) 2365-9329");
        butanta.setHorarioFuncionamento("De segunda a sexta-feira, das 6h às 23h; Sábado das 9h às 18h; Domingos e Feriados das 10h às 17h.");
        butanta.setUrlImagem("https://novosite.runner.com.br/storage/app/uploads/public/56c/cd2/9ab/thumb_456_256x196_0_0_crop.jpg");
        butanta.setLatitude("-23.5583822");
        butanta.setLongitude("-46.7556181");
        //----------------------------------------------//
        Unidade campoBelo = new Unidade();
        campoBelo.setNome("ACADEMIA RUNNER");
        campoBelo.setCidade("CAMPO BELO");
        campoBelo.setEndereco("Rua Antônio de Macedo Soares, 1793 - Campo Belo - São Paulo");
        campoBelo.setTelefone("(11) 5093-6662 / (11) 5093-6664");
        campoBelo.setHorarioFuncionamento("De segunda a sexta-feira das 6h às 23h. Sábados das 9h às 16h.");
        campoBelo.setUrlImagem("http://novosite.runner.com.br/storage/app/uploads/public/594/148/3a1/thumb_1399_256x196_0_0_crop.jpg");
        campoBelo.setLatitude("-23.6171565");
        campoBelo.setLongitude("-46.6705098");
        //----------------------------------------------//
        Unidade frequesia = new Unidade();
        frequesia.setNome("ACADEMIA RUNNER");
        frequesia.setCidade("FREGUESIA DO Ó");
        frequesia.setEndereco("Rua Chico de Paula, 365 - Freguesia do Ó - São Paulo");
        frequesia.setTelefone("(11) 3931-0101");
        frequesia.setHorarioFuncionamento("Segunda a sexta das 06h às 22h; Sábados das 8h às 14h.");
        frequesia.setUrlImagem("http://novosite.runner.com.br/storage/app/uploads/public/581/ccd/177/thumb_783_256x196_0_0_crop.jpg");
        frequesia.setLatitude("-23.5002679");
        frequesia.setLongitude("-46.7014172");
        //----------------------------------------------//
        Unidade higienopolis = new Unidade();
        higienopolis.setNome("ACADEMIA RUNNER");
        higienopolis.setCidade("HIGIENÓPOLIS");
        higienopolis.setEndereco("Av. Angélica, 635 - Higienópolis - São Paulo");
        higienopolis.setTelefone("(11) 3667-4874");
        higienopolis.setHorarioFuncionamento("De segunda a sexta-feira, das 6h às 23h. Sábado das 9h às 16h.");
        higienopolis.setUrlImagem("http://novosite.runner.com.br/storage/app/uploads/public/57d/84f/1f2/thumb_664_256x196_0_0_crop.png");
        higienopolis.setLatitude("-23.5385492");
        higienopolis.setLongitude("-46.6545303");
        //----------------------------------------------//
        Unidade leopoldina = new Unidade();
        leopoldina.setNome("ACADEMIA RUNNER");
        leopoldina.setCidade("Leopoldina");
        leopoldina.setEndereco("Av. Imperatriz Leopoldina, 1496 - Vila leopoldina - São Paulo");
        leopoldina.setTelefone("11 3835-4001");
        leopoldina.setHorarioFuncionamento("De segunda a sexta-feira, das 6h às 23h; Sábado das 9h às 15h; Domingo das 10h às 13h.");
        leopoldina.setUrlImagem("http://novosite.runner.com.br/storage/app/uploads/public/581/8df/0ed/thumb_759_256x196_0_0_crop.jpg");
        leopoldina.setLatitude("-23.534011");
        leopoldina.setLongitude("-46.7280817");
        //----------------------------------------------//
        Unidade mooca = new Unidade();
        mooca.setNome("ACADEMIA RUNNER");
        mooca.setCidade("Mooca");
        mooca.setEndereco("Rua Siqueira Bueno, 1085 - Mooca, São Paulo - SP");
        mooca.setTelefone("11 2291-3289");
        mooca.setHorarioFuncionamento("Seg a Qui: 06h as 23h Sex: 06h as 22h Sábado: 08h as 14h Domingo : 09h as 13h");
        mooca.setUrlImagem("https://novosite.runner.com.br/storage/app/uploads/public/566/03b/2ac/thumb_220_256x196_0_0_crop.jpg");
        mooca.setLatitude("-23.5477077");
        mooca.setLongitude("-46.5903581");
        //----------------------------------------------//
        Unidade mogi = new Unidade();
        mogi.setNome("ACADEMIA RUNNER");
        mogi.setCidade("Mogi das Cruzes");
        mogi.setEndereco("Av. Vereador Narciso Yague Guimarães, 1001 - Loja A45 - Mogi das Cruzes - São Paulo");
        mogi.setTelefone("(11) 4728-1464");
        mogi.setHorarioFuncionamento("De segunda à sexta-feira, das 6h às 00h; Sábado, das 8:30h às 16h; Domingo das 10h as 14h.");
        mogi.setUrlImagem("https://novosite.runner.com.br/storage/app/uploads/public/581/8d5/c22/thumb_748_256x196_0_0_crop.jpg");
        mogi.setLatitude("-23.5157454");
        mogi.setLongitude("-46.179432");
        //----------------------------------------------//
        Unidade saoJoseDosCampos = new Unidade();
        saoJoseDosCampos.setNome("ACADEMIA RUNNER");
        saoJoseDosCampos.setCidade("S.J. dos Campos");
        saoJoseDosCampos.setEndereco("Avenida Cassiano Ricardo, 521, 3º andar. São José dos Campos");
        saoJoseDosCampos.setTelefone("12 3797-2323");
        saoJoseDosCampos.setHorarioFuncionamento("2ª à 6ª das 5h30 às 23h. Sábado das 09h às 15h.");
        saoJoseDosCampos.setUrlImagem("https://novosite.runner.com.br/storage/app/uploads/public/565/f81/331/thumb_197_256x196_0_0_crop.jpg");
        saoJoseDosCampos.setLatitude("-23.2178511");
        saoJoseDosCampos.setLongitude("-45.9099947");
        //----------------------------------------------//
        Unidade saoCaetano = new Unidade();
        saoCaetano.setNome("ACADEMIA RUNNER");
        saoCaetano.setCidade("São Caetano");
        saoCaetano.setEndereco("Rua Maranhão,1050, São Caetano - SP");
        saoCaetano.setTelefone("(11)4221-8833");
        saoCaetano.setHorarioFuncionamento("2ª a 6ª das 6h às 23h. Sábado das 9h às 16h. Domingo das 9h às 13h.");
        saoCaetano.setUrlImagem("https://novosite.runner.com.br/storage/app/uploads/public/581/751/ce9/thumb_743_256x196_0_0_crop.jpg");
        saoCaetano.setLatitude("-23.6212259");
        saoCaetano.setLongitude("-46.5630726");
        //----------------------------------------------//
        Unidade saude = new Unidade();
        saude.setNome("ACADEMIA RUNNER");
        saude.setCidade("Saúde");
        saude.setEndereco("Rua Dias de Toledo, 464 - Saúde - São Paulo");
        saude.setTelefone("(11) 5072-6877");
        saude.setHorarioFuncionamento("De segunda a sexta-feira, das 6h às 22h; Sábado das 9h às 14h.");
        saude.setUrlImagem("https://novosite.runner.com.br/storage/app/uploads/public/588/253/10b/thumb_1111_256x196_0_0_crop.jpeg");
        saude.setLatitude("-23.6138412");
        saude.setLongitude("-46.6330743");
        //----------------------------------------------//
        unidades.add(butanta);
        unidades.add(campoBelo);
        unidades.add(frequesia);
        unidades.add(higienopolis);
        unidades.add(leopoldina);
        unidades.add(mooca);
        unidades.add(mogi);
        unidades.add(saoJoseDosCampos);
        unidades.add(saoCaetano);
        unidades.add(saude);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(unidades);
        System.out.println(json);


    }

}
