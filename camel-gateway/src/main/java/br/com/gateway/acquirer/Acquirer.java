package br.com.gateway.acquirer;

/**
 * Created by wallace on 12/08/16.
 */
public @interface Acquirer {

    String className() default "";

    /** Mathod name of subadquirente **/
    String method() default  "";

    /** Version of api. Ex: 1.5, default value 1.0 **/
    String version() default "1.0";

    /** Description of API Ex: API 3.0, default value: "" **/
    String description() default "";

}
