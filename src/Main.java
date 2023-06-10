import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PropertiesOfWarden pa = null;

      Warden<PropertiesOfWarden> wa = new Warden<>(pa);
      System.out.println(pa);
      PropertiesOfWarden p = new PropertiesOfWarden();
      wa.printMood();

    }
}
