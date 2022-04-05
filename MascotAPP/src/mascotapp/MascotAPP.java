package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class MascotAPP {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Mascota m1 = new Mascota("dalmo", "canela", "tipo");
  
        m1.setNombre("pepe chiquito");
        m1.pasear(100,4);
        
        System.out.println(m1);
        
                
  
}

}
