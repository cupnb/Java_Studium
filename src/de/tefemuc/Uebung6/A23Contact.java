package de.tefemuc.Uebung6;

public class A23Contact {

    private A23Telephone[] telephone = new A23Telephone[3];
    private boolean favorite;
    private String remark;

    public A23Contact(){}

    public A23Telephone getTelephone(int index) throws IndexOutOfBoundsException {
        return telephone[index];
    }

    public void addTelephone(A23Telephone telephone) throws IllegalArgumentException, A23IllegalInputException{
        if (checkCountTelephone()) throw new A23IllegalInputException("Too many numbers");
        if (checkFormatTelephone(telephone)) throw new IllegalArgumentException("Number format not allowed");

        for (int i = 0; i < 3; i++){
            if (this.telephone[i] == null) this.telephone[i] = telephone;
        }
    }

    public void deleteTelephone(A23Telephone telephone){
        if (this.telephone[0].getNumber().equals(telephone.getNumber()) && this.telephone[0].getType() == telephone.getType()){
            this.telephone[0] = this.telephone[1];
            this.telephone[1] = this.telephone[2];
            this.telephone[2] = null;
        } else if (this.telephone[1].getNumber().equals(telephone.getNumber()) && this.telephone[1].getType() == telephone.getType()){
            this.telephone[1] = this.telephone[2];
            this.telephone[2] = null;
        } else if (this.telephone[2].getNumber().equals(telephone.getNumber()) && this.telephone[2].getType() == telephone.getType()){
            this.telephone[2] = null;
        }
    }

    private static boolean checkFormatTelephone(A23Telephone telephone){
        return telephone.getNumber().startsWith("00");
    }

    private boolean checkCountTelephone(){
        return !(telephone[2] == null);
    }



    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }






}
