package prins.riana.InitializationLab2;

public class ColorfulThing {
    String color;

    public enum Color {
        WHITE, BLACK, SILVER, GREEN
    }

    public ColorfulThing(Color ecolor) {
        color = String.valueOf(ecolor);
    }


    public String getColor() {
        return color;

    }
}


