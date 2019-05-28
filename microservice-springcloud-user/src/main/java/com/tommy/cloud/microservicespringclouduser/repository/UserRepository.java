package com.tommy.cloud.microservicespringclouduser.repository;

import com.tommy.cloud.microservicespringclouduser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
