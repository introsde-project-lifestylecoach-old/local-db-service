package servicelocaldb.document.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import servicelocaldb.document.models.User;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface LocalDB_interface {
	
	@WebMethod(operationName="get_user_by_id")
    @WebResult(name = "User")
	User get_user_by_id(Long id);
	
	@WebMethod(operationName="get_user_by_auth")
    @WebResult(name = "User")
	User get_user_by_auth(String mail, String passwd);
	
	@WebMethod(operationName="update_user")
    @WebResult(name = "User")
	User update_user(User user);	
	
	@WebMethod(operationName="delete_user")
    @WebResult(name = "User")
	User delete_user(User user);	
	
	@WebMethod(operationName="create_user")
    @WebResult(name = "User")
	User create_user(User user);	
}
