package br.com.ntk.gateway;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wallace on 12/07/17.
 */
public enum InterestType {

    /** Parcelado Loja **/
    @SerializedName("3")
    Shop,

    /** Parcelado Administrador **/
    @SerializedName("4")
    Administrator

}
