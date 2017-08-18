package com.umesh.repository;

import com.umesh.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by umesh_w on 8/16/2017.
 */
@Component
public interface UserRepository extends CrudRepository<User, Long> {



}
