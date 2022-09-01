package co.com.castor.spv.tasks.traveler;

import co.com.castor.spv.ui.selectplan.SelectPlanUI;
import co.com.castor.spv.ui.traveler.TravelerUI;
import co.com.castor.spv.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TravelerTKS implements Task {

    @Override
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Enter.theValue("Diego").into(TravelerUI.TXT_TARVELER_1_NAME),
                Enter.theValue("Alvarez").into(TravelerUI.TXT_TARVELER_1_LAST_NAME),
                Click.on(TravelerUI.BTN_TARVELER_1_BIRTH_DATE),
                Click.on(TravelerUI.BTN_TARVELER_1_BIRTH_MONTH_YEAR),
                Click.on(TravelerUI.BTN_TARVELER_1_BIRTH_YEAR),
                Click.on(TravelerUI.BTN_TARVELER_1_BIRTH_MONTH),
                Click.on(TravelerUI.BTN_TARVELER_1_BIRTH_DAY),
                Enter.theValue("58471254").into(TravelerUI.BTN_TARVELER_1_OFFICIAL_DOC),
                Click.on(TravelerUI.BTN_TARVELER_1_BAGGAGE),
                Click.on(TravelerUI.BTN_TARVELER_1_FLIGHT_DELAY),
                Click.on(TravelerUI.BTN_TARVELER_1_MY_TRIP),
                Click.on(TravelerUI.BTN_TARVELER_1_PROMOTIONS),
                Click.on(TravelerUI.BTN_TARVELER_1_GO_TO_PAY),
                Enter.theValue("Carolina").into(TravelerUI.TXT_TARVELER_1_NAME),
                Enter.theValue("Gomez Lopez").into(TravelerUI.TXT_TARVELER_1_LAST_NAME),
                Click.on(TravelerUI.BTN_TARVELER_1_BIRTH_DATE),
                /* Select data Travel 2 */
                Click.on(TravelerUI.BTN_TARVELER_1_BIRTH_MONTH_YEAR),
                Click.on(TravelerUI.BTN_TARVELER_1_BIRTH_YEAR),
                Click.on(TravelerUI.BTN_TARVELER_1_BIRTH_MONTH),
                Click.on(TravelerUI.BTN_TARVELER_1_BIRTH_DAY),
                Enter.theValue("23019874").into(TravelerUI.BTN_TARVELER_1_OFFICIAL_DOC),
                Click.on(TravelerUI.BTN_TARVELER_1_BAGGAGE),
                Click.on(TravelerUI.BTN_TARVELER_1_FLIGHT_DELAY),
                Click.on(TravelerUI.BTN_TARVELER_1_GO_TO_PAY),


                Wait.oneTime(8000)
        );
    }
    public static TravelerTKS travelerInfo() {
        return instrumented(TravelerTKS.class) ;
    }
}
