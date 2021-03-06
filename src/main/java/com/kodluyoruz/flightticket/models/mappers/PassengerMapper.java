package com.kodluyoruz.flightticket.models.mappers;

import com.kodluyoruz.flightticket.models.dto.PageAbleResponse;
import com.kodluyoruz.flightticket.models.dto.PassangerDto;
import com.kodluyoruz.flightticket.models.dto.TicketDto;
import com.kodluyoruz.flightticket.models.entity.Passenger;
import com.kodluyoruz.flightticket.models.entity.Ticket;
import com.kodluyoruz.flightticket.models.requests.passanger.CreatePassangerRequest;
import com.kodluyoruz.flightticket.models.requests.passanger.PassengerUpdateRequest;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

import java.util.List;

import static com.kodluyoruz.flightticket.models.mappers.PageAbleMapper.MAPPER_PAGE_ABLE;

@Mapper(componentModel = "spring")
public interface PassengerMapper {
    PassengerMapper MAPPER_PASSENGER = Mappers.getMapper(PassengerMapper.class);

    Passenger createPassengerRequestToPassenger(CreatePassangerRequest createPassangerRequest);

    PassangerDto passengerToPassengerDto(Passenger passenger);

    TicketDto ticketToTicketDto(Ticket ticket);

    List<PassangerDto> passengersToPassengerDtos(List<Passenger> passengers);

    default PageAbleResponse<PassangerDto> passengerPageToPassengerPageDtos(Page<Passenger> pages){
        return MAPPER_PAGE_ABLE.toPageDto(pages,MAPPER_PASSENGER::passengerToPassengerDto);
    }

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void passengerUpdateFromUpdateRequest(@MappingTarget Passenger passenger, PassengerUpdateRequest passengerUpdateRequest);
}
