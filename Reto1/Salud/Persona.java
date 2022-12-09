package Salud;
import java.util.Scanner;

public class Persona 
{
    Scanner sc = new Scanner(System.in);

    public String tipoDoc;
    public int documento;
    public String nombre;
    public String apellido;
    public double peso;
    public double estatura;
    public int edad;
    public String sexo;
    


    public Persona()
    {
 
    }

    public Persona(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,int edad, String sexo) 
    {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }

   
public String getTipoDoc() {
    return tipoDoc;
}

public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
}

public int getDocumento() {
    return documento;
}

public void setDocumento(int documento) {
    this.documento = documento;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public double getPeso() {
    return peso;
}

public void setPeso(double peso) {
    this.peso = peso;
}

public double getEstatura() {
    return estatura;
}

public void setEstatura(double estatura) {
    this.estatura = estatura;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public String getSexo() {
    return sexo;
}

public void setSexo(String sexo) {
    this.sexo = sexo;
}

public void pedirDatos()
   {
    System.out.println("Ingrese el Tipo De Documento: ");
    tipoDoc =sc.next();
    System.out.println("Ingrese el Numero De Documento: ");
    documento =sc.nextInt();
    System.out.println("Ingrese su Nombre: ");
    nombre =sc.next();
    System.out.println("Ingrese su Apellido: ");
    apellido =sc.next();
    System.out.println("Ingrese su Peso: ");
    peso =sc.nextDouble();
    System.out.println("Ingrese su Estatura: ");
    estatura =sc.nextDouble();
    System.out.println("Ingrese su Edad: ");
    edad =sc.nextInt();
    System.out.println("Ingrese su Sexo: ");
    sexo =sc.next();
   }

   public void mostrarPersona()
   {
    System.out.println("\nDatos de la persona: "+"\n" +tipoDoc+"\n"+documento+"\n"+nombre+"\n"+apellido+"\n"+peso+"\n"+estatura+"\n"+edad+"\n"+sexo);
   }

   public double calcularImc()
   {
    double pesoActual =peso / Math.pow(estatura,2);
    
    return pesoActual;
   }
 

    public void mayorEdad()
    {
        if (edad<18)
        {
            System.out.println("Usted es menor de edad");
        }

        else if (edad>=18)
        {
            System.out.println("Usted es mayor de edad");
        }
    } 
}
