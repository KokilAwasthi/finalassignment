package hello;


import org.codehaus.jackson.map.SerializationConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.*;
import java.lang.*;
import javax.validation.Valid;
import org.springframework.validation.Validator;

@RestController
public class UserController {

    
//Declare and create a hash map as in memory storage
 
private Map<Integer, User> usersMap = new HashMap<Integer, User>();


//Create user API : /users
@RequestMapping(value = "/users", method = RequestMethod.POST,headers="Accept=application/json")
@ResponseStatus(value=HttpStatus.CREATED)
    public @ResponseBody User users(@Valid @RequestBody User usr) {
	usersMap.put(usr.getUserId(), usr);
        return usr;
    }
//View user API :/users/{user_id}
    @RequestMapping(value = "/users/{user_id}",method = RequestMethod.GET)

    public @ResponseBody User viewuser(@PathVariable("user_id")Integer user_id){
	return usersMap.get(user_id);
        
    }
//Update user API :/users/{user_id}

    @RequestMapping(value = "/users/{user_id}",method = RequestMethod.PUT,headers="Accept=application/json")
@ResponseStatus(value=HttpStatus.CREATED)
    public @ResponseBody User updateUser(@PathVariable("user_id")Integer 		user_id,@Valid @RequestBody User user) {
	User updatedUser = usersMap.get(user_id);
	updatedUser.setEmail(user.getEmail());
	updatedUser.setPassword(user.getPassword());
	return updatedUser;
    }

//Create ID Card APT : /users/{user_id}/idcard
    @RequestMapping(value = "/users/{user_id}/idcard",method =      RequestMethod.POST,headers="Accept=application/json")
@ResponseStatus(value=HttpStatus.CREATED)   
    public @ResponseBody IDCard addcards(@PathVariable("user_id")Integer 		user_id, @Valid @RequestBody IDCard idcard) {
	User userwithCards = usersMap.get(user_id);
	userwithCards.AddIdCards(idcard);
	return idcard;
    }
//List ALL cards : /users/{user_id}/idcards
    @RequestMapping(value = "/users/{user_id}/idcards", method = RequestMethod.GET)
    public @ResponseBody List<IDCard> showcards(@PathVariable("user_id")Integer 		user_id) {
       	User user = usersMap.get(user_id);
	return user.getIdCards();
    }
//Delete an id card : /users/{user_id}/idcards/{card_id}
 @RequestMapping(value = "/users/{user_id}/idcards/{card_id}", method = RequestMethod.DELETE)
@ResponseStatus(value=HttpStatus.NO_CONTENT)
public @ResponseBody void deletecard(@PathVariable("user_id")Integer user_id,@PathVariable("card_id")Integer card_id) {
 	User user = usersMap.get(user_id);
        user.DeleteIdCard(card_id); 
        
}
//Create web login: /users/{user_id}/weblogin
@RequestMapping(value = "/users/{user_id}/weblogin",method =      RequestMethod.POST,headers="Accept=application/json")
 @ResponseStatus(value=HttpStatus.CREATED)   
    public @ResponseBody WebLogin createlogin(@PathVariable("user_id")Integer 		user_id, @Valid @RequestBody WebLogin weblogin) {
	User userwithlogin = usersMap.get(user_id);
	userwithlogin.AddWebLogins(weblogin);
	return weblogin;
    }

//List ALL website logins : /users/{user_id}/weblogins
    @RequestMapping(value = "/users/{user_id}/weblogins", method = RequestMethod.GET)
    public @ResponseBody List<WebLogin> showlogins(@PathVariable("user_id")Integer user_id) {
       	User user = usersMap.get(user_id);
	return user.getWebLogins();
    }
//Delete a web login : /users/{user_id}/weblogins/{login_id}
 @RequestMapping(value = "/users/{user_id}/weblogins/{login_id}", method = RequestMethod.DELETE)
@ResponseStatus(value=HttpStatus.NO_CONTENT)
public @ResponseBody void deletelogin(@PathVariable("user_id")Integer 		user_id,@PathVariable("login_id")Integer login_id) {
 	User user = usersMap.get(user_id);
        user.DeleteWebLogin(login_id);   
}

//Create bank account: /users/{user_id}/bankaccount
@RequestMapping(value = "/users/{user_id}/bankaccount",method =      RequestMethod.POST,headers="Accept=application/json")
 @ResponseStatus(value=HttpStatus.CREATED)   
public @ResponseBody BankAccount createbankaccount(@PathVariable("user_id")Integer user_id,@Valid @RequestBody BankAccount bacc) {
	User userwithaccount = usersMap.get(user_id);
	userwithaccount.AddBankAccount(bacc);
	return bacc;
    }

//List ALL bank accounts: /users/{user_id}/bankaccounts
    @RequestMapping(value = "/users/{user_id}/bankaccounts", method = RequestMethod.GET)
    public @ResponseBody List<BankAccount> showaccounts(@PathVariable("user_id")Integer user_id) {
       	User user = usersMap.get(user_id);
	return user.getBankAccounts();
    }

//Delete a bank account : /users/{user_id}/weblogins/{ba_id}
 @RequestMapping(value = "/users/{user_id}/bankaccounts/{ba_id}", method = RequestMethod.DELETE)
@ResponseStatus(value=HttpStatus.NO_CONTENT)
public @ResponseBody void deletebankaccount(@PathVariable("user_id")Integer 		user_id,@PathVariable("ba_id")Integer ba_id) {
 	User user = usersMap.get(user_id);
        user.DeletebankAccount(ba_id);   
}
}








