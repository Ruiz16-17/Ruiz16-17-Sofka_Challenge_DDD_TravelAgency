package co.com.sofka.domain.travelagency.travelplan.plan.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.travelagency.travelplan.plan.value.PlanId;
import co.com.sofka.domain.travelagency.travelplan.plan.value.Price;

public class UpdatedPrice extends Command {

    private final PlanId planId;
    private final Price price;

    public PlanId getPlanId() {
        return planId;
    }

    public Price getPrice() {
        return price;
    }

    public UpdatedPrice(PlanId planId, Price price) {
        this.planId = planId;
        this.price = price;
    }
}
