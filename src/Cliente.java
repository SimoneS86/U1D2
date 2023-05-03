import java.util.Date;

public class Cliente {
    private String codice;
    private String nomeCognome;
    private String email;
    private Date dataIscrizione;

    public Cliente(String codice, String nomeCognome, String email, Date dataIscrizione) {
        this.codice = codice;
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public String getCodice() {
        return codice;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataIscrizione() {
        return dataIscrizione;
    }
}
