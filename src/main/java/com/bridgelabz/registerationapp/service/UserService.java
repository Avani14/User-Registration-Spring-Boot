package com.bridgelabz.registerationapp.service;

import com.bridgelabz.registerationapp.dto.LoginDTO;
import com.bridgelabz.registerationapp.dto.ResetDTO;
import com.bridgelabz.registerationapp.dto.UserDTO;
import com.bridgelabz.registerationapp.exceptions.MultipleUsers;
import com.bridgelabz.registerationapp.exceptions.UserNotFound;
import com.bridgelabz.registerationapp.model.User;

import java.util.List;

public interface UserService {
    User register(UserDTO userDTO) throws MultipleUsers;
    String login(LoginDTO loginDTO) throws UserNotFound;
    List<User> getUsers(String auth) throws UserNotFound;
    User forgotPassword(LoginDTO loginDTO,String auth) throws UserNotFound;
    User checkIfEmailIsPresentInDatabase(String auth);
    User reset(ResetDTO resetDTO, String auth) throws UserNotFound;
    boolean verify(int otp, String mail) throws UserNotFound;
    User getUser(String emailID) throws UserNotFound;
    User getUserByName(String name) throws UserNotFound;
    User getUserByNameAndEmail(String name,String email) throws UserNotFound;
    User getUserByNameAndVerify(String name,boolean verify) throws UserNotFound;

    List<User> getVerifiedUser() throws UserNotFound;
}
