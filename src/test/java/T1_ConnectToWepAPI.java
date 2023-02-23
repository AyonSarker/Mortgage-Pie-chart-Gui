import com.jbbwebsolutions.http.utility.JSONGet;
import edu.citytech.cst.client.sample.marginaltax.model.MarginalTax;
import edu.citytech.cst.client.sample.model.MortgageInformation;
import edu.citytech.cst.client.sample.model.PropertySummaryResult;

public class T1_ConnectToWepAPI {

    public static void main(String[] args) {
        e5();
    }


    public static void e5() {
        String sURL = "http://127.0.0.1:9215/jpa/propertySummary";
        PropertySummaryResult o = JSONGet.submitGet(sURL, PropertySummaryResult.class);
        System.out.println(o);

    }
    public static void e4() {
        String sURL = "http://127.0.0.1:3000/taxsummary?code=SM&salary=550000";
        MarginalTax o = JSONGet.submitGet(sURL,MarginalTax.class);
        System.out.println(o.getTaxList()[0]);
        var x=o.getPercentage();
        var y=o;


        System.out.println("-".repeat(100));
        e3();

    }



    public static void e3() {
        String sURL = "http://127.0.0.1:3000/taxsummary?code=SM&salary=550000";
        Object o = JSONGet.submitGet(sURL,Object.class);
        System.out.println(o);



    }


    public static void e1(String[] args) {
        String sURL = "http://localhost:9215/mortgage?loanAmount=50000&year=30&interest=0.03";
        MortgageInformation g = JSONGet.submitGet(sURL, MortgageInformation.class);
        System.out.println(g);
    }
}
