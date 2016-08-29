package br.com.devmedia.ws.soap.exemplo1;

public class WebServiceSOAPProxy implements br.com.devmedia.ws.soap.exemplo1.WebServiceSOAP {
  private String _endpoint = null;
  private br.com.devmedia.ws.soap.exemplo1.WebServiceSOAP webServiceSOAP = null;
  
  public WebServiceSOAPProxy() {
    _initWebServiceSOAPProxy();
  }
  
  public WebServiceSOAPProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceSOAPProxy();
  }
  
  private void _initWebServiceSOAPProxy() {
    try {
      webServiceSOAP = (new br.com.devmedia.ws.soap.exemplo1.WebServiceSOAPServiceLocator()).getWebServiceSOAPPort();
      if (webServiceSOAP != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceSOAP)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceSOAP != null)
      ((javax.xml.rpc.Stub)webServiceSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.devmedia.ws.soap.exemplo1.WebServiceSOAP getWebServiceSOAP() {
    if (webServiceSOAP == null)
      _initWebServiceSOAPProxy();
    return webServiceSOAP;
  }
  
  public java.lang.Integer mostrarIdade() throws java.rmi.RemoteException{
    if (webServiceSOAP == null)
      _initWebServiceSOAPProxy();
    return webServiceSOAP.mostrarIdade();
  }
  
  public java.lang.String ping(java.lang.String nome) throws java.rmi.RemoteException{
    if (webServiceSOAP == null)
      _initWebServiceSOAPProxy();
    return webServiceSOAP.ping(nome);
  }
  
  public java.lang.String[] getListString() throws java.rmi.RemoteException{
    if (webServiceSOAP == null)
      _initWebServiceSOAPProxy();
    return webServiceSOAP.getListString();
  }
  
  public br.com.devmedia.ws.soap.exemplo1.Carro[] getListCarro() throws java.rmi.RemoteException{
    if (webServiceSOAP == null)
      _initWebServiceSOAPProxy();
    return webServiceSOAP.getListCarro();
  }
  
  
}