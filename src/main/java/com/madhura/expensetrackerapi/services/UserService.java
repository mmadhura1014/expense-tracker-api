package com.madhura.expensetrackerapi.services;

import com.madhura.expensetrackerapi.domain.User;
import com.madhura.expensetrackerapi.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;

}
