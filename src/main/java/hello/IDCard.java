package hello;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import java.util.Date;
import java.lang.*;
import java.text.SimpleDateFormat;
import javax.validation.constraints.NotNull;

@JsonAutoDetect
public class IDCard {
    
    private static int counter = 1;
    private Integer card_id;
    @NotNull
    private String cardname;
    @NotNull
    private String cardnumber;
    private Date expirationdate;
   
    private SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss"); 
	
    public IDCard() {
	this.card_id = counter++;
    }

    public Integer getCard_id() {
        return card_id;
    }
    public void setCard_id(Integer card_id) {
        this.card_id = card_id;
    }
    public String getCardname() {
        return cardname;
    }
    public void setCardname(String cardname) {
        this.cardname = cardname;
    }
    public String getCardnumber() {
        return cardnumber;
    }
    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
    public String getExpirationdate() {
        return df.format(expirationdate);
    }
    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }
   
   }
