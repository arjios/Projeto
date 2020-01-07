package entities;

import java.util.ArrayList;
import java.util.List;

import entities.veiculosCliente;

public class parceiroCliente extends Clientes {

    private int idCli;
    private List<veiculosCliente> vCli = new ArrayList<>();

    public parceiroCliente() {
    }

    public void setIdCliente(int idCli) {
        this.idCli = idCli;
    }

    public int getIdCliente() {
        return this.idCli;
    }

    public List<veiculosCliente> getVeiculosCliente() {
        return vCli;
    }

    public void addVeiculoCliente(veiculosCliente vCliente) {
        vCli.add(vCliente);
    }

    public void removeVeiculoCliente(veiculosCliente vCliente) {
        vCli.remove(vCliente);
    }

}