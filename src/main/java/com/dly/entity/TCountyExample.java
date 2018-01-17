package com.dly.entity;

import java.util.ArrayList;
import java.util.List;

public class TCountyExample
{
  protected String orderByClause;
  protected boolean distinct;
  protected List<Criteria> oredCriteria;

  public TCountyExample()
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

  public static class Criteria extends TCountyExample.GeneratedCriteria
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
    protected List<TCountyExample.Criterion> criteria;

    protected GeneratedCriteria()
    {
      this.criteria = new ArrayList();
    }

    public boolean isValid() {
      return this.criteria.size() > 0;
    }

    public List<TCountyExample.Criterion> getAllCriteria() {
      return this.criteria;
    }

    public List<TCountyExample.Criterion> getCriteria() {
      return this.criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      this.criteria.add(new TCountyExample.Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      this.criteria.add(new TCountyExample.Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if ((value1 == null) || (value2 == null)) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      this.criteria.add(new TCountyExample.Criterion(condition, value1, value2));
    }

    public TCountyExample.Criteria andIdIsNull() {
      addCriterion("id is null");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andIdIsNotNull() {
      addCriterion("id is not null");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andIdEqualTo(Integer value) {
      addCriterion("id =", value, "id");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andIdNotEqualTo(Integer value) {
      addCriterion("id <>", value, "id");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andIdGreaterThan(Integer value) {
      addCriterion("id >", value, "id");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("id >=", value, "id");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andIdLessThan(Integer value) {
      addCriterion("id <", value, "id");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andIdLessThanOrEqualTo(Integer value) {
      addCriterion("id <=", value, "id");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andIdIn(List<Integer> values) {
      addCriterion("id in", values, "id");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andIdNotIn(List<Integer> values) {
      addCriterion("id not in", values, "id");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andIdBetween(Integer value1, Integer value2) {
      addCriterion("id between", value1, value2, "id");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
      addCriterion("id not between", value1, value2, "id");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andNameIsNull() {
      addCriterion("name is null");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andNameIsNotNull() {
      addCriterion("name is not null");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andNameEqualTo(String value) {
      addCriterion("name =", value, "name");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andNameNotEqualTo(String value) {
      addCriterion("name <>", value, "name");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andNameGreaterThan(String value) {
      addCriterion("name >", value, "name");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andNameGreaterThanOrEqualTo(String value) {
      addCriterion("name >=", value, "name");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andNameLessThan(String value) {
      addCriterion("name <", value, "name");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andNameLessThanOrEqualTo(String value) {
      addCriterion("name <=", value, "name");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andNameLike(String value) {
      addCriterion("name like", value, "name");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andNameNotLike(String value) {
      addCriterion("name not like", value, "name");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andNameIn(List<String> values) {
      addCriterion("name in", values, "name");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andNameNotIn(List<String> values) {
      addCriterion("name not in", values, "name");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andNameBetween(String value1, String value2) {
      addCriterion("name between", value1, value2, "name");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andNameNotBetween(String value1, String value2) {
      addCriterion("name not between", value1, value2, "name");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andCityIdIsNull() {
      addCriterion("city_id is null");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andCityIdIsNotNull() {
      addCriterion("city_id is not null");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andCityIdEqualTo(Integer value) {
      addCriterion("city_id =", value, "cityId");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andCityIdNotEqualTo(Integer value) {
      addCriterion("city_id <>", value, "cityId");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andCityIdGreaterThan(Integer value) {
      addCriterion("city_id >", value, "cityId");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("city_id >=", value, "cityId");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andCityIdLessThan(Integer value) {
      addCriterion("city_id <", value, "cityId");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andCityIdLessThanOrEqualTo(Integer value) {
      addCriterion("city_id <=", value, "cityId");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andCityIdIn(List<Integer> values) {
      addCriterion("city_id in", values, "cityId");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andCityIdNotIn(List<Integer> values) {
      addCriterion("city_id not in", values, "cityId");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andCityIdBetween(Integer value1, Integer value2) {
      addCriterion("city_id between", value1, value2, "cityId");
      return (TCountyExample.Criteria)this;
    }

    public TCountyExample.Criteria andCityIdNotBetween(Integer value1, Integer value2) {
      addCriterion("city_id not between", value1, value2, "cityId");
      return (TCountyExample.Criteria)this;
    }
  }
}