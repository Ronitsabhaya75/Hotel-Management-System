package com.ronitdev.LocalHotel.service.interfac;

import com.ronitdev.LocalHotel.dto.Response;
import com.ronitdev.LocalHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}