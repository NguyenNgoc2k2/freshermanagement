package com.example.freshermanagement.service;

import com.example.freshermanagement.entity.Fresher;
import com.example.freshermanagement.entity.Result;

import java.util.List;

public interface FresherService extends UserService<Fresher>{
    boolean deleteById(Long id);
    boolean updateById(Long id, Fresher fresher);
    boolean scoringForFresher(Long id, Result result);
    List<Fresher> findAllByNameWithAdminOrManager(String usernameAdminOrManager, String keyword);
    List<Fresher> findAllByEmailWithAdminOrManager(String usernameAdminOrManager, String keyword);
    List<Fresher> findAllByLanguageWithAdminOrManager(String usernameAdminOrManager, String keyword);
    List<Fresher> findAllWithAdminOrManager(String usernameAdminOrManager);
}
