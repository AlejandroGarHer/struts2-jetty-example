<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
<head>
  <title><s:text name="hello.message"/></title>
  <s:head/>
  <sx:head/>
</head>
<body>
    <h1>Resumen de factura: </h1>
    <b><label>Concepto: </label></b>
    <s:property value="invoiceBean.subject" /><br>
    <b><label>Fecha origen: </label></b>
    <s:property value="invoiceBean.dateFrom" /><br>
    <b><label>Fecha fin: </label></b>
    <s:property value="invoiceBean.dateTo" /><br>
    <b><label>Importe Bruto: </label></b>
    <s:property value="invoiceBean.impBruto" /><br>
    <b><label>IVA (%): </label></b>
    <s:property value="invoiceBean.tipoIva" /><br>
    <b><label>Importe Neto: </label></b>
    <s:property value="invoiceBean.impConIva" /><br>
</body>
</html>