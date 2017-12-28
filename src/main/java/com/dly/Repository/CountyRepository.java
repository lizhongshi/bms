package com.dly.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.dly.entity.County;
import com.dly.entity.Group;



public interface CountyRepository extends JpaRepository<County,Integer>,JpaSpecificationExecutor<County> {

	

}
