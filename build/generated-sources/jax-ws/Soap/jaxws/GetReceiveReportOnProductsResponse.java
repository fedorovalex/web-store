
package Soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getReceiveReportOnProductsResponse", namespace = "http://Soap/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReceiveReportOnProductsResponse", namespace = "http://Soap/")
public class GetReceiveReportOnProductsResponse {

    @XmlElement(name = "return", namespace = "")
    private com.epam.javatc.web.store.Soap.Response _return;

    /**
     * 
     * @return
     *     returns Response
     */
    public com.epam.javatc.web.store.Soap.Response getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.epam.javatc.web.store.Soap.Response _return) {
        this._return = _return;
    }

}
