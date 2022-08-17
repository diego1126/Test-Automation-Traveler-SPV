package co.com.castor.spv.tasks.selectplan;

import co.com.castor.spv.ui.requote.RequoteUI;
import co.com.castor.spv.ui.selectplan.SelectPlanUI;
import co.com.castor.spv.utils.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectPlanTKS implements Task {

    @Override
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Click.on(SelectPlanUI.BTN_VIEW_DETAIL),
                Wait.oneTime(2000),
                Click.on(SelectPlanUI.BTN_VIEW_DETAIL_TRAVEL_ASSISTANCE),
                Wait.oneTime(2000),
                Click.on(SelectPlanUI.BTN_VIEW_DETAIL_REPATRIATION_EMERGENCY),
                Wait.oneTime(2000),
                Click.on(SelectPlanUI.BTN_VIEW_DETAIL_CLOSE),
                Click.on(SelectPlanUI.BTN_BUY_PLAN),

                Wait.oneTime(8000)
        );
    }
    public static SelectPlanTKS selectPlan() {
        return instrumented(SelectPlanTKS.class) ;
    }
}
