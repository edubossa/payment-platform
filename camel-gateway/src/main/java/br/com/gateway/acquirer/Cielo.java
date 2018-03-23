package br.com.gateway.acquirer;

import br.com.gateway.acquirer.plugins.CieloPlugin;

/**
 * Created by wallace on 12/08/16.
 */
@Acquirer(className = "br.com.gateway.component.Cielo")
public class Cielo {

    @Acquirer(method = "executeV1", version = "1.5", description = "Webservice-1.5")
    public String executeV1() {
        return new CieloPlugin().send();
    }

    @Acquirer(method = "executeV2", version = "3.0", description = "Webservice-3.0")
    public String executeV2() {
        return new CieloPlugin().send();
    }

}
