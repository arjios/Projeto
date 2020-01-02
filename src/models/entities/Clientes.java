package entities;

import services.stringToDate;
import services.parseCPF;
import services.isCPF;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;

import java.io.IOException;
import javax.imageio.ImageIO;

public class Clientes {

    private String clienteNome;
    private String clienteCPF;
    private String clienteNasc;
    private String clienteEmail;
    private BufferedImage clienteFoto;
    private byte[] clienteFotoByte;
    private stringToDate std;

    public Clientes () {
        // Construtor padrão
    }

    public Clientes(final String cNome, final String cCPF, final String cNasc, final String cEmail, final BufferedImage cClienteFoto) {
        this.clienteNome = cNome;
        setClienteCPF(cCPF);
        setClienteNasc(cNasc);
        this.clienteEmail = cEmail;
        this.clienteFoto = cClienteFoto;
    }

    public void setClienteNome(final String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public void setClienteCPF(String cCPF) {
        this.clienteCPF=cCPF;
        final isCPF boo = new isCPF();
        System.out.println("\n CPF: Clientes.java - " + this.clienteCPF);
        if(boo.getIsCPF(this.clienteCPF)) {
            System.out.println(this.clienteCPF);
            parseCPF pCPF = new parseCPF(this.clienteCPF);
            this.clienteCPF = pCPF.getParseCPF();
        }
        System.out.println("\n FALSE: Clientes.java ");
    }

    public void setClienteNasc(String cNasc) {
        std = new stringToDate();
        std.setStringToDate(cNasc); 
        this.clienteNasc = std.getStringData();
    }

    public void setClienteEmail(final String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }

    public void setClienteFoto(final BufferedImage clienteFoto) {
        this.clienteFoto = clienteFoto;
    }

    public String getClienteNome() {
        return this.clienteNome;
    }

    public String getClienteCPF() {
        return this.clienteCPF;
    }

    public String getClienteNasc() {
        return this.clienteNasc;
    }

    public String getClienteEmail() {
        return this.clienteEmail;
    }

    public BufferedImage getClienteFoto() {
        return this.clienteFoto;
    }

    private void convertImage() {
        try {
            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(this.clienteFoto, "jpg", baos);
            baos.flush();
            final byte[] clienteFotoBT = baos.toByteArray();
            baos.close();
            this.clienteFotoByte = clienteFotoBT;
        } catch (final IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Nome do Cliente..: " + 
                this.clienteNome + 
                "\nCPF..............: " +
                this.clienteCPF +
                "\nData Nascimento..: " +
                this.clienteNasc +
                "\nEmail............: " +
                this.clienteEmail;
    }
}