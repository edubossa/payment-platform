package br.com.ntk.gateway;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by wallace on 12/07/17.
 */
public class Main {

    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {

        Transaction t = Transaction.create()
                .referenceId("98787676POSD")
                .amount(1500)
                .description("Mouse sem fio")
                .postBackUrl("http://cert.gate2all.com.br/notificacao/index.php")
                .name("Comprador Teste")
                .document("12345678909")
                .type(CardType.Credit)
                .softDescriptor("Gate2all")
                .interestType(InterestType.Administrator)
                .authenticate(Authenticate.All)
                .provider(Provider.Stone)
                .number("4485913582528915")
                .expirationMonth("04")
                .expirationYear("2018")
                .cvv("234")
                .brand(Brand.Visa)
                .holderName("Eduardo Wallace")
                .build();

        String json = gson.toJson(t);
        System.out.println(json);

    }

}
