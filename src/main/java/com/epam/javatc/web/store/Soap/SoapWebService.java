package com.epam.javatc.web.store.Soap;

import com.epam.javatc.web.store.model.Report;
import com.epam.javatc.web.store.model.SalePoint;
import com.epam.javatc.web.store.model.localstorage.ReportLocal;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.Date;


@WebService(serviceName = "SoapWebService")
public class SoapWebService {

    @WebMethod(operationName = "getReceiveReportOnProducts")
    public Response getReceiveReportOnProducts(@WebParam(name = "date") Date date, @WebParam(name = "salePoint") SalePoint salePoint) {

        Response response = new Response();
        ArrayList<Report> allReports = new ArrayList<>(ReportLocal.get().getSetReports());
        ArrayList<Report> filterReports = new ArrayList<>();

        for (Report report : allReports) {
            if (report.getData().equals(date) && report.getSalePoint().equals(salePoint)) {
                filterReports.add(report);
            }
        }

        response.setReports(filterReports);

        return response;
    }
}
