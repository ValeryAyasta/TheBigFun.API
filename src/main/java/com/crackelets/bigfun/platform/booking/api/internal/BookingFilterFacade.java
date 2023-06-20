package com.crackelets.bigfun.platform.booking.api.internal;

import com.crackelets.bigfun.platform.booking.domain.model.Event;

import java.util.List;

public interface BookingFilterFacade {

   List<Event> getAllEvents();
   List<Event> getAllByOrganizerId(Long id);

}
