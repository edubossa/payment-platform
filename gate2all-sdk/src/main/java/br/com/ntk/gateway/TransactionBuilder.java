package br.com.ntk.gateway;

/**
 * Created by wallace on 12/07/17.
 */
public class TransactionBuilder {

    private Transaction transaction;

    public TransactionBuilder() {
        this.transaction = new Transaction();
    }

    public TransactionBuilder referenceId(String referenceId) {
        this.transaction.setReferenceId(referenceId);
        return this;
    }

    public TransactionBuilder amount(Integer amount) {
        this.transaction.setAmount(amount);
        return this;
    }

    public TransactionBuilder description(String description) {
        this.transaction.setDescription(description);
        return this;
    }

    public TransactionBuilder postBackUrl(String postBackUrl) {
        this.transaction.setPostBackUrl(postBackUrl);
        return this;
    }

    public TransactionBuilder name(String name) {
        this.transaction.getCustomer().setName(name);
        return this;
    }

    public TransactionBuilder document(String document) {
        this.transaction.getCustomer().setDocument(document);
        return this;
    }

    public TransactionBuilder type(CardType type) {
        this.transaction.getPayment().getCard().setType(type);
        return this;
    }

    public TransactionBuilder softDescriptor(String softDescriptor) {
        this.transaction.getPayment().getCard().setSoftDescriptor(softDescriptor);
        return this;
    }

    public TransactionBuilder capture(Boolean capture) {
        this.transaction.getPayment().getCard().setCapture(capture);
        return this;
    }

    public TransactionBuilder installments(Integer installments) {
        this.transaction.getPayment().getCard().setInstallments(installments);
        return this;
    }

    public TransactionBuilder interestType(InterestType interestType) {
        this.transaction.getPayment().getCard().setInterestType(interestType);
        return this;
    }

    public TransactionBuilder authenticate(Authenticate authenticate) {
        this.transaction.getPayment().getCard().setAuthenticate(authenticate);
        return this;
    }

    public TransactionBuilder saveCard(Boolean saveCard) {
        this.transaction.getPayment().getCard().setSaveCard(saveCard);
        return this;
    }

    public TransactionBuilder provider(Provider provider) {
        this.transaction.getPayment().getCard().setProvider(provider);
        return this;
    }

    public TransactionBuilder number(String number) {
        this.transaction.getPayment().getCard().getCardInfo().setNumber(number);
        return this;
    }

    public TransactionBuilder expirationMonth(String expirationMonth) {
        this.transaction.getPayment().getCard().getCardInfo().setExpirationMonth(expirationMonth);
        return this;
    }

    public TransactionBuilder expirationYear(String expirationYear) {
        this.transaction.getPayment().getCard().getCardInfo().setExpirationYear(expirationYear);
        return this;
    }

    public TransactionBuilder cvv(String cvv) {
        this.transaction.getPayment().getCard().getCardInfo().setCvv(cvv);
        return this;
    }

    public TransactionBuilder brand(Brand brand) {
        this.transaction.getPayment().getCard().getCardInfo().setBrand(brand);
        return this;
    }

    public TransactionBuilder holderName(String holderName) {
        this.transaction.getPayment().getCard().getCardInfo().setHolderName(holderName);
        return this;
    }

    public Transaction build() {
        return this.transaction;
    }

}