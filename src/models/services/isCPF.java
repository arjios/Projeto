package services;

import java.text.ParseException;

public class isCPF {
    
    private boolean iscpf = false;

    public isCPF() {
    }

    public boolean getIsCPF(String cpf) {
        if(cpf.length() == 11) {
            System.out.println(cpf);
            validaCPF(cpf);
        }
        return this.iscpf;
    }
    private void validaCPF(String cpf) {
        int div00, div01, div02, soma = 0;
        System.out.println(cpf);
        for(int i = 10; i > 1; --i) {
            soma = soma + Integer.parseInt(cpf.substring(i-1, i)) * (i);
        }
        div01 = soma;
        System.out.println(div01);
        soma = 0;
        for(int i = 11; i > 1; --i) {
            soma = soma + Integer.parseInt(cpf.substring(i-1, i)) * (i);
        }
        div02 = soma;
        System.out.println(div02);
        div01 = div01 * 10;
        div00 = div01 + div02;
        System.out.println(div00);
        if(div00 == Integer.parseInt(cpf.substring(9, 11))) {
            this.iscpf = true;
        }
    }


}