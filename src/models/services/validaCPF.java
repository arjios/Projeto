package services;

import java.text.ParseException;

public class validaCPF {
    private String CPF = null;
    private boolean isCPF = false;
    private String stringCpf = null;

    public void validaCPF() {
    }
    public void validaCPF(String cpf) {
        this.stringCPF = cpf;

    }
    private boolean isCPF(String cpf) {
        if(cpf.length() == 11) {
            if(isValor(cpf)) {
                this.isCPF = true;
            }
            else {
                this.CPF = null;
                this.isCPF = false;
            }
        }
        else {
            this.CPF = null;
            this.isCPF = false;
        }
    }
    public void setCPF(String cpf) {
        this.stringCpf = cpf;
    }
    public String getCPF() {
        return this.CPF;
    }
    private boolean isValor(String cpf) {
        int div00, div01, div03;
        boolean b = false;
        for(int i = 10; i > 1; --i) {
            int soma = soma + Integer.parseInt(cpf.substring(i-1, i)) * (i);
        }
        for(int i = 11; i > 1; ++i) {
            int soma = soma + Integer.parseInt(cpf.substring(i-1, i)) * (i);
        }
        div01 = div01 * 10;
        div00 = div01 + div02;
        if(div00 == Integer.parseInt(cpf.substring(9, 11))) {
            b = true;
        }
        return true;

    }