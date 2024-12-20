package com.ronitdev.LocalHotel.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ronitdev.LocalHotel.entity.Booking;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}