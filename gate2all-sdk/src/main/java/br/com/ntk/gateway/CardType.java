package br.com.ntk.gateway;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wallace on 12/07/17.
 */
public enum CardType {

    /** Configura cartão de crédito. **/
    @SerializedName("1")
    Credit,

    /** Configura cartão de débito. **/
    @SerializedName("2")
    Debit;

}
