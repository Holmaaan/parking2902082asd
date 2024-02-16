package org.ficha290282.maven.parking.holman.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nombre;
    public String apellidos;
    public TipoDocumento tipoDocumento;
    public Long numeroDocumento;
    public Long celular;

    public List<Carro> misCarros = 
                    new ArrayList<Carro>();


    //Metodo 1: añadir carro al cliente
    //definir metodo(Firmas del metodo Signature)
    //modificador de acceso (publico o privado)
    //tipo de dato de retorno 
    //Nombre del metodo
    //Prametros (Entradas o inputs): 
    //1. Tipo de dato del parametro
    //2. Nombre del parametro

    public void addCar(Carro c ){
        this.misCarros.add(c);

    }
    public void addCar(String placa, String tipoVehiculo){
        //Construir o instanciar el objeto
        Carro c = new Carro();
        c.placa = placa;
        c.tipoVehiculo = tipoVehiculo;
        this.misCarros.add(c);
    }

    //Sobrecarga de metodos 
    //en una clase se permiten metodos con el mismo nombre pero con diferente firma 

}
