package com.eltongas.turistuy.services.implement;

import com.eltongas.turistuy.entities.Users;
import com.eltongas.turistuy.repository.IUserRepository;
import com.eltongas.turistuy.services.IUserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements IUserServices  {

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public Users saveUser(Users users) {
        return iUserRepository.save(users);
    }

    @Override
    public List<Users> getAllUsers() {
        return iUserRepository.findAll();
    }

    @Override
    public Optional<Users> findByID(Integer id) {
        return iUserRepository.findById(id);
    }
}
