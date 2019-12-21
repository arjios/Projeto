package utilidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class stringToDate {
    private Date data;
    private String stringData;
    private String dia;
    private String mes;
    private String ano;

    public void stringToDate() {
    }
    public void stringToDate(String stringData) {
        dia = stringData.substring(0,2);
        mes = stringData.substring(3,4);
        ano = stringData.substring(5,8);
        this.stringData = dia + "/" + mes + "/" + ano;
        try {
            this.data=new SimpleDateFormat("dd/MM/yyyy").parse(this.stringData);
        }
        catch(ParseException pe) {
            System.out.println(pe.getMessage());
            System.exit(-1);
        }
    }
    public String getStringData() {
        return this.stringData;
    }

    public Date getDateData() {
        return this.data;
    }
}