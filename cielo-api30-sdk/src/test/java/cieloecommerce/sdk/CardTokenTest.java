package cieloecommerce.sdk;

import cieloecommerce.sdk.ecommerce.*;
import cieloecommerce.sdk.ecommerce.Environment;
import cieloecommerce.sdk.ecommerce.request.CieloRequestException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by wallace on 07/07/17.
 * <p>
 * https://github.com/DeveloperCielo/API-3.0-Java
 */
public class CardTokenTest {

    private Merchant merchant;
    private CardToken cardToken;

    @BeforeTest
    public void setup() {
        this.merchant = new Merchant("94c0f0f6-59e1-44e6-a84b-a9b0d0ba150f", "CXGHHPEORNDIQQMKPEHETHRMHMUOMGKJWFWTBELF");
        this.cardToken = new CardToken().setBrand("Visa")
                .setCardNumber("4532117080573700")
                .setHolder("Eduardo Wallace")
                .setExpirationDate("12/2031");
    }

    @Test
    public void testCardToken() {
        try {
            CardToken cardTokenResponse = new CieloEcommerce(this.merchant, Environment.SANDBOX).createCardToken(this.cardToken);
            String generatedToken = cardTokenResponse.getCardToken();
            System.out.printf("CardToken: %s\n", generatedToken);
            Assert.assertNotNull(generatedToken);
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage(), e);
        } catch (CieloRequestException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage(), e);
        }

    }

}
