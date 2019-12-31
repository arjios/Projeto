package services;

import java.text.ParseException;

public class validaCPF {
    private String CPF = null;
    private boolean isCPF = false;
    private String stringCPF = null;

    public void validaCPF() {
    }
    public void validaCPF(String cpf) {
        this.stringCPF = cpf;
        if (cpf.length() == 11) {
            if (isValor(cpf)) {
                this.isCPF = true;
            } else {
                this.CPF = null;
                this.isCPF = false;
            }
        } else {
            this.CPF = null;
            this.isCPF = false;
        }
    }

    private boolean isCPF() {
        return this.isCPF;
    }

    public void setCPF(final String cpf) {
        this.stringCPF = cpf;
    }

    public String getCPF() {
        return this.CPF;
    }

    private boolean isValor(final String cpf) {
        int div00, div01, div02, soma = 0;
        boolean b = false;
        for(int i = 10; i > 1; --i) {
            soma = soma + Integer.parseInt(cpf.substring(i-1, i)) * (i);
        }
        for(int i = 11; i > 1; ++i) {
            soma = soma + Integer.parseInt(cpf.substring(i-1, i)) * (i);
        }
        div01 = div01 * 10;
        div00 = div01 + div02;
        if(div00 == Integer.parseInt(cpf.substring(9, 11))) {
            b = true;
        }
        return b;
        }
    }