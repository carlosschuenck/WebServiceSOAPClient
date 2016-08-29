/**
 * WebServiceSOAPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.devmedia.ws.soap.exemplo1;

public interface WebServiceSOAPService extends javax.xml.rpc.Service {
    public java.lang.String getWebServiceSOAPPortAddress();

    public br.com.devmedia.ws.soap.exemplo1.WebServiceSOAP getWebServiceSOAPPort() throws javax.xml.rpc.ServiceException;

    public br.com.devmedia.ws.soap.exemplo1.WebServiceSOAP getWebServiceSOAPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
