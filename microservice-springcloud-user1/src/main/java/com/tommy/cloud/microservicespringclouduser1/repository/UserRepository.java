package com.tommy.cloud.microservicespringclouduser1.repository;

import com.tommy.cloud.microservicespringclouduser1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
