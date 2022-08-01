package co.com.castor.spv.tasks.quotetravelassistance;

import co.com.castor.spv.ui.quotetravelassistance.QuoteTravelAssistanceUI;
import co.com.castor.spv.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class QuoteTravelAssistanceTKS implements Task {
    private String name;
    private String email;
    private String mobile;

    public QuoteTravelAssistanceTKS(String name, String email,String mobile){
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }
    @Override
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Click.on(QuoteTravelAssistanceUI.LIST_ORIGIN),
                Click.on(QuoteTravelAssistanceUI.OPT_ORIGIN),
                Click.on(QuoteTravelAssistanceUI.LIST_DESTINY),
                Click.on(QuoteTravelAssistanceUI.OPT_DESTINY),
                Click.on(QuoteTravelAssistanceUI.BTN_EXIT_CALENDAR),
                Click.on(QuoteTravelAssistanceUI.BTN_DAY_EXIT),
                //Click.on(QuoteTravelAssistanceUI.BTN_ARRIVAL_CALENDAR),
                Click.on(QuoteTravelAssistanceUI.BTN_DAY_ARRIVAL),
                Click.on(QuoteTravelAssistanceUI.BTN_ADD_PERSON),
                Click.on(QuoteTravelAssistanceUI.BTN_CONTINUE),
                Enter.theValue(this.name).into(QuoteTravelAssistanceUI.TXT_FULL_NAME),
                Enter.theValue(this.email).into(QuoteTravelAssistanceUI.TXT_EMAIL),
                Enter.theValue(this.mobile).into(QuoteTravelAssistanceUI.TXT_MOBILE),
                SendKeys.of(Keys.TAB).into(QuoteTravelAssistanceUI.TXT_MOBILE),
                SendKeys.of(Keys.TAB).into(QuoteTravelAssistanceUI.TXT_MOBILE),
                SendKeys.of(Keys.ENTER).into(QuoteTravelAssistanceUI.BTN_MOBILE),
                //Click.on(QuoteTravelAssistanceUI.BTN_MOBILE),

                Wait.oneTime(15000)
        );

    }
    public static QuoteTravelAssistanceTKS quoteTravel(String name, String email,String mobile) {
        return instrumented(QuoteTravelAssistanceTKS.class,name,email,mobile) ;
    }
}
