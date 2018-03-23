package br.com.ntk.gateway;

/**
 * Created by wallace on 12/07/17.
 */
public class Transaction {

    private String referenceId;
    private Integer amount;
    private String description;
    private String postBackUrl;
    private Customer customer;
    private Payment payment;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostBackUrl() {
        return postBackUrl;
    }

    public void setPostBackUrl(String postBackUrl) {
        this.postBackUrl = postBackUrl;
    }

    public Customer getCustomer() {
        if (customer == null) customer = new Customer();
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        if (payment == null) payment = new Payment();
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public static TransactionBuilder create() {
        return new TransactionBuilder();
    }

}
