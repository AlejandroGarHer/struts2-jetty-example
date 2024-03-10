package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.InvoiceBean;

public class InvoiceAction extends ActionSupport  {

    InvoiceBean invoiceBean;

    @Override
    public String execute() throws Exception {
        System.out.println("execute!!");
        double totalAmount = (double) Math.round((Double.parseDouble(invoiceBean.getImpBruto()) * (1 + Double.parseDouble(invoiceBean.getTipoIva()) / 100)) * 100) /100.00;
        invoiceBean.setImpConIva(String.valueOf(totalAmount));
        return SUCCESS;
    }

    public InvoiceBean getInvoiceBean() {
        return invoiceBean;
    }

    public void setInvoiceBean(InvoiceBean invoiceBean) {
        this.invoiceBean = invoiceBean;
    }
    @Override
    public void validate() {
        if (invoiceBean.getSubject().isEmpty()) {
            addFieldError("invoiceBean.subject", "El concepto es obligatorio.");
        }
        if (invoiceBean.getDateFrom()==null) {
            addFieldError("invoiceBean.dateFrom", "La fecha origen es obligatoria.");
        }
        if (invoiceBean.getDateTo()==null) {
            addFieldError("invoiceBean.dateTo", "La fecha fin es obligatoria.");
        }
        if (invoiceBean.getImpBruto().isEmpty()) {
            addFieldError("invoiceBean.impBruto", "El importe es obligatorio.");
        }
        if (invoiceBean.getTipoIva().isEmpty()) {
            addFieldError("invoiceBean.tipoIva", "El IVA es obligatorio.");
        }
    }
}
