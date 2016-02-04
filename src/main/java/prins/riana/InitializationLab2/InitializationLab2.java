package prins.riana.InitializationLab2;
import java.util.*;


public class InitializationLab2 {


    public static void main(String[] args) {

        InitializationLab2 init1 = new InitializationLab2();

        ColorfulThing color1 = new ColorfulThing(ColorfulThing.Color.BLACK);
        ColorfulThing color2 = new ColorfulThing(ColorfulThing.Color.SILVER);
        ColorfulThing color3 = new ColorfulThing(ColorfulThing.Color.WHITE);
        ColorfulThing color4 = new ColorfulThing(ColorfulThing.Color.GREEN);


        ColorfulThing [] cArray = new ColorfulThing[3];

        cArray[0] = color1;
        cArray[1] = color2;
        cArray[2] = color3;
        ThingContainer thing1 = new ThingContainer(3);
        ThingContainer thing2 = new ThingContainer(3, cArray);

        //add Colorfulthings to
        thing1.add(color1);
        thing1.add(color2);
        thing1.add(color3);

        //print array
        thing1.printThings();

        //remove last item
        thing1.pop();

        thing1.add(color4);

        //remove array by passing color
        String colorRm = color1.getColor();
        System.out.println("removed: " + thing1.remove(colorRm));
        thing1.printThings();

        //remove array by passing object
        thing1.removeC(color2);
        System.out.println("removed: 2 " + color2.getColor());
        thing1.printThings();

        thing2.printThings2();

    }
    }
