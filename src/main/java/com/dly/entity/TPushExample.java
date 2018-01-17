package com.dly.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TPushExample
{
  protected String orderByClause;
  protected boolean distinct;
  protected List<Criteria> oredCriteria;

  public TPushExample()
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

  public static class Criteria extends TPushExample.GeneratedCriteria
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
    protected List<TPushExample.Criterion> criteria;

    protected GeneratedCriteria()
    {
      this.criteria = new ArrayList();
    }

    public boolean isValid() {
      return this.criteria.size() > 0;
    }

    public List<TPushExample.Criterion> getAllCriteria() {
      return this.criteria;
    }

    public List<TPushExample.Criterion> getCriteria() {
      return this.criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      this.criteria.add(new TPushExample.Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      this.criteria.add(new TPushExample.Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if ((value1 == null) || (value2 == null)) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      this.criteria.add(new TPushExample.Criterion(condition, value1, value2));
    }

    public TPushExample.Criteria andIdIsNull() {
      addCriterion("id is null");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andIdIsNotNull() {
      addCriterion("id is not null");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andIdEqualTo(Integer value) {
      addCriterion("id =", value, "id");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andIdNotEqualTo(Integer value) {
      addCriterion("id <>", value, "id");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andIdGreaterThan(Integer value) {
      addCriterion("id >", value, "id");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("id >=", value, "id");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andIdLessThan(Integer value) {
      addCriterion("id <", value, "id");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andIdLessThanOrEqualTo(Integer value) {
      addCriterion("id <=", value, "id");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andIdIn(List<Integer> values) {
      addCriterion("id in", values, "id");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andIdNotIn(List<Integer> values) {
      addCriterion("id not in", values, "id");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andIdBetween(Integer value1, Integer value2) {
      addCriterion("id between", value1, value2, "id");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
      addCriterion("id not between", value1, value2, "id");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andBodyIsNull() {
      addCriterion("body is null");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andBodyIsNotNull() {
      addCriterion("body is not null");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andBodyEqualTo(String value) {
      addCriterion("body =", value, "body");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andBodyNotEqualTo(String value) {
      addCriterion("body <>", value, "body");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andBodyGreaterThan(String value) {
      addCriterion("body >", value, "body");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andBodyGreaterThanOrEqualTo(String value) {
      addCriterion("body >=", value, "body");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andBodyLessThan(String value) {
      addCriterion("body <", value, "body");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andBodyLessThanOrEqualTo(String value) {
      addCriterion("body <=", value, "body");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andBodyLike(String value) {
      addCriterion("body like", value, "body");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andBodyNotLike(String value) {
      addCriterion("body not like", value, "body");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andBodyIn(List<String> values) {
      addCriterion("body in", values, "body");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andBodyNotIn(List<String> values) {
      addCriterion("body not in", values, "body");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andBodyBetween(String value1, String value2) {
      addCriterion("body between", value1, value2, "body");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andBodyNotBetween(String value1, String value2) {
      addCriterion("body not between", value1, value2, "body");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andDateIsNull() {
      addCriterion("date is null");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andDateIsNotNull() {
      addCriterion("date is not null");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andDateEqualTo(Date value) {
      addCriterion("date =", value, "date");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andDateNotEqualTo(Date value) {
      addCriterion("date <>", value, "date");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andDateGreaterThan(Date value) {
      addCriterion("date >", value, "date");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andDateGreaterThanOrEqualTo(Date value) {
      addCriterion("date >=", value, "date");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andDateLessThan(Date value) {
      addCriterion("date <", value, "date");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andDateLessThanOrEqualTo(Date value) {
      addCriterion("date <=", value, "date");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andDateIn(List<Date> values) {
      addCriterion("date in", values, "date");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andDateNotIn(List<Date> values) {
      addCriterion("date not in", values, "date");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andDateBetween(Date value1, Date value2) {
      addCriterion("date between", value1, value2, "date");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andDateNotBetween(Date value1, Date value2) {
      addCriterion("date not between", value1, value2, "date");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andTitleIsNull() {
      addCriterion("title is null");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andTitleIsNotNull() {
      addCriterion("title is not null");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andTitleEqualTo(String value) {
      addCriterion("title =", value, "title");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andTitleNotEqualTo(String value) {
      addCriterion("title <>", value, "title");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andTitleGreaterThan(String value) {
      addCriterion("title >", value, "title");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andTitleGreaterThanOrEqualTo(String value) {
      addCriterion("title >=", value, "title");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andTitleLessThan(String value) {
      addCriterion("title <", value, "title");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andTitleLessThanOrEqualTo(String value) {
      addCriterion("title <=", value, "title");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andTitleLike(String value) {
      addCriterion("title like", value, "title");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andTitleNotLike(String value) {
      addCriterion("title not like", value, "title");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andTitleIn(List<String> values) {
      addCriterion("title in", values, "title");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andTitleNotIn(List<String> values) {
      addCriterion("title not in", values, "title");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andTitleBetween(String value1, String value2) {
      addCriterion("title between", value1, value2, "title");
      return (TPushExample.Criteria)this;
    }

    public TPushExample.Criteria andTitleNotBetween(String value1, String value2) {
      addCriterion("title not between", value1, value2, "title");
      return (TPushExample.Criteria)this;
    }
  }
}