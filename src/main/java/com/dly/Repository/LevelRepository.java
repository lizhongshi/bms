package com.dly.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.dly.entity.County;
import com.dly.entity.Level;



public interface LevelRepository extends JpaRepository<Level,Integer>,JpaSpecificationExecutor<Level> {

	

}
