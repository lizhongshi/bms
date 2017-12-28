package com.dly.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.dly.entity.Group;



public interface GroupRepository extends JpaRepository<Group,Integer>,JpaSpecificationExecutor<Group> {
	
	@Query(value="select * from t_group  where county_id=?1 and moudle_id=?2  and  level_id=?3",nativeQuery=true)
	public List<Group> findGroupByMoudleId(Integer countyId,Integer moudleId,Integer levelId);
	

}
