package com.dly.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.dly.entity.Moudle;



public interface MoudleRepository extends JpaRepository<Moudle,Integer>,JpaSpecificationExecutor<Moudle> {
	@Query(value="select * from t_admin where user_name=?1",nativeQuery=true)
	public Moudle findUserByUserName(String userName);
	

}
