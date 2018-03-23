package br.com.ntk.gateway;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wallace on 12/07/17.
 */
public enum Authenticate {

    /** Autorizar só transações autenticadas **/
    @SerializedName("1")
    OnlyAuthentication,

    /** Autorizar transações autenticadas ou não autenticadas **/
    @SerializedName("2")
    All,

    /** Autorizar sem autenticação **/
    @SerializedName("3")
    WithoutAuthentication

}
