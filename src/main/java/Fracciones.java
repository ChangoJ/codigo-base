public class Fracciones {
    private int numberOne;
    private int numbertwo;

    public Fracciones(int numberOne, int numbertwo) {
        this.numberOne = numberOne;
        this.numbertwo = numbertwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumbertwo() {
        return numbertwo;
    }

    public void setNumbertwo(int numbertwo) {
        this.numbertwo = numbertwo;
    }

    public int getSubtract(){
        int subtract;
        subtract = numberOne - numbertwo;
        return subtract;
    }
}
