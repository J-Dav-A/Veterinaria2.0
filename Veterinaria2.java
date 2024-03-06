package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Veterinaria2{
    
    private String nombre;
    private Collection <Mascota> mascotas;

    /*
     * constructor de la clase Veterinaria
     */

    public Veterinaria2(String nombre){
        assert nombre != null;
        mascotas = new LinkedList<>();
        this.nombre = nombre;
    }


    /*
     * metodo get para obtener el nombre
     */

     public String getNombre(){
        return nombre;
    
    }

    /*
     * metodo para agregar mascotas
     */

     public void agregarMascota(Mascota mascota){
        assert verificarMascotaExiste(mascota.identificacion()) == false;
        mascotas.add(mascota);

     }

     /*
      * metodo para verificar que el ID de la mascota no se repita en la lista de mascotas
      */

    private boolean verificarMascotaExiste(String numID){
        boolean existe = false;
        for(Mascota mascota : mascotas){
            if(mascota.identificacion().equals(numID)){
                existe = true;
            }
        }
        return existe;
    }


    /*
     * metodo para obtener la lista de mascota
     */

    public Collection<Mascota> getMascotas(){
        return mascotas;
    }

}