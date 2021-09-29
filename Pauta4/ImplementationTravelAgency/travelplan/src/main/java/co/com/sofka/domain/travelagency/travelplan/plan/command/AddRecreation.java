package co.com.sofka.domain.travelagency.travelplan.plan.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Address;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Description;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.plan.value.PlanId;
import co.com.sofka.domain.travelagency.travelplan.plan.value.RecreationId;

public class AddedRecreation extends Command {

    private final PlanId planId;
    private final RecreationId recreationId;
    private final Name name;
    private final Description description;
    private final Address address;

    public AddedRecreation(PlanId planId, RecreationId recreationId, Name name, Description description, Address address) {
        this.planId = planId;
        this.recreationId = recreationId;
        this.name = name;
        this.description = description;
        this.address = address;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public RecreationId getRecreationId() {
        return recreationId;
    }

    public Name getName() {
        return name;
    }

    public Description getDescription() {
        return description;
    }

    public Address getAddress() {
        return address;
    }
}
