package com.madhura.expensetrackerapi.repositories;

import com.madhura.expensetrackerapi.domain.User;
import com.madhura.expensetrackerapi.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findbyEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findbyId(Integer userId);
}
