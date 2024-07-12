package REST_API.tests.DataDrivenTesting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class vwoLoginPOJO
{
    /* Go to https://app.vwo.com/#/login , enter invalid password, click on sign in.
    Go to Network tab by inspecting the page, find Login ,click on it & copy the cURL (bah)
    Go to postman, create a new collection, then click on import & paste the cURL.
    Go to Body in postman, click on beautify. Remove the username & password just keep it --> "" [Negative testing]
    Now copy the body in postman & go to https://www.jsonschema2pojo.org/ give the class name.
    paste the body code, source type --> Json & Annotation--> gson , click on preview a code will be generated.
    Copy the code & create a java class in IntelliJ & paste it.  */

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("remember")
    @Expose
    private Boolean remember;
    @SerializedName("recaptcha_response_field")
    @Expose
    private String recaptchaResponseField;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getRemember() {
        return remember;
    }

    public void setRemember(Boolean remember) {
        this.remember = remember;
    }

    public String getRecaptchaResponseField() {
        return recaptchaResponseField;
    }

    public void setRecaptchaResponseField(String recaptchaResponseField) {
        this.recaptchaResponseField = recaptchaResponseField;
    }
}
