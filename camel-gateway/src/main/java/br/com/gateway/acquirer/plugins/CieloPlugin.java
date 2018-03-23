package br.com.gateway.acquirer.plugins;

import java.util.UUID;

/**
 * Created by wallace on 12/08/16.
 */
public class CieloPlugin {

    public String send() {
        return UUID.randomUUID().toString();
    }
}
