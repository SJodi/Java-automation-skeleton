package Test;

public class SampleSteps {

    SamplePages SamplePages;
    public void user_on_login_page(){
        SamplePages.open();
    }

    public void user_login_with_and(String username , String password){
        SamplePages.fillUsername(username);
        SamplePages.fillPassword(password);
        SamplePages.clickButtonSignIn();
    }

    public void user_should_be_able_to_log_in(){
        SamplePages.verifySuccessLogin();
    }
}
