package hello;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import java.lang.*;
import java.text.SimpleDateFormat;
import javax.validation.constraints.NotNull;

@JsonAutoDetect
public class WebLogin {

    private static int counter = 1;
    private Integer login_id;
    @NotNull
    private String url;
    @NotNull
    private String login;
    @NotNull
    private String password;
   
    public WebLogin() {
	this.login_id = counter++;
    }

    public Integer getlogin_id() {
        return login_id;
    }
    public void setlogin_id(Integer login_id) {
        this.login_id = login_id;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
   
   }
