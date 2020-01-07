package application;

import entities.Clientes;


public class initApp {

    public static void main(String[] args) {

        Clientes cli = new Clientes();
        cli.setClientes("Antonio", "88546136815", "20021957", "abc@gmail.com", null);
        System.out.println("\n" + cli.toString());
        cli.setClientes("Yuri", "07544231585", "11051996", "abc@gmail.com", null);
        System.out.println("\n" + cli.toString());
        cli.setClientes("Yuri", "11111111111", "11051996", "abc@gmail.com", null);
        System.out.println("\n" + cli.toString());
        
    }

}