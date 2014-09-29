package hello;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import javax.validation.constraints.NotNull;

//@JsonAutoDetect

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    private static int counter = 1;
    private Integer user_id;
    @NotNull
    private String email;
    @NotNull
    private String password;
    private Date created_at;
    private Date updated_at;
    private List<IDCard> listOfCards;
    private List<WebLogin> listOfweblogins;
    private List<BankAccount> listOfAccounts;
	
    private SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss"); 
	
    public User() {
	
        this.user_id = counter++;
       	this.created_at = new Date(System.currentTimeMillis());
	this.updated_at = this.created_at;
            
      }


    public Integer getUserId() {
        return user_id;
    }
    public void setUserId(Integer user_id) {
        this.user_id = user_id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCreatedAt() {
        return df.format(created_at);
    }
    public void setCreatedAt(Date created_at) {
        this.created_at = created_at;
    }
    
    public void AddIdCards(IDCard idc) {
       if (listOfCards == null)
        listOfCards = new ArrayList<IDCard>(); 
    	this.listOfCards.add(idc);
    }
    
    public void DeleteIdCard(Integer cardid) {
     	for ( int i = 0; i< (listOfCards).size() ; i++) {
        IDCard idc = listOfCards.get(i);      	
	int tmpcardid = idc.getCard_id(); 
    	if (tmpcardid == cardid) {
        this.listOfCards.remove(i);
        }
      }
    }
    public List<IDCard> getIdCards() {
    	return this.listOfCards;
    }
       
    public void AddWebLogins(WebLogin wbl) {
	if (listOfweblogins == null)
        listOfweblogins = new ArrayList<WebLogin>();     	
	this.listOfweblogins.add(wbl);
    }
   
    public List<WebLogin> getWebLogins() {
    	return this.listOfweblogins;
    }

    public void DeleteWebLogin(Integer login_id) {
     	for ( int i = 0; i< (listOfweblogins).size() ; i++) {
        WebLogin wbl = listOfweblogins.get(i);      	
	int tmploginid = wbl.getlogin_id(); 
    	if (tmploginid == login_id) {
        this.listOfweblogins.remove(i);
        }
        }
    }
     public void AddBankAccount(BankAccount bacc) {
	if (listOfAccounts == null)
        listOfAccounts = new ArrayList<BankAccount>();    	
	this.listOfAccounts.add(bacc);
    }
     public List<BankAccount> getBankAccounts() {
    	return this.listOfAccounts;
    } 
    
     public void DeletebankAccount(Integer ba_id) {
     	for ( int i = 0; i< (listOfAccounts).size() ; i++) {
        BankAccount bacc = listOfAccounts.get(i);      	
	int tmpbaid = bacc.getba_id(); 
    	if (tmpbaid == ba_id) {
        this.listOfAccounts.remove(i);
        }
        }
    }
 
   }


