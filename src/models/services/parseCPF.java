package services;

public class parseCPF {
    
    private String strCPF;

    public parseCPF(String cpf) {
        this.strCPF=cpf.substring(0,3) + "."  +
                    cpf.substring(3,6) + "."  +
                    cpf.substring(6,9) + "-"  +
                    cpf.substring(9,11);
    }
    public String getParseCPF() {
        return this.strCPF;
    }
}