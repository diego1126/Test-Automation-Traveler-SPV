package co.com.castor.spv.tasks.requote;

import co.com.castor.spv.ui.quotetravelassistance.QuoteTravelAssistanceUI;
import co.com.castor.spv.ui.requote.RequoteUI;
import co.com.castor.spv.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RequoteTKS implements Task {
    private String new_destiny;
    private String xpath_new_destiny;
    private String discount_code;


    public RequoteTKS(String new_destiny, String discount_code){
        this.new_destiny = new_destiny;
        this.xpath_new_destiny = "//*[contains(text(),'"+new_destiny+"')]";
        this.discount_code = discount_code;

    }
    @Override
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Click.on(RequoteUI.LIST_NEW_DESTINY),
                SendKeys.of(Keys.CONTROL,"a").into(RequoteUI.LIST_NEW_DESTINY),
                Enter.theValue(this.new_destiny).into(RequoteUI.LIST_NEW_DESTINY),
                Click.on(this.xpath_new_destiny),
                Click.on(RequoteUI.BTN_EXIT_CALENDAR),
                Click.on(RequoteUI.BTN_DAY_EXIT),
                //Click.on(RequoteUI.BTN_ARRIVAL_CALENDAR),
                Click.on(RequoteUI.BTN_DAY_ARRIVAL),
                SendKeys.of(Keys.TAB).into(RequoteUI.BTN_CONTINUE),
                Enter.theValue(this.discount_code).into(RequoteUI.BTN_DISCOUNT_CODE),
                SendKeys.of(Keys.TAB).into(RequoteUI.BTN_DISCOUNT_CODE),
                SendKeys.of(Keys.ENTER).into(RequoteUI.BTN_REQUOTE),

                Wait.oneTime(8000)
        );

    }
    public static RequoteTKS requote(String new_destiny, String discount_code) {
        return instrumented(RequoteTKS.class,new_destiny,discount_code) ;
    }
}
