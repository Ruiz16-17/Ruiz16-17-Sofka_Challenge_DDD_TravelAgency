package co.com.sofka.usecase.triggeredevent;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Description;
import co.com.sofka.domain.travelagency.travelplan.generic.value.Name;
import co.com.sofka.domain.travelagency.travelplan.plan.Plan;
import co.com.sofka.domain.travelagency.travelplan.plan.value.*;

import java.util.List;

public class CreatePlanUseCase extends UseCase<CreatePlanUseCase.Request, CreatePlanUseCase.Response> {

    @Override
    public void executeUseCase(Request request) {

        var plan = new Plan(
                PlanId.of(request.planId),
                new Name(request.name),
                new Description(request.description),
                new DestinationPlace(request.destinationPlace),
                new Price(request.price),
                new NumberPeople(request().numberPeople),
                new NumberDay(request().numberDay)
        );

        List<DomainEvent> eventList = plan.getUncommittedChanges();
        emit().onResponse(new Response(eventList));
    }

    public static class Request implements UseCase.RequestValues {

        private final String planId;
        private final String name;
        private final String description;
        private final String destinationPlace;
        private final Double price;
        private final String numberPeople;
        private final String numberDay;

        public Request(String planId, String name, String description, String destinationPlace, Double price, String numberPeople, String numberDay) {
            this.planId = planId;
            this.name = name;
            this.description = description;
            this.destinationPlace = destinationPlace;
            this.price = price;
            this.numberPeople = numberPeople;
            this.numberDay = numberDay;
        }

        //region Getters

        public String getPlanId() {
            return planId;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getDestinationPlace() {
            return destinationPlace;
        }

        public Double getPrice() {
            return price;
        }

        public String getNumberPeople() {
            return numberPeople;
        }

        public String getNumberDay() {
            return numberDay;
        }


        //endregion
    }

    public static class Response implements UseCase.ResponseValues{

        private final List<DomainEvent> eventList;

        public Response(List<DomainEvent> eventList){
            this.eventList = eventList;
        }

        public List<DomainEvent> getEventList(){
            return eventList;
        }
    }
}

