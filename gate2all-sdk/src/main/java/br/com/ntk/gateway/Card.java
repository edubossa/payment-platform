package br.com.ntk.gateway;

/**
 * Created by wallace on 12/07/17.
 */
public class Card {

    private CardType type;
    private String softDescriptor;
    private Boolean capture = Boolean.FALSE;
    private Integer installments = 1;
    private InterestType interestType;
    private Authenticate authenticate;
    private Boolean saveCard = Boolean.FALSE;
    private Provider provider;
    private CardInfo cardInfo;

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public String getSoftDescriptor() {
        return softDescriptor;
    }

    public void setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    public Boolean getCapture() {
        return capture;
    }

    public void setCapture(Boolean capture) {
        this.capture = capture;
    }

    public Integer getInstallments() {
        return installments;
    }

    public void setInstallments(Integer installments) {
        this.installments = installments;
    }

    public InterestType getInterestType() {
        return interestType;
    }

    public void setInterestType(InterestType interestType) {
        this.interestType = interestType;
    }

    public Authenticate getAuthenticate() {
        return authenticate;
    }

    public void setAuthenticate(Authenticate authenticate) {
        this.authenticate = authenticate;
    }

    public Boolean getSaveCard() {
        return saveCard;
    }

    public void setSaveCard(Boolean saveCard) {
        this.saveCard = saveCard;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public CardInfo getCardInfo() {
        if (cardInfo == null) cardInfo = new CardInfo();
        return cardInfo;
    }

    public void setCardInfo(CardInfo cardInfo) {
        this.cardInfo = cardInfo;
    }
}
