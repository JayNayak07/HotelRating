package com.boot.user.service.reporsitories;


import com.boot.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String>
{

}
