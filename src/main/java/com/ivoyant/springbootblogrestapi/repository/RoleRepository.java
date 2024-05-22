package com.ivoyant.springbootblogrestapi.repository;

import com.ivoyant.springbootblogrestapi.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

}
