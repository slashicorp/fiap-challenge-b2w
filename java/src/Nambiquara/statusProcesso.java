package Nambiquara;

import java.io.Serializable;

public class statusProcesso extends nambiquaraRh implements Serializable{
    private String statusDocumentacao;
    private String statusProvaPratica;
    private String statusContratacao;

    public String getStatusDocumentacao() {
        return statusDocumentacao;
    }

    public void setStatusDocumentacao(String statusDocumentacao) {
        this.statusDocumentacao = statusDocumentacao;
    }

    public String getStatusProvaPratica() {
        return statusProvaPratica;
    }

    public void setStatusProvaPratica(String statusProvaPratica) {
        this.statusProvaPratica = statusProvaPratica;
    }

    public String getStatusContratacao() {
        return statusContratacao;
    }

    public void setStatusContratacao(String statusContratacao) {
        this.statusContratacao = statusContratacao;
    }
 
}