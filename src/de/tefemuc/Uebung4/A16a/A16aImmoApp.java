package de.tefemuc.Uebung4.A16a;

public class A16aImmoApp {

    public static void main(String[] args){

        try {
            A16aGrundstueck grundstueck = new A16aGrundstueck(1000, 500000);
            System.out.println(grundstueck.calcPricePerSquareMeter());
        } catch (A16aIllegalSizeException e){
            e.printStackTrace();
        } catch (A16aIllegalPriceException e){
            System.err.println(e.getMessage());
        }

        try{
            A16aWohnung wohnung = new A16aWohnung(150, 450000);
            System.out.println(wohnung.calcPricePerSquareMeter());
        } catch (A16aIllegalSizeException e){
            e.printStackTrace();
        } catch (A16aIllegalPriceException e){
            System.err.println(e.getMessage());
        }
    }
}
