package br.com.gateway.acquirer;

import org.apache.camel.Exchange;

/**
 * Created by wallace on 12/08/16.
 */
public interface AcquirerComponent {

    String execute(Exchange exchange);
}
