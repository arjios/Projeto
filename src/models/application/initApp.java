package application;

import entities.Clientes;

public class initApp {

    public static void main(String[] args) {

        Clientes cli = new Clientes("Antonio", "885.461.368-15", "abc@gmail.com", null);
        System.out.println(cli);
        
    }

}