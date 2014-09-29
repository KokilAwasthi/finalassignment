package hello;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import java.lang.*;
import java.text.SimpleDateFormat;
import javax.validation.constraints.NotNull;

@JsonAutoDetect
public class BankAccount {

    private static int counter = 1;
    private Integer ba_id;
    private String account_name;
    @NotNull
    private String routing_number;
    @NotNull
    private String account_number;
   
    public BankAccount() {
	this.ba_id = counter++;
    }
    public Integer getba_id() {
        return ba_id;
    }
    public void setba_id(Integer ba_id) {
        this.ba_id = ba_id;
    }
    public String getaccount_name() {
        return account_name;
    }
    public void setaccount_name(String account_name) {
        this.account_name = account_name;
    }
    public String getRouting_number() {
        return routing_number;
    }
    public void setRouting_number(String routing_number) {
        this.routing_number = routing_number;
    }
   public String getAccount_number() {
        return account_number;
    }
    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }
      }
