package co.com.sofka.usecase.triggeredcommand;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.travelagency.travelplan.plan.Plan;
import co.com.sofka.domain.travelagency.travelplan.plan.command.CreatePlan;

public class CreatePlanUseCase extends UseCase<RequestCommand<CreatePlan>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreatePlan> createPlanRequestCommand) {
        var command = createPlanRequestCommand.getCommand();

        var plan = new Plan(
                command.getPlanId(),
                command.getName(),
                command.getDescription(),
                command.getDestinationPlace(),
                command.getPrice(),
                command.getNumberPeople(),
                command.getNumberDay()
        );

        emit().onResponse(new ResponseEvents(plan.getUncommittedChanges()));
    }
}
