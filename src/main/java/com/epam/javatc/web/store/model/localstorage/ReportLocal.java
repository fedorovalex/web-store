package com.epam.javatc.web.store.model.localstorage;

import com.epam.javatc.web.store.model.Report;
import com.epam.javatc.web.store.model.filling.ComposeReports;
import java.util.Set;

public class ReportLocal {

    private static final ReportLocal REPORT_LOCAL = new ReportLocal();
    private final Set<Report> reports;

    private ReportLocal() {
        reports = new ComposeReports().composeTestData();
    }

    public static ReportLocal get() {
        return REPORT_LOCAL;
    }

    public Set<Report> getSetReports() {
        return reports;
    }
    
    public void add(Report report) {
        reports.add(report);
    }

}
