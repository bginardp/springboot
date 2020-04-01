package es.palma.demoresetbundle;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    MessageSource messageSource;
    
    @Autowired
    ApplicationContext ctx;
    
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name, Locale locale) {
  	  String key="k1";
  	  String value=messageSource.getMessage("k1", null, null, locale);
    return String.format("Hello %s!", name + " key/value="+key+"/"+value);
    }
    
    @GetMapping("/clear")
    @ResponseBody
    public String clearCache() {
    	ImiMessageSource imiMessageSource=(ImiMessageSource) ctx.getBean("messageSource");
    	if (imiMessageSource!=null) {
    		imiMessageSource.getTextes().clear();
    	}
     return "Neteja textes efectuada....";
    }

}
