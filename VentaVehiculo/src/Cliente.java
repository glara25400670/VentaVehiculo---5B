
/**
 * 01 - Definir la clase public class
 * 02 - Definir los campos de clase (variables de instancia, atributos de clase)
 * 03 - Constructor (Mismo nombre de la clase y no tiene una especificación de retorno)
 * 04 - Metodos estandar (Getter, Setter y toString)
 * 05 - Metodos del dominio del problema
 */
//01 - Definir la clase
public class Cliente {

    //02 - Definir variables de instancia
    private String rs;
    private String rfc;
    private String email;

    //03 - Definir constructor
    public Cliente(String rs, String rfc, String email) {
        this.rs = rs;
        this.rfc = rfc;
        this.email = email;
    }

    //04 - Definir metodos estandar
    @Override
    public String toString() {
        String cadena;
        cadena = "Rs = " + this.rs + "\n"
                + "RFC = " + this.rfc + "\n"
                + "Email = " + this.email + "\n";
        return cadena;
    }
}
