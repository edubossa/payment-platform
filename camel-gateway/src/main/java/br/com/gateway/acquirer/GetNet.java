package br.com.gateway.acquirer;

import br.com.gateway.configuration.GatewayConfiguration;

/**
 * Created by wallace on 12/08/16.
 */
public class GetNet {

    private final GatewayConfiguration configuration;

    public GetNet(GatewayConfiguration configuration) {
        this.configuration = configuration;
    }


    public void execute(){
        System.out.println(configuration.getVersion());
    }

}
