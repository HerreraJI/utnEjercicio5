
package ejercicio5;


public class Ejercicio5 {


    
    public static void main(String[] args) {
        int edad;
        
        Persona p1 = new Persona("Juan", "America 1053", "3492593649", 'M', 8, 1, 1989);
        Persona p2 = new Persona();
        
        p2.setAnio(1990);
        p2.setDia(8);
        p2.setDireccion("Bv Santa Fe 1023");
        p2.setGenero('F');
        p2.setMes(12);
        p2.setNombre("Estefania");
        p2.setTelefono("3492568923");
        
        
        
        edad = p1.obtenerEdad(28, 8, 2023);
         
        //System.out.println("nombre: "+p1.nombre+". Direccion: "+p1.direccion+". Telefono: "+p1.telefono+". Edad: "+edad+".");
        p1.datosString();
        System.out.println("la edad es: "+p1.obtenerEdad(28, 8, 2023)+".");
        p2.datosString();
        System.out.println("la edad es: "+p2.obtenerEdad(28, 8, 2023)+".");
    }
    
}
