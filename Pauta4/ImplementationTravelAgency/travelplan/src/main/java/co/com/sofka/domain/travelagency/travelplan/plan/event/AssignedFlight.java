package co.com.sofka.domain.travelagency.travelplan.plan.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.plan.value.FlightId;

public class AssignedFlieght extends DomainEvent {
    public AssignedFlieght(FlightId flightId) {
        super();
    }
}
