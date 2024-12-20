package com.ronitdev.LocalHotel.service.interfac;

import com.ronitdev.LocalHotel.dto.LoginRequest;
import com.ronitdev.LocalHotel.dto.Response;
import com.ronitdev.LocalHotel.entity.User;


public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
