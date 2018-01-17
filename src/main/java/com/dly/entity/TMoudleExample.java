package com.dly.entity;

import java.util.ArrayList;
import java.util.List;

public class TMoudleExample
{
  protected String orderByClause;
  protected boolean distinct;
  protected List<Criteria> oredCriteria;

  public TMoudleExample()
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

  public static class Criteria extends TMoudleExample.GeneratedCriteria
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
    protected List<TMoudleExample.Criterion> criteria;

    protected GeneratedCriteria()
    {
      this.criteria = new ArrayList();
    }

    public boolean isValid() {
      return this.criteria.size() > 0;
    }

    public List<TMoudleExample.Criterion> getAllCriteria() {
      return this.criteria;
    }

    public List<TMoudleExample.Criterion> getCriteria() {
      return this.criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      this.criteria.add(new TMoudleExample.Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      this.criteria.add(new TMoudleExample.Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if ((value1 == null) || (value2 == null)) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      this.criteria.add(new TMoudleExample.Criterion(condition, value1, value2));
    }

    public TMoudleExample.Criteria andIdIsNull() {
      addCriterion("id is null");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andIdIsNotNull() {
      addCriterion("id is not null");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andIdEqualTo(Integer value) {
      addCriterion("id =", value, "id");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andIdNotEqualTo(Integer value) {
      addCriterion("id <>", value, "id");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andIdGreaterThan(Integer value) {
      addCriterion("id >", value, "id");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("id >=", value, "id");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andIdLessThan(Integer value) {
      addCriterion("id <", value, "id");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andIdLessThanOrEqualTo(Integer value) {
      addCriterion("id <=", value, "id");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andIdIn(List<Integer> values) {
      addCriterion("id in", values, "id");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andIdNotIn(List<Integer> values) {
      addCriterion("id not in", values, "id");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andIdBetween(Integer value1, Integer value2) {
      addCriterion("id between", value1, value2, "id");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
      addCriterion("id not between", value1, value2, "id");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andTitleIsNull() {
      addCriterion("title is null");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andTitleIsNotNull() {
      addCriterion("title is not null");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andTitleEqualTo(String value) {
      addCriterion("title =", value, "title");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andTitleNotEqualTo(String value) {
      addCriterion("title <>", value, "title");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andTitleGreaterThan(String value) {
      addCriterion("title >", value, "title");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andTitleGreaterThanOrEqualTo(String value) {
      addCriterion("title >=", value, "title");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andTitleLessThan(String value) {
      addCriterion("title <", value, "title");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andTitleLessThanOrEqualTo(String value) {
      addCriterion("title <=", value, "title");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andTitleLike(String value) {
      addCriterion("title like", value, "title");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andTitleNotLike(String value) {
      addCriterion("title not like", value, "title");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andTitleIn(List<String> values) {
      addCriterion("title in", values, "title");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andTitleNotIn(List<String> values) {
      addCriterion("title not in", values, "title");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andTitleBetween(String value1, String value2) {
      addCriterion("title between", value1, value2, "title");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andTitleNotBetween(String value1, String value2) {
      addCriterion("title not between", value1, value2, "title");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andImageIdIsNull() {
      addCriterion("image_id is null");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andImageIdIsNotNull() {
      addCriterion("image_id is not null");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andImageIdEqualTo(Integer value) {
      addCriterion("image_id =", value, "imageId");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andImageIdNotEqualTo(Integer value) {
      addCriterion("image_id <>", value, "imageId");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andImageIdGreaterThan(Integer value) {
      addCriterion("image_id >", value, "imageId");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andImageIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("image_id >=", value, "imageId");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andImageIdLessThan(Integer value) {
      addCriterion("image_id <", value, "imageId");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andImageIdLessThanOrEqualTo(Integer value) {
      addCriterion("image_id <=", value, "imageId");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andImageIdIn(List<Integer> values) {
      addCriterion("image_id in", values, "imageId");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andImageIdNotIn(List<Integer> values) {
      addCriterion("image_id not in", values, "imageId");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andImageIdBetween(Integer value1, Integer value2) {
      addCriterion("image_id between", value1, value2, "imageId");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andImageIdNotBetween(Integer value1, Integer value2) {
      addCriterion("image_id not between", value1, value2, "imageId");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andDsfUrlIsNull() {
      addCriterion("dsf_url is null");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andDsfUrlIsNotNull() {
      addCriterion("dsf_url is not null");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andDsfUrlEqualTo(String value) {
      addCriterion("dsf_url =", value, "dsfUrl");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andDsfUrlNotEqualTo(String value) {
      addCriterion("dsf_url <>", value, "dsfUrl");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andDsfUrlGreaterThan(String value) {
      addCriterion("dsf_url >", value, "dsfUrl");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andDsfUrlGreaterThanOrEqualTo(String value) {
      addCriterion("dsf_url >=", value, "dsfUrl");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andDsfUrlLessThan(String value) {
      addCriterion("dsf_url <", value, "dsfUrl");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andDsfUrlLessThanOrEqualTo(String value) {
      addCriterion("dsf_url <=", value, "dsfUrl");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andDsfUrlLike(String value) {
      addCriterion("dsf_url like", value, "dsfUrl");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andDsfUrlNotLike(String value) {
      addCriterion("dsf_url not like", value, "dsfUrl");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andDsfUrlIn(List<String> values) {
      addCriterion("dsf_url in", values, "dsfUrl");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andDsfUrlNotIn(List<String> values) {
      addCriterion("dsf_url not in", values, "dsfUrl");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andDsfUrlBetween(String value1, String value2) {
      addCriterion("dsf_url between", value1, value2, "dsfUrl");
      return (TMoudleExample.Criteria)this;
    }

    public TMoudleExample.Criteria andDsfUrlNotBetween(String value1, String value2) {
      addCriterion("dsf_url not between", value1, value2, "dsfUrl");
      return (TMoudleExample.Criteria)this;
    }
  }
}