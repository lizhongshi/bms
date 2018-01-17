package com.dly.entity;

import java.util.ArrayList;
import java.util.List;

public class TGroupExample
{
  protected String orderByClause;
  protected boolean distinct;
  protected List<Criteria> oredCriteria;

  public TGroupExample()
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

  public static class Criteria extends TGroupExample.GeneratedCriteria
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
    protected List<TGroupExample.Criterion> criteria;

    protected GeneratedCriteria()
    {
      this.criteria = new ArrayList();
    }

    public boolean isValid() {
      return this.criteria.size() > 0;
    }

    public List<TGroupExample.Criterion> getAllCriteria() {
      return this.criteria;
    }

    public List<TGroupExample.Criterion> getCriteria() {
      return this.criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      this.criteria.add(new TGroupExample.Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      this.criteria.add(new TGroupExample.Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if ((value1 == null) || (value2 == null)) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      this.criteria.add(new TGroupExample.Criterion(condition, value1, value2));
    }

    public TGroupExample.Criteria andIdIsNull() {
      addCriterion("id is null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIdIsNotNull() {
      addCriterion("id is not null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIdEqualTo(Integer value) {
      addCriterion("id =", value, "id");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIdNotEqualTo(Integer value) {
      addCriterion("id <>", value, "id");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIdGreaterThan(Integer value) {
      addCriterion("id >", value, "id");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("id >=", value, "id");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIdLessThan(Integer value) {
      addCriterion("id <", value, "id");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIdLessThanOrEqualTo(Integer value) {
      addCriterion("id <=", value, "id");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIdIn(List<Integer> values) {
      addCriterion("id in", values, "id");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIdNotIn(List<Integer> values) {
      addCriterion("id not in", values, "id");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIdBetween(Integer value1, Integer value2) {
      addCriterion("id between", value1, value2, "id");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
      addCriterion("id not between", value1, value2, "id");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTitleIsNull() {
      addCriterion("title is null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTitleIsNotNull() {
      addCriterion("title is not null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTitleEqualTo(String value) {
      addCriterion("title =", value, "title");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTitleNotEqualTo(String value) {
      addCriterion("title <>", value, "title");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTitleGreaterThan(String value) {
      addCriterion("title >", value, "title");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTitleGreaterThanOrEqualTo(String value) {
      addCriterion("title >=", value, "title");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTitleLessThan(String value) {
      addCriterion("title <", value, "title");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTitleLessThanOrEqualTo(String value) {
      addCriterion("title <=", value, "title");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTitleLike(String value) {
      addCriterion("title like", value, "title");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTitleNotLike(String value) {
      addCriterion("title not like", value, "title");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTitleIn(List<String> values) {
      addCriterion("title in", values, "title");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTitleNotIn(List<String> values) {
      addCriterion("title not in", values, "title");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTitleBetween(String value1, String value2) {
      addCriterion("title between", value1, value2, "title");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTitleNotBetween(String value1, String value2) {
      addCriterion("title not between", value1, value2, "title");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTextIsNull() {
      addCriterion("text is null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTextIsNotNull() {
      addCriterion("text is not null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTextEqualTo(String value) {
      addCriterion("text =", value, "text");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTextNotEqualTo(String value) {
      addCriterion("text <>", value, "text");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTextGreaterThan(String value) {
      addCriterion("text >", value, "text");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTextGreaterThanOrEqualTo(String value) {
      addCriterion("text >=", value, "text");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTextLessThan(String value) {
      addCriterion("text <", value, "text");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTextLessThanOrEqualTo(String value) {
      addCriterion("text <=", value, "text");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTextLike(String value) {
      addCriterion("text like", value, "text");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTextNotLike(String value) {
      addCriterion("text not like", value, "text");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTextIn(List<String> values) {
      addCriterion("text in", values, "text");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTextNotIn(List<String> values) {
      addCriterion("text not in", values, "text");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTextBetween(String value1, String value2) {
      addCriterion("text between", value1, value2, "text");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andTextNotBetween(String value1, String value2) {
      addCriterion("text not between", value1, value2, "text");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andMoudleIdIsNull() {
      addCriterion("moudle_id is null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andMoudleIdIsNotNull() {
      addCriterion("moudle_id is not null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andMoudleIdEqualTo(Integer value) {
      addCriterion("moudle_id =", value, "moudleId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andMoudleIdNotEqualTo(Integer value) {
      addCriterion("moudle_id <>", value, "moudleId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andMoudleIdGreaterThan(Integer value) {
      addCriterion("moudle_id >", value, "moudleId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andMoudleIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("moudle_id >=", value, "moudleId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andMoudleIdLessThan(Integer value) {
      addCriterion("moudle_id <", value, "moudleId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andMoudleIdLessThanOrEqualTo(Integer value) {
      addCriterion("moudle_id <=", value, "moudleId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andMoudleIdIn(List<Integer> values) {
      addCriterion("moudle_id in", values, "moudleId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andMoudleIdNotIn(List<Integer> values) {
      addCriterion("moudle_id not in", values, "moudleId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andMoudleIdBetween(Integer value1, Integer value2) {
      addCriterion("moudle_id between", value1, value2, "moudleId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andMoudleIdNotBetween(Integer value1, Integer value2) {
      addCriterion("moudle_id not between", value1, value2, "moudleId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andImageIdIsNull() {
      addCriterion("image_id is null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andImageIdIsNotNull() {
      addCriterion("image_id is not null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andImageIdEqualTo(Integer value) {
      addCriterion("image_id =", value, "imageId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andImageIdNotEqualTo(Integer value) {
      addCriterion("image_id <>", value, "imageId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andImageIdGreaterThan(Integer value) {
      addCriterion("image_id >", value, "imageId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andImageIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("image_id >=", value, "imageId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andImageIdLessThan(Integer value) {
      addCriterion("image_id <", value, "imageId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andImageIdLessThanOrEqualTo(Integer value) {
      addCriterion("image_id <=", value, "imageId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andImageIdIn(List<Integer> values) {
      addCriterion("image_id in", values, "imageId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andImageIdNotIn(List<Integer> values) {
      addCriterion("image_id not in", values, "imageId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andImageIdBetween(Integer value1, Integer value2) {
      addCriterion("image_id between", value1, value2, "imageId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andImageIdNotBetween(Integer value1, Integer value2) {
      addCriterion("image_id not between", value1, value2, "imageId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIstpIsNull() {
      addCriterion("istp is null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIstpIsNotNull() {
      addCriterion("istp is not null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIstpEqualTo(String value) {
      addCriterion("istp =", value, "istp");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIstpNotEqualTo(String value) {
      addCriterion("istp <>", value, "istp");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIstpGreaterThan(String value) {
      addCriterion("istp >", value, "istp");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIstpGreaterThanOrEqualTo(String value) {
      addCriterion("istp >=", value, "istp");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIstpLessThan(String value) {
      addCriterion("istp <", value, "istp");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIstpLessThanOrEqualTo(String value) {
      addCriterion("istp <=", value, "istp");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIstpLike(String value) {
      addCriterion("istp like", value, "istp");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIstpNotLike(String value) {
      addCriterion("istp not like", value, "istp");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIstpIn(List<String> values) {
      addCriterion("istp in", values, "istp");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIstpNotIn(List<String> values) {
      addCriterion("istp not in", values, "istp");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIstpBetween(String value1, String value2) {
      addCriterion("istp between", value1, value2, "istp");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andIstpNotBetween(String value1, String value2) {
      addCriterion("istp not between", value1, value2, "istp");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andCountyIdIsNull() {
      addCriterion("county_id is null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andCountyIdIsNotNull() {
      addCriterion("county_id is not null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andCountyIdEqualTo(Integer value) {
      addCriterion("county_id =", value, "countyId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andCountyIdNotEqualTo(Integer value) {
      addCriterion("county_id <>", value, "countyId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andCountyIdGreaterThan(Integer value) {
      addCriterion("county_id >", value, "countyId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andCountyIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("county_id >=", value, "countyId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andCountyIdLessThan(Integer value) {
      addCriterion("county_id <", value, "countyId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andCountyIdLessThanOrEqualTo(Integer value) {
      addCriterion("county_id <=", value, "countyId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andCountyIdIn(List<Integer> values) {
      addCriterion("county_id in", values, "countyId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andCountyIdNotIn(List<Integer> values) {
      addCriterion("county_id not in", values, "countyId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andCountyIdBetween(Integer value1, Integer value2) {
      addCriterion("county_id between", value1, value2, "countyId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andCountyIdNotBetween(Integer value1, Integer value2) {
      addCriterion("county_id not between", value1, value2, "countyId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andLevelIdIsNull() {
      addCriterion("level_id is null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andLevelIdIsNotNull() {
      addCriterion("level_id is not null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andLevelIdEqualTo(Integer value) {
      addCriterion("level_id =", value, "levelId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andLevelIdNotEqualTo(Integer value) {
      addCriterion("level_id <>", value, "levelId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andLevelIdGreaterThan(Integer value) {
      addCriterion("level_id >", value, "levelId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andLevelIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("level_id >=", value, "levelId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andLevelIdLessThan(Integer value) {
      addCriterion("level_id <", value, "levelId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andLevelIdLessThanOrEqualTo(Integer value) {
      addCriterion("level_id <=", value, "levelId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andLevelIdIn(List<Integer> values) {
      addCriterion("level_id in", values, "levelId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andLevelIdNotIn(List<Integer> values) {
      addCriterion("level_id not in", values, "levelId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andLevelIdBetween(Integer value1, Integer value2) {
      addCriterion("level_id between", value1, value2, "levelId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andLevelIdNotBetween(Integer value1, Integer value2) {
      addCriterion("level_id not between", value1, value2, "levelId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andVideoIdIsNull() {
      addCriterion("video_id is null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andVideoIdIsNotNull() {
      addCriterion("video_id is not null");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andVideoIdEqualTo(Integer value) {
      addCriterion("video_id =", value, "videoId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andVideoIdNotEqualTo(Integer value) {
      addCriterion("video_id <>", value, "videoId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andVideoIdGreaterThan(Integer value) {
      addCriterion("video_id >", value, "videoId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andVideoIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("video_id >=", value, "videoId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andVideoIdLessThan(Integer value) {
      addCriterion("video_id <", value, "videoId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andVideoIdLessThanOrEqualTo(Integer value) {
      addCriterion("video_id <=", value, "videoId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andVideoIdIn(List<Integer> values) {
      addCriterion("video_id in", values, "videoId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andVideoIdNotIn(List<Integer> values) {
      addCriterion("video_id not in", values, "videoId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andVideoIdBetween(Integer value1, Integer value2) {
      addCriterion("video_id between", value1, value2, "videoId");
      return (TGroupExample.Criteria)this;
    }

    public TGroupExample.Criteria andVideoIdNotBetween(Integer value1, Integer value2) {
      addCriterion("video_id not between", value1, value2, "videoId");
      return (TGroupExample.Criteria)this;
    }
  }
}