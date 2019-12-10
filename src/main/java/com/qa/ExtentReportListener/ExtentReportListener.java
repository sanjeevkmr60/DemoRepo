package com.qa.ExtentReportListener;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;



import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




public class ExtentReportListener implements IReporter {
    private ExtentReports extent;

    public void generateReport(final List<XmlSuite> xmlSuites, final List<ISuite> suites,
                               final String outputDirectory) {
           extent=new ExtentReports(outputDirectory+ File.separator+"Extent.html",true);

             convertHTMLToXMLFile(outputDirectory,"Extent.html");

           for(ISuite suite:suites){
               Map<String, ISuiteResult> result=suite.getResults();

               for(ISuiteResult r:result.values()){
                   ITestContext context=r.getTestContext();
                   buildTestNodes(context.getPassedTests(),LogStatus.PASS);
                   buildTestNodes(context.getFailedTests(),LogStatus.FAIL);
                   buildTestNodes(context.getSkippedTests(),LogStatus.SKIP);
               }
           }
           extent.flush();
           extent.close();
    }

    private void convertHTMLToXMLFile(String outputDirectory,String htmlfile) {
        InputStream isInHtml =null;
        DataInputStream disInHtml =null;
        FileOutputStream fosOutHtml =null;
        FileWriter fwOutXml =null;
        FileReader frInHtml=null;
        BufferedWriter bwOutXml =null;
        BufferedReader brInHtml=null;

        try {
            String filepath=outputDirectory+File.separator+htmlfile;
            frInHtml = new FileReader(filepath);
            brInHtml = new BufferedReader(frInHtml);
            SAXBuilder saxBuilder = new SAXBuilder("org.ccil.cowan.tagsoup.Parser", false);
            org.jdom.Document jdomDocument = saxBuilder.build(brInHtml);
            XMLOutputter outputter = new XMLOutputter();
            try {
                outputter.output(jdomDocument, System.out);
                System.out.println("xml file path"+outputDirectory);
                fwOutXml = new FileWriter(outputDirectory+File.separator+"XMLReport.xml");
                bwOutXml = new BufferedWriter(fwOutXml);
                outputter.output(jdomDocument, bwOutXml);
                System.out.flush();
            }
            catch (IOException e)  {  }

        }
        catch (IOException e) {  }
        catch (JDOMException e) {
            e.printStackTrace();
        } finally {
            System.out.flush();
            try {
                isInHtml.close();
                disInHtml.close();
                fosOutHtml.flush();
                fosOutHtml.getFD().sync();
                fosOutHtml.close();
                fwOutXml.flush();
                fwOutXml.close();
                bwOutXml.close();
            } catch (Exception w) {

            }
        }
    }


    private void buildTestNodes(IResultMap tests, LogStatus status){
       ExtentTest test;

       if(tests.size()>0){

           for(ITestResult result:tests.getAllResults()){
               test=extent.startTest(result.getMethod().getMethodName());
                test.setStartedTime(getTime(result.getStartMillis()));
                test.setEndedTime(getTime(result.getEndMillis()));

                for(String group:result.getMethod().getGroups())
                   test.assignCategory(group);

                if(result.getThrowable()!=null)
                {
                    test.log(status,result.getThrowable());
                }else{
                    test.log(status,"Test_Constructor"+status.toString().toLowerCase()+"ed");
                }
                extent.endTest(test);
           }

       }


    }


    private Date getTime(long millis){
        Calendar calendar= Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();

    }



}
