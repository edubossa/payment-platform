package br.com.gateway.payment.routes;

import org.apache.camel.builder.RouteBuilder;

/**
 * Created by wallace on 31/07/16.
 */
public class DesignTemplate extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("redecard://ws?type=Credit&operation=authorization&version=komerci");
        from("redecard://ws?type=Credit&operation=authorization&version=adquirencia");

        from("cielo://ws?type=Credit&operation=authorization&version=1.5");
        from("cielo://ws?type=Credit&operation=authorization&version=3.0");

        from("direct:payment")
            .to("gateway://cielo?type=Credit&version=API3.0&retry=5");

        from("direct:payment")
            .to("gateway://redecard?type=Credit&version=API3.0&retry=5");

        from("direct:payment")
            .to("gateway://getnet?type=Credit&version=API3.0&retry=5");

        from("direct:payment")
            .to("gateway://elavon?type=Credit&version=API3.0&retry=5");

        from("direct:payment")
            .to("gateway:bradesco?version=0.0.3&retentativa=3&type=BOLETO");

        from("direct:payment")
            .to("gateway:bradesco?version=0.0.3&retentativa=3&type=TRANSFERENCIA");

        from("direct:payment")
            .to("gateway:itau?version=0.0.3&retentativa=3&type=BOLETO");

        from("direct:payment")
            .to("gateway:itau?version=0.0.3&retentativa=3&type=TRANSFERENCIA");

        from("direct:payment")
                .to("gateway:pagseguro?version=0.0.1&retentativa=4");

        from("direct:payment")
                .to("gateway:paypal?version=0.0.1&retentativa=4");

        from("direct:payment")
                .to("gateway:notification?url=http://localhost/notification/payment");

    }
}
