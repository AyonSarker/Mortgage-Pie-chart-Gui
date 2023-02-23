package edu.citytech.cst.client.sample.marginaltax;

import com.jbbwebsolutions.http.utility.JSONGet;
import edu.citytech.cst.client.sample.marginaltax.model.Code;
import edu.citytech.cst.client.sample.marginaltax.model.MarginalTax;

public class MarginalTaxService {

    final static String URL = "http://127.0.0.1:3000/taxsummary?code=$code&salary=$salary";

    public static MarginalTax getTaxSummary(Code code, float salary) {


        String sURL = URL.replace("$code",code.getCode())
                .replace("$salary",salary + "");
        MarginalTax marginalTax = JSONGet.submitGet(sURL,MarginalTax.class);
        return marginalTax;

    }
}

