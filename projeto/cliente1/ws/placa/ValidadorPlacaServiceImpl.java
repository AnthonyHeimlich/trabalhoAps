
package projeto.cliente1.ws.placa;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ValidadorPlacaServiceImpl", targetNamespace = "http://servidor.projeto/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ValidadorPlacaServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarPlaca", targetNamespace = "http://servidor.projeto/", className = "projeto.cliente1.ws.placa.ValidarPlaca")
    @ResponseWrapper(localName = "validarPlacaResponse", targetNamespace = "http://servidor.projeto/", className = "projeto.cliente1.ws.placa.ValidarPlacaResponse")
    @Action(input = "http://servidor.projeto/ValidadorPlacaServiceImpl/validarPlacaRequest", output = "http://servidor.projeto/ValidadorPlacaServiceImpl/validarPlacaResponse")
    public String validarPlaca(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
