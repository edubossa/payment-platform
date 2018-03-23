package cieloecommerce.sdk;

import cieloecommerce.sdk.ecommerce.CieloEcommerce;
import cieloecommerce.sdk.ecommerce.Environment;
import cieloecommerce.sdk.ecommerce.Sale;
import cieloecommerce.sdk.ecommerce.SaleResponse;
import cieloecommerce.sdk.ecommerce.request.CieloRequestException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.UUID;

/**
 * Created by wallace on 06/07/17.
 *
 * https://github.com/DeveloperCielo/API-3.0-Java
 */
public class SaleTest {

    private Gson gson;

    private Merchant merchant;
    private Environment environment;
    private Sale sale;
    private Sale saleResponse;


    @BeforeTest
    public void setup() {
        System.out.println("SaleTest.setup");
        this.gson = new GsonBuilder().create();
        this.merchant = new Merchant("94c0f0f6-59e1-44e6-a84b-a9b0d0ba150f", "CXGHHPEORNDIQQMKPEHETHRMHMUOMGKJWFWTBELF");
        this.environment = Environment.SANDBOX;
        sale = new Sale(UUID.randomUUID().toString().substring(0,9));
        sale.customer("Eduardo Wallace");
        sale.payment(1500)
            .setCapture(false)
            .setAuthenticate(false)
            .creditCard("123", "MASTER")
                .setCardNumber("0000000000000001")
                .setExpirationDate("12/2021")
                .setSaveCard(true);
    }


    @Test(groups = "sale")
    public void testCreateSaleRequest() {
        try {
            System.out.println("CIELO REQUEST --> " + this.gson.toJson(sale));
            this.saleResponse = new CieloEcommerce(this.merchant, this.environment).createSale(this.sale);
            Assert.assertEquals(this.saleResponse.getPayment().getStatus().intValue(), 1);
            System.out.println("CIELO RESPONSE --> " + this.gson.toJson(saleResponse));
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage(), e);
        } catch (CieloRequestException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage(), e);
        }

    }

    @Test(groups = "sale", dependsOnMethods = "testCreateSaleRequest")
    public void testCreateSaleCaptureRequest() {
        try {
            SaleResponse response = new CieloEcommerce(this.merchant, this.environment).captureSale(this.saleResponse.getPayment().getPaymentId());
            Assert.assertEquals(response.getStatus(), "2");
            System.out.println("CIELO RESPONSE --> " + this.gson.toJson(response));
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage(), e);
        } catch (CieloRequestException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage(), e);
        }

    }


    @Test(groups = "sale", dependsOnMethods = "testCreateSaleCaptureRequest")
    public void testCreateSaleVoidRequest() {
        try {
            SaleResponse response = new CieloEcommerce(this.merchant, this.environment).cancelSale(this.saleResponse.getPayment().getPaymentId());
            Assert.assertEquals(response.getStatus(), "10");
            System.out.println("CIELO RESPONSE --> " + this.gson.toJson(response));
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage(), e);
        } catch (CieloRequestException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage(), e);
        }

    }

    @Test(groups = "sale", dependsOnMethods = "testCreateSaleVoidRequest")
    public void testQuerySaleRequest() {
        try {
            Sale response = new CieloEcommerce(this.merchant, this.environment).querySale(this.saleResponse.getPayment().getPaymentId());
            System.out.println("CIELO RESPONSE --> " + this.gson.toJson(response));
        } catch (IOException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage(), e);
        } catch (CieloRequestException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage(), e);
        }

    }

}
