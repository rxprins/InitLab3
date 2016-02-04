import org.junit.Test;
import prins.riana.InitializationLab2.ColorfulThing;
import prins.riana.InitializationLab2.ThingContainer;

import static org.junit.Assert.*;

public class InitializationLab2Spec {

    @Test
    public void getColorTest() {
        ColorfulThing color1 = new ColorfulThing(ColorfulThing.Color.WHITE);
        assertEquals("this is the color ", "WHITE", color1.getColor());
    }
        @Test
        public void addThingTest() {
            ColorfulThing color1 = new ColorfulThing(ColorfulThing.Color.WHITE);
        ThingContainer thing1 = new ThingContainer(3);
    //    assertEquals("Add to array : ",color1,thing1.add(color1));

    }

}

