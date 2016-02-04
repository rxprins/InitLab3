package prins.riana.InitializationLab2;
import java.util.*;

 public class ThingContainer {
     int currIndex;
     ColorfulThing [] colorArray;
     ColorfulThing [] cArray;


     public ThingContainer(int cnum, ColorfulThing [] cr) {
      //   cArray = new ColorfulThing[cnum];
          cr = new ColorfulThing[cnum];
         }

     public ThingContainer(int num) {
         colorArray = new ColorfulThing[num];
     }
     public void add(ColorfulThing ct) {
         if (currIndex > colorArray.length) {
             System.out.println("ThingContainer is full");
         } else {
             colorArray[currIndex] = ct;
             currIndex++;
         }
     //    return ct;
     }
     public ColorfulThing pop() {
         ColorfulThing cr = colorArray[colorArray.length -1];
         colorArray[colorArray.length -1] = null;
         currIndex--;
         System.out.println("curr index " + currIndex);
         return cr;
     }
     public String remove(String crm) {
         String answer = null;
         for (int i = 0; i < colorArray.length; i++) {
             if (colorArray[i].getColor().equals(crm)) {
                 answer = colorArray[i].getColor();
                 if (i > 0 && i < colorArray.length -1) {
                     colorArray[i] = colorArray[i + 1];
                     System.out.println(colorArray[i].getColor());
                 } else {
                     colorArray[i] = colorArray[0];
                 }
                 break;
             } else {
                 answer = null;
             }
         }
         return answer;
     }
     public ColorfulThing removeC(ColorfulThing ctrm) {
         for (int i = 0; i < colorArray.length; i++) {
             if (colorArray[i].equals(ctrm)) {
                 colorArray[i] = null;
                 break;
             } else {
                 return null;
             }
         }
         return ctrm;
     }


     public void printThings() {
         for (int i = 0; i < colorArray.length; i++) {
             System.out.println(colorArray[i].getColor());
         }
     }
     public void printThings2() {
         for (int i = 0; i < cArray.length; i++) {
             System.out.println("Part 3 " +  cArray[i].getColor());
         }
     }
 }



