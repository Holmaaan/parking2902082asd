package org.ficha290282.maven.parking.holman;
//Importar dependencias
import org.ficha290282.maven.parking.holman.entities.Carro;
import org.ficha290282.maven.parking.holman.entities.Cliente;
//import org.ficha290282.maven.parking.holman.entities.TipoVehiculo;
import org.ficha290282.maven.parking.holman.entities.TipoDocumento;
import org.ficha290282.maven.parking.holman.entities.TipoVehiculo;

public class Main {
    public static void main(String[] args) {

            //Crear dos instancias de la clase carro
            Carro carrito1 = new Carro();
            carrito1.placa = "ASD 345";
            carrito1.tipoVehiculo = "CARRO";

            Carro carrito2 = new Carro();
            carrito2.placa = "QWE 456";
            carrito2.tipoVehiculo = "CAMION";

            Cliente clientecito = new Cliente();
            clientecito.nombre="Cristian";
            clientecito.apellidos="Buitrago";
            clientecito.tipoDocumento
                    = TipoDocumento.CC;
            clientecito.numeroDocumento = 102525525L;
            clientecito.celular = 3057251322L;


            //Añadir carros al cliente
            //Invocar llamar o ejecutar el metodo que declaramos o definimos 
            //El mteodo addCar
            clientecito.addCar(carrito1);
            clientecito.addCar(carrito2);
            clientecito.addCar("ASD 123" , "carro");
        
            System.out.println("Cliente:");
            System.out.println("documento:" + clientecito.numeroDocumento);
            System.out.println("Vehiculos:");
            
            //foreach ($clientecito.misCarros as $c) {  
            //}

            for (Carro c: clientecito.misCarros) {
                System.out.println("placa:" + c.placa);
                System.out.println("tipo:" + c.tipoVehiculo);
                System.out.println("___________");
                
            }


    }
 

}