/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validatorBeans;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author JamesEich
 */
@FacesValidator("beans.ZipValidator")
public class ZipValidator implements Validator{

	private static final String ZIP_PATTERN = "\\d{5}\\b";
	//private static final String CC_PATTERN = "\\d{16}\\b";

	private Pattern pattern;
	private Matcher matcher;
	private String userInput;
        
	public ZipValidator(){
		  pattern = Pattern.compile(ZIP_PATTERN);
	}
        
	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		
		matcher = pattern.matcher(value.toString());
                
                
                userInput = value.toString();
                
                
		if((!matcher.matches())){
			
                    FacesMessage msg = 
                        new FacesMessage("Zipcode formatting incorrect.\n\nPlease try again.", "Invalid format.");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);

		}
                /*if((dateSplit[0]>12) || (dateSplit[1] > 31) || (dateSplit[2] > Year.now().getValue()))
                {
                    FacesMessage msg = 
                        new FacesMessage("Date does not exist.", "Invalid format.");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);  
                }*/

	}
}