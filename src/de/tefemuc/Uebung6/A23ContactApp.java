package de.tefemuc.Uebung6;

public class A23ContactApp {

    public static void main(String[] args){
        A23Contact c = new A23Contact();

        System.out.println(c.isFavorite());
        System.out.println(c.getRemark());

        c.setRemark("Hallo :)");
        c.setFavorite(true);
        System.out.println(c.isFavorite());
        System.out.println(c.getRemark());

        try {
            c.addTelephone(new A23Telephone(A23TelephoneType.WORK, "12345676"));
        } catch (A23IllegalInputException e) {

        }

        System.out.println(c.getTelephone(0).getNumber());

    }
}
