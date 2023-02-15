package randomnumber.springmvclab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import randomnumber.springmvclab.services.NumberService;

/**
 * A controller class that responds to the /randnum HTTP route on localhost.
 * @author Aaron
 * @version 1.0
 */
@Controller
@RequestMapping("randnum") // all paths start with "randnum"
public class NumberController {

    private static final int HIGH = 20;
    private static final int LOW = 1;
    private NumberService service;

    /**
     * @param service sets service
     */
    public NumberController(NumberService service){
        this.service = service;
    }

    /**
     * @return getter method
     */
    @RequestMapping("getNumber")
    public String genNumber(){
        return "???";
    }

    /**
     * To pass the data from our service layer to our HTML page requires the use of an org.springframework.ui.Model
     * object. This can be passed directly into our controller method and acts just like a Map object (with key/value
     * pairs). Name variables can be added to the Model object and then referenced by name in your HTML page
     * @param modelVars object
     * @return num
     */
    public String genNumber(Model modelVars){
        modelVars.addAttribute("num", service.between(LOW, HIGH));
        return "???";
    }

    @Override
    public String toString() {
        return "NumberController{" +
                "service=" + service +
                '}';
    }
}
