package services;

public class isCPF {
    
    private boolean iscpf = false;
    private String[] matrizCPF = {"00000000000", "11111111111", "22222222222", "33333333333",
                        "44444444444", "55555555555", "66666666666", "77777777777", 
                        "88888888888", "99999999999"};

    public isCPF() {
    }

    public boolean getIsCPF(String cpf) {
        if(cpf.length() == 11) {
            validaCPF(cpf);
        }
        for(int i=0; i<10; ++i) {
            if(cpf == matrizCPF[i]) {
                this.iscpf = false;
            }
        }
        return this.iscpf;
    }
    private void validaCPF(String cpf) {
        int div00, div01, div02, soma = 0;
        for(int i = 10; i > 1; --i) {
            soma = soma + Integer.parseInt(cpf.substring(10-i, 11-i)) * (i);
        }
        div01 = soma;
        div01 = div01 % 11;
        div01 = 11 - div01;
        soma = 0;
        for(int i = 11; i > 2; --i) {
            soma = soma + Integer.parseInt(cpf.substring(11-i, 12-i)) * (i);
        }
        div02 = soma;
        div02 = div02 + (2 * div01);
        div02 = div02 % 11;
        div02 = 11 - div02;
        div01 = div01 * 10;
        div00 = div01 + div02;
        if(div00 == Integer.parseInt(cpf.substring(9, 11))) {
            this.iscpf = true;
        }
    }
}