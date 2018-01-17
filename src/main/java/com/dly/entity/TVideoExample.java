package com.dly.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TVideoExample
{
  protected String orderByClause;
  protected boolean distinct;
  protected List<Criteria> oredCriteria;

  public TVideoExample()
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

  public static class Criteria extends TVideoExample.GeneratedCriteria
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
    protected List<TVideoExample.Criterion> criteria;

    protected GeneratedCriteria()
    {
      this.criteria = new ArrayList();
    }

    public boolean isValid() {
      return this.criteria.size() > 0;
    }

    public List<TVideoExample.Criterion> getAllCriteria() {
      return this.criteria;
    }

    public List<TVideoExample.Criterion> getCriteria() {
      return this.criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      this.criteria.add(new TVideoExample.Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      this.criteria.add(new TVideoExample.Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if ((value1 == null) || (value2 == null)) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      this.criteria.add(new TVideoExample.Criterion(condition, value1, value2));
    }

    public TVideoExample.Criteria andIdIsNull() {
      addCriterion("id is null");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andIdIsNotNull() {
      addCriterion("id is not null");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andIdEqualTo(Integer value) {
      addCriterion("id =", value, "id");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andIdNotEqualTo(Integer value) {
      addCriterion("id <>", value, "id");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andIdGreaterThan(Integer value) {
      addCriterion("id >", value, "id");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("id >=", value, "id");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andIdLessThan(Integer value) {
      addCriterion("id <", value, "id");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andIdLessThanOrEqualTo(Integer value) {
      addCriterion("id <=", value, "id");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andIdIn(List<Integer> values) {
      addCriterion("id in", values, "id");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andIdNotIn(List<Integer> values) {
      addCriterion("id not in", values, "id");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andIdBetween(Integer value1, Integer value2) {
      addCriterion("id between", value1, value2, "id");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
      addCriterion("id not between", value1, value2, "id");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andUrlIsNull() {
      addCriterion("url is null");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andUrlIsNotNull() {
      addCriterion("url is not null");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andUrlEqualTo(String value) {
      addCriterion("url =", value, "url");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andUrlNotEqualTo(String value) {
      addCriterion("url <>", value, "url");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andUrlGreaterThan(String value) {
      addCriterion("url >", value, "url");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andUrlGreaterThanOrEqualTo(String value) {
      addCriterion("url >=", value, "url");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andUrlLessThan(String value) {
      addCriterion("url <", value, "url");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andUrlLessThanOrEqualTo(String value) {
      addCriterion("url <=", value, "url");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andUrlLike(String value) {
      addCriterion("url like", value, "url");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andUrlNotLike(String value) {
      addCriterion("url not like", value, "url");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andUrlIn(List<String> values) {
      addCriterion("url in", values, "url");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andUrlNotIn(List<String> values) {
      addCriterion("url not in", values, "url");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andUrlBetween(String value1, String value2) {
      addCriterion("url between", value1, value2, "url");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andUrlNotBetween(String value1, String value2) {
      addCriterion("url not between", value1, value2, "url");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andTitleIsNull() {
      addCriterion("title is null");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andTitleIsNotNull() {
      addCriterion("title is not null");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andTitleEqualTo(String value) {
      addCriterion("title =", value, "title");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andTitleNotEqualTo(String value) {
      addCriterion("title <>", value, "title");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andTitleGreaterThan(String value) {
      addCriterion("title >", value, "title");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andTitleGreaterThanOrEqualTo(String value) {
      addCriterion("title >=", value, "title");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andTitleLessThan(String value) {
      addCriterion("title <", value, "title");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andTitleLessThanOrEqualTo(String value) {
      addCriterion("title <=", value, "title");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andTitleLike(String value) {
      addCriterion("title like", value, "title");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andTitleNotLike(String value) {
      addCriterion("title not like", value, "title");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andTitleIn(List<String> values) {
      addCriterion("title in", values, "title");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andTitleNotIn(List<String> values) {
      addCriterion("title not in", values, "title");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andTitleBetween(String value1, String value2) {
      addCriterion("title between", value1, value2, "title");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andTitleNotBetween(String value1, String value2) {
      addCriterion("title not between", value1, value2, "title");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andCreatDateIsNull() {
      addCriterion("creat_date is null");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andCreatDateIsNotNull() {
      addCriterion("creat_date is not null");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andCreatDateEqualTo(Date value) {
      addCriterion("creat_date =", value, "creatDate");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andCreatDateNotEqualTo(Date value) {
      addCriterion("creat_date <>", value, "creatDate");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andCreatDateGreaterThan(Date value) {
      addCriterion("creat_date >", value, "creatDate");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andCreatDateGreaterThanOrEqualTo(Date value) {
      addCriterion("creat_date >=", value, "creatDate");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andCreatDateLessThan(Date value) {
      addCriterion("creat_date <", value, "creatDate");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andCreatDateLessThanOrEqualTo(Date value) {
      addCriterion("creat_date <=", value, "creatDate");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andCreatDateIn(List<Date> values) {
      addCriterion("creat_date in", values, "creatDate");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andCreatDateNotIn(List<Date> values) {
      addCriterion("creat_date not in", values, "creatDate");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andCreatDateBetween(Date value1, Date value2) {
      addCriterion("creat_date between", value1, value2, "creatDate");
      return (TVideoExample.Criteria)this;
    }

    public TVideoExample.Criteria andCreatDateNotBetween(Date value1, Date value2) {
      addCriterion("creat_date not between", value1, value2, "creatDate");
      return (TVideoExample.Criteria)this;
    }
  }
}