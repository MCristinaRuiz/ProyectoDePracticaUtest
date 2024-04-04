package co.com.choucair.ejemplo.models;


import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter//cuando usas estos argumentos no tienes que crear por ti misma los setters o getter
@AllArgsConstructor // esto te crea un constructor con variables
@NoArgsConstructor // te crea un constructor vacio  //saias eso?, no super ya aprendiste te amo solo se de claran las variables y ya
public class User {

    private String nombre;
    private String apellido; //asi como lo tienes aqui
    private String email;
    private String mesNacimiento;
    private String diaNacimiento;
    private String anoNacimiento;
    private String ciudad;
    private String codigoPostal;
    private String pais;
    private String computador;
    private String version;
    private String lenguaje;
    private String dispositivo;
    private String modelo;
    private String sistemaOperativo;
    private String contrasena;
    private String confirmarContrasena;

}
