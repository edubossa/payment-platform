package br.com.gateway.acquirer;

/**
 * Created by wallace on 12/08/16.
 */
@Acquirer(className = "Rede")
public class Rede {

    @Acquirer(method = "executeV1", version = "1.0", description = "WebService Komerci")
    public String executeV1() {
        return null;
    }

    @Acquirer(method = "executeV2", version = "1.0", description = "E-Rede Adquirência")
    public String executeV2() {
        return null;
    }


}
