package nl.whitehorses.clientosb.jms;

/**
 * Generated class, do not edit.
 *
 * This service class was generated by weblogic
 * webservice stub gen on Mon Sep 06 20:15:03 CEST 2010 */

public class HelloWorldServiceSoapHttpPortBindingQSService_Impl     extends weblogic.wsee.jaxrpc.ServiceImpl
     implements nl.whitehorses.clientosb.jms.HelloWorldServiceSoapHttpPortBindingQSService {

  public HelloWorldServiceSoapHttpPortBindingQSService_Impl() throws javax.xml.rpc.ServiceException {
    this("nl/whitehorses/clientosb/jms/HelloWorldServiceSoapHttpPortBindingQSService_saved_wsdl.wsdl", null);
  }
  
  public HelloWorldServiceSoapHttpPortBindingQSService_Impl(String wsdlurl) throws javax.xml.rpc.ServiceException {
    this(wsdlurl, null);
  }
  
  public HelloWorldServiceSoapHttpPortBindingQSService_Impl(String wsdlurl, weblogic.wsee.connection.transport.TransportInfo transportInfo) throws javax.xml.rpc.ServiceException {
    super(wsdlurl,
          new javax.xml.namespace.QName("http://saml.ws.whitehorses.nl/", "HelloWorldServiceSoapHttpPortBindingQSService"),
          "nl/whitehorses/clientosb/jms/HelloWorldServiceSoapHttpPortBindingQSService_internaldd.xml", transportInfo);
  }
  
  //***********************************
  // Port Name: HelloWorldServiceSoapHttpPortBindingQSPort 
  // Port Type: HelloWorldService 
  //***********************************

  nl.whitehorses.clientosb.jms.HelloWorldService mvar_HelloWorldServiceSoapHttpPortBindingQSPort;

  /**
   * returns HelloWorldServiceSoapHttpPortBindingQSPort port in this service 
   */
  public nl.whitehorses.clientosb.jms.HelloWorldService getHelloWorldServiceSoapHttpPortBindingQSPort() 
    throws javax.xml.rpc.ServiceException
  {

    if (mvar_HelloWorldServiceSoapHttpPortBindingQSPort == null) {
      mvar_HelloWorldServiceSoapHttpPortBindingQSPort =
        new nl.whitehorses.clientosb.jms.HelloWorldService_Stub(_getPort("HelloWorldServiceSoapHttpPortBindingQSPort"), this);
    }

    if (transportInfo != null && 
        transportInfo instanceof weblogic.wsee.connection.transport.http.HttpTransportInfo) {
      ((javax.xml.rpc.Stub)mvar_HelloWorldServiceSoapHttpPortBindingQSPort)._setProperty(
        "weblogic.wsee.connection.transportinfo", 
        (weblogic.wsee.connection.transport.http.HttpTransportInfo)transportInfo);
    }
    
    return mvar_HelloWorldServiceSoapHttpPortBindingQSPort;
  }

  /**
   * @deprecated  Use getHelloWorldServiceSoapHttpPortBindingQSPort(byte[] username, byte[] password)
   */
  public nl.whitehorses.clientosb.jms.HelloWorldService getHelloWorldServiceSoapHttpPortBindingQSPort(String username, String password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username.getBytes());
      httpInfo.setPassword(password.getBytes());
      transportInfo = httpInfo;
    }
    return getHelloWorldServiceSoapHttpPortBindingQSPort();
  }

  public nl.whitehorses.clientosb.jms.HelloWorldService getHelloWorldServiceSoapHttpPortBindingQSPort(byte[] username, byte[] password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username);
      httpInfo.setPassword(password);
      transportInfo = httpInfo;
    }
    return getHelloWorldServiceSoapHttpPortBindingQSPort();
  }
  
  
}