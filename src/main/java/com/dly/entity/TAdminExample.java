package com.dly.entity;

import java.util.ArrayList;
import java.util.List;

public class TAdminExample
{
  protected String orderByClause;
  protected boolean distinct;
  protected List<Criteria> oredCriteria;

  public TAdminExample()
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

  public static class Criteria extends TAdminExample.GeneratedCriteria
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
    protected List<TAdminExample.Criterion> criteria;

    protected GeneratedCriteria()
    {
      this.criteria = new ArrayList();
    }

    public boolean isValid() {
      return this.criteria.size() > 0;
    }

    public List<TAdminExample.Criterion> getAllCriteria() {
      return this.criteria;
    }

    public List<TAdminExample.Criterion> getCriteria() {
      return this.criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      this.criteria.add(new TAdminExample.Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      this.criteria.add(new TAdminExample.Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if ((value1 == null) || (value2 == null)) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      this.criteria.add(new TAdminExample.Criterion(condition, value1, value2));
    }

    public TAdminExample.Criteria andIdIsNull() {
      addCriterion("id is null");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andIdIsNotNull() {
      addCriterion("id is not null");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andIdEqualTo(Integer value) {
      addCriterion("id =", value, "id");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andIdNotEqualTo(Integer value) {
      addCriterion("id <>", value, "id");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andIdGreaterThan(Integer value) {
      addCriterion("id >", value, "id");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("id >=", value, "id");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andIdLessThan(Integer value) {
      addCriterion("id <", value, "id");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andIdLessThanOrEqualTo(Integer value) {
      addCriterion("id <=", value, "id");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andIdIn(List<Integer> values) {
      addCriterion("id in", values, "id");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andIdNotIn(List<Integer> values) {
      addCriterion("id not in", values, "id");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andIdBetween(Integer value1, Integer value2) {
      addCriterion("id between", value1, value2, "id");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
      addCriterion("id not between", value1, value2, "id");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andPasswordIsNull() {
      addCriterion("password is null");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andPasswordIsNotNull() {
      addCriterion("password is not null");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andPasswordEqualTo(String value) {
      addCriterion("password =", value, "password");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andPasswordNotEqualTo(String value) {
      addCriterion("password <>", value, "password");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andPasswordGreaterThan(String value) {
      addCriterion("password >", value, "password");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andPasswordGreaterThanOrEqualTo(String value) {
      addCriterion("password >=", value, "password");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andPasswordLessThan(String value) {
      addCriterion("password <", value, "password");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andPasswordLessThanOrEqualTo(String value) {
      addCriterion("password <=", value, "password");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andPasswordLike(String value) {
      addCriterion("password like", value, "password");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andPasswordNotLike(String value) {
      addCriterion("password not like", value, "password");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andPasswordIn(List<String> values) {
      addCriterion("password in", values, "password");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andPasswordNotIn(List<String> values) {
      addCriterion("password not in", values, "password");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andPasswordBetween(String value1, String value2) {
      addCriterion("password between", value1, value2, "password");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andPasswordNotBetween(String value1, String value2) {
      addCriterion("password not between", value1, value2, "password");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andUserNameIsNull() {
      addCriterion("user_name is null");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andUserNameIsNotNull() {
      addCriterion("user_name is not null");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andUserNameEqualTo(String value) {
      addCriterion("user_name =", value, "userName");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andUserNameNotEqualTo(String value) {
      addCriterion("user_name <>", value, "userName");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andUserNameGreaterThan(String value) {
      addCriterion("user_name >", value, "userName");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andUserNameGreaterThanOrEqualTo(String value) {
      addCriterion("user_name >=", value, "userName");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andUserNameLessThan(String value) {
      addCriterion("user_name <", value, "userName");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andUserNameLessThanOrEqualTo(String value) {
      addCriterion("user_name <=", value, "userName");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andUserNameLike(String value) {
      addCriterion("user_name like", value, "userName");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andUserNameNotLike(String value) {
      addCriterion("user_name not like", value, "userName");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andUserNameIn(List<String> values) {
      addCriterion("user_name in", values, "userName");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andUserNameNotIn(List<String> values) {
      addCriterion("user_name not in", values, "userName");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andUserNameBetween(String value1, String value2) {
      addCriterion("user_name between", value1, value2, "userName");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andUserNameNotBetween(String value1, String value2) {
      addCriterion("user_name not between", value1, value2, "userName");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andSaltIsNull() {
      addCriterion("salt is null");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andSaltIsNotNull() {
      addCriterion("salt is not null");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andSaltEqualTo(String value) {
      addCriterion("salt =", value, "salt");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andSaltNotEqualTo(String value) {
      addCriterion("salt <>", value, "salt");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andSaltGreaterThan(String value) {
      addCriterion("salt >", value, "salt");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andSaltGreaterThanOrEqualTo(String value) {
      addCriterion("salt >=", value, "salt");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andSaltLessThan(String value) {
      addCriterion("salt <", value, "salt");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andSaltLessThanOrEqualTo(String value) {
      addCriterion("salt <=", value, "salt");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andSaltLike(String value) {
      addCriterion("salt like", value, "salt");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andSaltNotLike(String value) {
      addCriterion("salt not like", value, "salt");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andSaltIn(List<String> values) {
      addCriterion("salt in", values, "salt");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andSaltNotIn(List<String> values) {
      addCriterion("salt not in", values, "salt");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andSaltBetween(String value1, String value2) {
      addCriterion("salt between", value1, value2, "salt");
      return (TAdminExample.Criteria)this;
    }

    public TAdminExample.Criteria andSaltNotBetween(String value1, String value2) {
      addCriterion("salt not between", value1, value2, "salt");
      return (TAdminExample.Criteria)this;
    }
  }
}