package com.dly.entity;

import java.util.ArrayList;
import java.util.List;

public class TCarouselExample
{
  protected String orderByClause;
  protected boolean distinct;
  protected List<Criteria> oredCriteria;

  public TCarouselExample()
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

  public static class Criteria extends TCarouselExample.GeneratedCriteria
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
    protected List<TCarouselExample.Criterion> criteria;

    protected GeneratedCriteria()
    {
      this.criteria = new ArrayList();
    }

    public boolean isValid() {
      return this.criteria.size() > 0;
    }

    public List<TCarouselExample.Criterion> getAllCriteria() {
      return this.criteria;
    }

    public List<TCarouselExample.Criterion> getCriteria() {
      return this.criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      this.criteria.add(new TCarouselExample.Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      this.criteria.add(new TCarouselExample.Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if ((value1 == null) || (value2 == null)) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      this.criteria.add(new TCarouselExample.Criterion(condition, value1, value2));
    }

    public TCarouselExample.Criteria andIdIsNull() {
      addCriterion("id is null");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andIdIsNotNull() {
      addCriterion("id is not null");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andIdEqualTo(Integer value) {
      addCriterion("id =", value, "id");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andIdNotEqualTo(Integer value) {
      addCriterion("id <>", value, "id");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andIdGreaterThan(Integer value) {
      addCriterion("id >", value, "id");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("id >=", value, "id");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andIdLessThan(Integer value) {
      addCriterion("id <", value, "id");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andIdLessThanOrEqualTo(Integer value) {
      addCriterion("id <=", value, "id");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andIdIn(List<Integer> values) {
      addCriterion("id in", values, "id");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andIdNotIn(List<Integer> values) {
      addCriterion("id not in", values, "id");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andIdBetween(Integer value1, Integer value2) {
      addCriterion("id between", value1, value2, "id");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
      addCriterion("id not between", value1, value2, "id");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andImageIdIsNull() {
      addCriterion("image_id is null");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andImageIdIsNotNull() {
      addCriterion("image_id is not null");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andImageIdEqualTo(Integer value) {
      addCriterion("image_id =", value, "imageId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andImageIdNotEqualTo(Integer value) {
      addCriterion("image_id <>", value, "imageId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andImageIdGreaterThan(Integer value) {
      addCriterion("image_id >", value, "imageId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andImageIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("image_id >=", value, "imageId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andImageIdLessThan(Integer value) {
      addCriterion("image_id <", value, "imageId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andImageIdLessThanOrEqualTo(Integer value) {
      addCriterion("image_id <=", value, "imageId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andImageIdIn(List<Integer> values) {
      addCriterion("image_id in", values, "imageId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andImageIdNotIn(List<Integer> values) {
      addCriterion("image_id not in", values, "imageId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andImageIdBetween(Integer value1, Integer value2) {
      addCriterion("image_id between", value1, value2, "imageId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andImageIdNotBetween(Integer value1, Integer value2) {
      addCriterion("image_id not between", value1, value2, "imageId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andOrderedIsNull() {
      addCriterion("ordered is null");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andOrderedIsNotNull() {
      addCriterion("ordered is not null");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andOrderedEqualTo(Integer value) {
      addCriterion("ordered =", value, "ordered");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andOrderedNotEqualTo(Integer value) {
      addCriterion("ordered <>", value, "ordered");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andOrderedGreaterThan(Integer value) {
      addCriterion("ordered >", value, "ordered");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andOrderedGreaterThanOrEqualTo(Integer value) {
      addCriterion("ordered >=", value, "ordered");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andOrderedLessThan(Integer value) {
      addCriterion("ordered <", value, "ordered");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andOrderedLessThanOrEqualTo(Integer value) {
      addCriterion("ordered <=", value, "ordered");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andOrderedIn(List<Integer> values) {
      addCriterion("ordered in", values, "ordered");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andOrderedNotIn(List<Integer> values) {
      addCriterion("ordered not in", values, "ordered");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andOrderedBetween(Integer value1, Integer value2) {
      addCriterion("ordered between", value1, value2, "ordered");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andOrderedNotBetween(Integer value1, Integer value2) {
      addCriterion("ordered not between", value1, value2, "ordered");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andGroupIdIsNull() {
      addCriterion("group_id is null");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andGroupIdIsNotNull() {
      addCriterion("group_id is not null");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andGroupIdEqualTo(Integer value) {
      addCriterion("group_id =", value, "groupId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andGroupIdNotEqualTo(Integer value) {
      addCriterion("group_id <>", value, "groupId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andGroupIdGreaterThan(Integer value) {
      addCriterion("group_id >", value, "groupId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("group_id >=", value, "groupId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andGroupIdLessThan(Integer value) {
      addCriterion("group_id <", value, "groupId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andGroupIdLessThanOrEqualTo(Integer value) {
      addCriterion("group_id <=", value, "groupId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andGroupIdIn(List<Integer> values) {
      addCriterion("group_id in", values, "groupId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andGroupIdNotIn(List<Integer> values) {
      addCriterion("group_id not in", values, "groupId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andGroupIdBetween(Integer value1, Integer value2) {
      addCriterion("group_id between", value1, value2, "groupId");
      return (TCarouselExample.Criteria)this;
    }

    public TCarouselExample.Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
      addCriterion("group_id not between", value1, value2, "groupId");
      return (TCarouselExample.Criteria)this;
    }
  }
}