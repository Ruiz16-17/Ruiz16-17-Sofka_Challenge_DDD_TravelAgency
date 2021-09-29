package co.com.sofka.domain.travelagency.travelplan.plan.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.travelagency.travelplan.plan.value.NumberDay;
import co.com.sofka.domain.travelagency.travelplan.plan.value.PlanId;

public class UpdatedNumberDay extends Command {

    private final PlanId planId;
    private final NumberDay numberDay;

    public UpdatedNumberDay(PlanId planId, NumberDay numberDay) {
        this.planId = planId;
        this.numberDay = numberDay;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public NumberDay getNumberDay() {
        return numberDay;
    }
}
