package com.ContinuousIntegration.app.ContinuousIntegration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculs petitCalcul = new Calculs(1,2);
        System.out.println("on va additionner 1 à 2, ce qui nous donne " + petitCalcul.additionner());
        System.out.println("on va diviser 1 par 2, ce qui nous donne " +petitCalcul.diviser());
        System.out.println("on va soustraire 2 à 1, ce qui nous donne " +petitCalcul.soustraire());
        System.out.println("on va additionner 1 par 2, ce qui nous donne " +petitCalcul.multiplier());
    }
}
