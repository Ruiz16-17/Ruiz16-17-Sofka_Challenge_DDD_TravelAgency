package co.com.sofka.domain.travelagency.travelplan.plan.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.plan.value.FeedingId;
import co.com.sofka.domain.travelagency.travelplan.plan.value.PlanId;
import co.com.sofka.domain.travelagency.travelplan.plan.value.TimeFeeding;

public class AddedFeeding extends Command {

    private final PlanId planId;
    private final FeedingId feedingId;
    private final Name name;
    private final TimeFeeding timeFeeding;

    public AddedFeeding(PlanId planId, FeedingId feedingId, Name name, TimeFeeding timeFeeding) {
        this.planId = planId;
        this.feedingId = feedingId;
        this.name = name;
        this.timeFeeding = timeFeeding;
    }

    public PlanId getPlanId() {
        return planId;
    }

    public FeedingId getFeedingId() {
        return feedingId;
    }

    public Name getName() {
        return name;
    }

    public TimeFeeding getTimeFeeding() {
        return timeFeeding;
    }
}
