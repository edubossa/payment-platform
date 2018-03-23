package br.com.ntk.gateway;

/**
 * Created by wallace on 12/07/17.
 */
public class Customer {

    private String name;
    private String document;

    public Customer() {
    }

    public Customer(String name, String document) {
        this.name = name;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

}
