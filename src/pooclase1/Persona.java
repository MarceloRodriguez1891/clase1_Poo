
package pooclase1;

public class Persona {
    // mis objetos
    String nombre;
    String apellido;
    int fechaNacimiento;
    int cedula;
    boolean estudiante;
   
    //constructor de una persona
    public Persona(String nombre, String apellido, int fechaNacimiento, int cedula, boolean estudiante){
      //this para diferenciar mi objeto , mi variable porque lo nombramos igual
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        this.fechaNacimiento=fechaNacimiento;
        this.estudiante=estudiante;
        
    }
    //metodos getters//retorna nombre ingresado
    public String getNombre(){
        return this.nombre;
    } 
     public String getApellido(){
        return this.apellido;
    }
    //metodo setters// 
     public void setNombre(String n){
         this.nombre=getNombre();
     }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getCedula() {
        return cedula;
    }

    public boolean isEstudiante() {
        return estudiante;
    }
    
}
