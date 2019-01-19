package com.training.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class WelcomeService {

    @WebMethod
    public String welcome(){
        return "Hi Welcome !";
    }

    @WebMethod
    public String saySomething(){
        return "Something";
    }
}
