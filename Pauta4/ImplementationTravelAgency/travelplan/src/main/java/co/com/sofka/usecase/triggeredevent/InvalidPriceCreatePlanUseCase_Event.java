package co.com.sofka.usecase.triggeredevent;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.travelagency.travelplan.plan.Plan;
import co.com.sofka.domain.travelagency.travelplan.plan.event.CreatedPlan;
import co.com.sofka.domain.travelagency.travelplan.plan.value.*;

public class CreatePlanUseCase_Event extends UseCase<TriggeredEvent<CreatedPlan>, ResponseEvents> {

    private final String MESSAGE = "Tiene un precio mayor a 300000.0";

    @Override
    public void executeUseCase(TriggeredEvent<CreatedPlan> createdPlanTriggeredEvent) {
        var event = createdPlanTriggeredEvent.getDomainEvent();
        var  plan = Plan.from(PlanId.of(event.aggregateParentId()), this.retrieveEvents());

        if(event.getPrice().value() < 300000.0) {

            plan.updatePrice(new Price(300000.0));
            emit().onResponse(new ResponseEvents(plan.getUncommittedChanges()));
        }
    }
}

