package tarea1_catalinayushan_prograii;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Tarea1_CatalinaYushan_PrograII {

    public static void main(String[] args) throws ParseException {
        Scanner quaxly = new Scanner(System.in);
        System.out.println("---Bienvenido al Autolote de Programacion II!---");
        System.out.println("1. Agregar un vehiculo");
        System.out.println("2. Ver todos los vehiculos disponibles");
        System.out.println("3. Modificar la fecha de creacion de un vehiculo");
        System.out.println("4. Modificar el minuto en que se vendio");
        System.out.println("5. Eliminar un vehiculo");
        System.out.println("6. Salir");
        System.out.println("------------------------------------------------");
        System.out.println("Digite la opcion que desea hacer: ");
        int choice = quaxly.nextInt();
        do{
            switch (choice){
                case 1:
                    Date crear;
                    Date vender;
                    ArrayList <String> Autos = new ArrayList <String>();
                    System.out.println("Has escogido agregar un nuevo carro!");
                    System.out.println("Escribe la marca del carro: ");
                    String marca = quaxly.nextLine();
                    System.out.println("Escribe el modelo del carro: ");
                    String modelo = quaxly.nextLine();
                    System.out.println("Escribe la fecha de creacion del carro. Por favor usar el formato dd/MM/yyyy: ");
                    String create = quaxly.nextLine();
                    DateFormat CrearCarro = new SimpleDateFormat("dd/MM/yyyy");
                    crear = CrearCarro.parse(create);
                    System.out.println("Escribe la fecha en la cual se vendio el carro. Por favor usar el formato dd/MM/yyyy: ");
                    String sale = quaxly.nextLine();
                    DateFormat VenderCarro = new SimpleDateFormat("dd/MM/yyyy");
                    vender = VenderCarro.parse(sale);
                    
                    System.out.println("Felicidades has ingresado el carro correctamente!");
                    
                    Autos.add(marca);
                    break;
                case 2:
                    for (int i = 0; i < Autos.size(); i++) {
                        System.out.println(Autos.get(i));
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Gracias por venir a nuestro autolote! Por favor no regrese!");

            }
            
        }while (choice < 6);
    }
    
}
