
package ejercicio5;


public class Ejercicio5 {


    
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Juan", "America 1053", "3492593649", 'M', 8, 1, 1989);
        Persona p2 = new Persona();
        
        p2.setAnio(1990);
        p2.setDia(8);
        p2.setDireccion("Bv Santa Fe 1023");
        p2.setGenero('F');
        p2.setMes(12);
        p2.setNombre("Estefania");
        p2.setTelefono("3492568923");
        
        
        
       
         
        System.out.println("Nombre: "+p1.getNombre()+". Direccion: "+p1.getDireccion()+". Telefono: "+p1.getTelefono()+". Edad: "+p1.obtenerEdad(28, 8, 2023)+".");
        System.out.println("Nombre: "+p2.getNombre()+". Direccion: "+p2.getDireccion()+". Telefono: "+p2.getTelefono()+". Edad: "+p2.obtenerEdad(28, 8, 2023)+".");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        p1.datosString();
        p2.datosString();
    }
    
}
