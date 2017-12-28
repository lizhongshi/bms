package com.dly.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.dly.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User> {
	@Query(value="select * from t_admin where user_name=?1",nativeQuery=true)
	public User findUserByUserName(String userName);
	

}
