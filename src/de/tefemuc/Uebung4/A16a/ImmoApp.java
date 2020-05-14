package de.tefemuc.Uebung4.A16a;

public class ImmoApp {

    public static void main(String[] args){

        try {
            Grundstueck grundstueck = new Grundstueck(1000, 500000);
            System.out.println(grundstueck.calcPricePerSquareMeter());
        } catch (IllegalSizeException e){
            e.printStackTrace();
        } catch (IllegalPriceException e){
            System.err.println(e.getMessage());
        }

        try{
            Wohnung wohnung = new Wohnung(150, 450000);
            System.out.println(wohnung.calcPricePerSquareMeter());
        } catch (IllegalSizeException e){
            e.printStackTrace();
        } catch (IllegalPriceException e){
            System.err.println(e.getMessage());
        }
    }
}
