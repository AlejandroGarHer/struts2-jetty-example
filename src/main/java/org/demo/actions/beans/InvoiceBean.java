package org.demo.actions.beans;

import java.util.Date;

public class InvoiceBean {

    private String subject;
    private Date dateFrom;
    private Date dateTo;
    private String impBruto;
    private String tipoIva;
    private String impConIva;

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getImpBruto() {
        return impBruto;
    }
    public void setImpBruto(String impBruto) {
        this.impBruto = impBruto;
    }

    public String getTipoIva() {
        return tipoIva;
    }
    public void setTipoIva(String tipoIva) {
        this.tipoIva = tipoIva;
    }
    public String getImpConIva() {
        return impConIva;
    }
    public void setImpConIva(String impConIva) {
        this.impConIva = impConIva;
    }
}
