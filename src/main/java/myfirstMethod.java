import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import com.jayway.restassured.response.ValidatableResponse;
import javafx.beans.binding.When;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.junit.Test;
import org.junit.runner.Request;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.codehaus.groovy.tools.shell.util.Logger.io;



/**
 * Created by dipal vyas on 02/05/2017.
 */
public class myfirstMethod {

    public String endPoint = "http://terminal-customer-v1.relationship-sit.89d9.dev-inmarsat.openshiftapps.com/api/terminal/";
    public Response response;
    public ValidatableResponse json;


    public void getterminalID(String termID)
    {
        response = when().
                get(endPoint + termID).
                then().
                contentType(ContentType.XML).
                extract().
                response();

       String abc = response.asString();
       System.out.print(abc);
    }

    public void verifyResponsecode(int statCode)
    {
        json = response.then().statusCode(statCode);
    }
   // public String terminalId;




//
//    public String endPoint = "http://terminal-customer-v1.relationship-sit.89d9.dev-inmarsat.openshiftapps.com/api/terminal/";
//
//
//    public void getRequest(String terminalId)
//    {
//    given().param(terminalId);
//    }
//
//    public void getResponse()
//    {
//
//    }
//    String abc;
//    String xyz = "901112118097036";



//    public void firstApi()
//    {
//
//        abc = when().
//                get("http://terminal-customer-v1.relationship-sit.89d9.dev-inmarsat.openshiftapps.com/api/terminal/" + xyz).
//                then().
//                contentType(ContentType.XML).extract().body().asString();
//
//
//        //   String abc = response.toString();
//        System.out.println(abc);
//
//
//    }

}
