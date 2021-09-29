package co.com.sofka.domain.travelagency.travelplan.plan.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.plan.value.PlanId;

public class UpdatedName extends Command {

    private final PlanId planId;
    private final Name name;

    public UpdatedName(PlanId planId, Name name) {
        this.planId = planId;
        this.name = name;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public Name getName() {
        return name;
    }
}
