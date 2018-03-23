package br.com.gateway.acquirer;

/**
 * Created by wallace on 12/08/16.
 */
public enum TypeAcquirer {

    CIELO_API_1_5("cielo.ws.1.5"),

    CIELO_API_3_0("cielo.ws.3.0");

    private String queue;

    TypeAcquirer(String queue) {
        this.queue = queue;
    }

    public String getQueue() {
        return queue;
    }
}
