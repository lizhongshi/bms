package com.dly.entity;

import java.util.ArrayList;
import java.util.List;

public class TGroupImageExample
{
  protected String orderByClause;
  protected boolean distinct;
  protected List<Criteria> oredCriteria;

  public TGroupImageExample()
  {
    this.oredCriteria = new ArrayList();
  }

  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  public String getOrderByClause() {
    return this.orderByClause;
  }

  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  public boolean isDistinct() {
    return this.distinct;
  }

  public List<Criteria> getOredCriteria() {
    return this.oredCriteria;
  }

  public void or(Criteria criteria) {
    this.oredCriteria.add(criteria);
  }

  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    this.oredCriteria.add(criteria);
    return criteria;
  }

  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (this.oredCriteria.size() == 0) {
      this.oredCriteria.add(criteria);
    }
    return criteria;
  }

  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  public void clear() {
    this.oredCriteria.clear();
    this.orderByClause = null;
    this.distinct = false;
  }

  public static class Criteria extends TGroupImageExample.GeneratedCriteria
  {
  }

  public static class Criterion
  {
    private String condition;
    private Object value;
    private Object secondValue;
    private boolean noValue;
    private boolean singleValue;
    private boolean betweenValue;
    private boolean listValue;
    private String typeHandler;

    public String getCondition()
    {
      return this.condition;
    }

    public Object getValue() {
      return this.value;
    }

    public Object getSecondValue() {
      return this.secondValue;
    }

    public boolean isNoValue() {
      return this.noValue;
    }

    public boolean isSingleValue() {
      return this.singleValue;
    }

    public boolean isBetweenValue() {
      return this.betweenValue;
    }

    public boolean isListValue() {
      return this.listValue;
    }

    public String getTypeHandler() {
      return this.typeHandler;
    }

    protected Criterion(String condition)
    {
      this.condition = condition;
      this.typeHandler = null;
      this.noValue = true;
    }

    protected Criterion(String condition, Object value, String typeHandler)
    {
      this.condition = condition;
      this.value = value;
      this.typeHandler = typeHandler;
      if ((value instanceof List))
        this.listValue = true;
      else
        this.singleValue = true;
    }

    protected Criterion(String condition, Object value)
    {
      this(condition, value, null);
    }

    protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
    {
      this.condition = condition;
      this.value = value;
      this.secondValue = secondValue;
      this.typeHandler = typeHandler;
      this.betweenValue = true;
    }

    protected Criterion(String condition, Object value, Object secondValue) {
      this(condition, value, secondValue, null);
    }
  }

  protected static abstract class GeneratedCriteria
  {
    protected List<TGroupImageExample.Criterion> criteria;

    protected GeneratedCriteria()
    {
      this.criteria = new ArrayList();
    }

    public boolean isValid() {
      return this.criteria.size() > 0;
    }

    public List<TGroupImageExample.Criterion> getAllCriteria() {
      return this.criteria;
    }

    public List<TGroupImageExample.Criterion> getCriteria() {
      return this.criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      this.criteria.add(new TGroupImageExample.Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      this.criteria.add(new TGroupImageExample.Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if ((value1 == null) || (value2 == null)) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      this.criteria.add(new TGroupImageExample.Criterion(condition, value1, value2));
    }

    public TGroupImageExample.Criteria andIdIsNull() {
      addCriterion("id is null");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andIdIsNotNull() {
      addCriterion("id is not null");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andIdEqualTo(Integer value) {
      addCriterion("id =", value, "id");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andIdNotEqualTo(Integer value) {
      addCriterion("id <>", value, "id");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andIdGreaterThan(Integer value) {
      addCriterion("id >", value, "id");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("id >=", value, "id");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andIdLessThan(Integer value) {
      addCriterion("id <", value, "id");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andIdLessThanOrEqualTo(Integer value) {
      addCriterion("id <=", value, "id");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andIdIn(List<Integer> values) {
      addCriterion("id in", values, "id");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andIdNotIn(List<Integer> values) {
      addCriterion("id not in", values, "id");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andIdBetween(Integer value1, Integer value2) {
      addCriterion("id between", value1, value2, "id");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
      addCriterion("id not between", value1, value2, "id");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andGroupIdIsNull() {
      addCriterion("group_id is null");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andGroupIdIsNotNull() {
      addCriterion("group_id is not null");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andGroupIdEqualTo(Integer value) {
      addCriterion("group_id =", value, "groupId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andGroupIdNotEqualTo(Integer value) {
      addCriterion("group_id <>", value, "groupId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andGroupIdGreaterThan(Integer value) {
      addCriterion("group_id >", value, "groupId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("group_id >=", value, "groupId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andGroupIdLessThan(Integer value) {
      addCriterion("group_id <", value, "groupId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andGroupIdLessThanOrEqualTo(Integer value) {
      addCriterion("group_id <=", value, "groupId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andGroupIdIn(List<Integer> values) {
      addCriterion("group_id in", values, "groupId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andGroupIdNotIn(List<Integer> values) {
      addCriterion("group_id not in", values, "groupId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andGroupIdBetween(Integer value1, Integer value2) {
      addCriterion("group_id between", value1, value2, "groupId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
      addCriterion("group_id not between", value1, value2, "groupId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andImageIdIsNull() {
      addCriterion("image_id is null");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andImageIdIsNotNull() {
      addCriterion("image_id is not null");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andImageIdEqualTo(Integer value) {
      addCriterion("image_id =", value, "imageId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andImageIdNotEqualTo(Integer value) {
      addCriterion("image_id <>", value, "imageId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andImageIdGreaterThan(Integer value) {
      addCriterion("image_id >", value, "imageId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andImageIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("image_id >=", value, "imageId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andImageIdLessThan(Integer value) {
      addCriterion("image_id <", value, "imageId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andImageIdLessThanOrEqualTo(Integer value) {
      addCriterion("image_id <=", value, "imageId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andImageIdIn(List<Integer> values) {
      addCriterion("image_id in", values, "imageId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andImageIdNotIn(List<Integer> values) {
      addCriterion("image_id not in", values, "imageId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andImageIdBetween(Integer value1, Integer value2) {
      addCriterion("image_id between", value1, value2, "imageId");
      return (TGroupImageExample.Criteria)this;
    }

    public TGroupImageExample.Criteria andImageIdNotBetween(Integer value1, Integer value2) {
      addCriterion("image_id not between", value1, value2, "imageId");
      return (TGroupImageExample.Criteria)this;
    }
  }
}