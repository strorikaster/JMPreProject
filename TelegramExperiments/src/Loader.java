import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthAuthorization;
import org.javagram.response.AuthCheckedPhone;
import org.javagram.response.AuthSentCode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by A.Zotov on 10.02.2017.
 */
public class Loader {
    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.50:443", 95618, "ec7abce5e73ce8ce2908b1628b44bdfc");

        System.out.println("Please type phone number:");
        String phoneNumber = reader.readLine().trim();
        phoneNumber = phoneNumber.replaceAll("^[^0-9]]+$","");

        AuthCheckedPhone checkedPhone = bridge.authCheckPhone(phoneNumber);

        if (checkedPhone.isRegistered()){
            System.out.println("Congratulation your phone is registered in app");

            AuthSentCode sentCode = bridge.authSendCode(phoneNumber);
            System.out.println(sentCode.hashCode());

            System.out.println("Please type code sended to you phone");
            String authCode = reader.readLine().trim();
            AuthAuthorization authorization = bridge.authSignIn(authCode);
            System.out.println(authorization.getUser().getLastName());
            System.out.println(authorization.getUser().getFirstName());
            System.out.println(authorization.getUser().getPhone());
            bridge.authLogOut();
        }else{
            System.out.println("Please register your phone before enter.");
        }
    }
}
