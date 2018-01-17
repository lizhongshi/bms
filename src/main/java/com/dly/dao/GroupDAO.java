package com.dly.dao;

import com.dly.entity.Group_m;
import java.util.List;

public abstract interface GroupDAO
{
  public abstract List<Group_m> test();

  public abstract List<Group_m> getGroupByCountyIdAndMoudleIdAndLevelId(Group_m paramGroup_m);

  public abstract List<Group_m> getAll();

  public abstract int insertGroup(Group_m paramGroup_m);

  public abstract int deleteGroupById(Integer paramInteger);

  public abstract int editGroupById(Group_m paramGroup_m);
}