package com.kachan.repository;

import com.kachan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface JpaUserRepository extends JpaRepository<User, Long> {
    @Override
    @Transactional
    <S extends User> S save(S entity);

    User findUserById(Long id);

    @Override
    List<User> findAll();

    List<User> findUserBySurname(String surname);

    List<User> findUserByFirstname(String firstName);

    List<User> findUserByPatronymic(String patronymic);

    User findUserByPhoneNumber(String phoneNumber);
}
