package com.dly.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TImageExample
{
  protected String orderByClause;
  protected boolean distinct;
  protected List<Criteria> oredCriteria;

  public TImageExample()
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

  public static class Criteria extends TImageExample.GeneratedCriteria
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
    protected List<TImageExample.Criterion> criteria;

    protected GeneratedCriteria()
    {
      this.criteria = new ArrayList();
    }

    public boolean isValid() {
      return this.criteria.size() > 0;
    }

    public List<TImageExample.Criterion> getAllCriteria() {
      return this.criteria;
    }

    public List<TImageExample.Criterion> getCriteria() {
      return this.criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      this.criteria.add(new TImageExample.Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      this.criteria.add(new TImageExample.Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if ((value1 == null) || (value2 == null)) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      this.criteria.add(new TImageExample.Criterion(condition, value1, value2));
    }

    public TImageExample.Criteria andIdIsNull() {
      addCriterion("id is null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andIdIsNotNull() {
      addCriterion("id is not null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andIdEqualTo(Integer value) {
      addCriterion("id =", value, "id");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andIdNotEqualTo(Integer value) {
      addCriterion("id <>", value, "id");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andIdGreaterThan(Integer value) {
      addCriterion("id >", value, "id");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("id >=", value, "id");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andIdLessThan(Integer value) {
      addCriterion("id <", value, "id");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andIdLessThanOrEqualTo(Integer value) {
      addCriterion("id <=", value, "id");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andIdIn(List<Integer> values) {
      addCriterion("id in", values, "id");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andIdNotIn(List<Integer> values) {
      addCriterion("id not in", values, "id");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andIdBetween(Integer value1, Integer value2) {
      addCriterion("id between", value1, value2, "id");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
      addCriterion("id not between", value1, value2, "id");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageUrlIsNull() {
      addCriterion("image_url is null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageUrlIsNotNull() {
      addCriterion("image_url is not null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageUrlEqualTo(String value) {
      addCriterion("image_url =", value, "imageUrl");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageUrlNotEqualTo(String value) {
      addCriterion("image_url <>", value, "imageUrl");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageUrlGreaterThan(String value) {
      addCriterion("image_url >", value, "imageUrl");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageUrlGreaterThanOrEqualTo(String value) {
      addCriterion("image_url >=", value, "imageUrl");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageUrlLessThan(String value) {
      addCriterion("image_url <", value, "imageUrl");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageUrlLessThanOrEqualTo(String value) {
      addCriterion("image_url <=", value, "imageUrl");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageUrlLike(String value) {
      addCriterion("image_url like", value, "imageUrl");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageUrlNotLike(String value) {
      addCriterion("image_url not like", value, "imageUrl");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageUrlIn(List<String> values) {
      addCriterion("image_url in", values, "imageUrl");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageUrlNotIn(List<String> values) {
      addCriterion("image_url not in", values, "imageUrl");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageUrlBetween(String value1, String value2) {
      addCriterion("image_url between", value1, value2, "imageUrl");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageUrlNotBetween(String value1, String value2) {
      addCriterion("image_url not between", value1, value2, "imageUrl");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageNameIsNull() {
      addCriterion("image_name is null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageNameIsNotNull() {
      addCriterion("image_name is not null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageNameEqualTo(String value) {
      addCriterion("image_name =", value, "imageName");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageNameNotEqualTo(String value) {
      addCriterion("image_name <>", value, "imageName");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageNameGreaterThan(String value) {
      addCriterion("image_name >", value, "imageName");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageNameGreaterThanOrEqualTo(String value) {
      addCriterion("image_name >=", value, "imageName");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageNameLessThan(String value) {
      addCriterion("image_name <", value, "imageName");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageNameLessThanOrEqualTo(String value) {
      addCriterion("image_name <=", value, "imageName");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageNameLike(String value) {
      addCriterion("image_name like", value, "imageName");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageNameNotLike(String value) {
      addCriterion("image_name not like", value, "imageName");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageNameIn(List<String> values) {
      addCriterion("image_name in", values, "imageName");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageNameNotIn(List<String> values) {
      addCriterion("image_name not in", values, "imageName");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageNameBetween(String value1, String value2) {
      addCriterion("image_name between", value1, value2, "imageName");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andImageNameNotBetween(String value1, String value2) {
      addCriterion("image_name not between", value1, value2, "imageName");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andWidthIsNull() {
      addCriterion("width is null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andWidthIsNotNull() {
      addCriterion("width is not null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andWidthEqualTo(String value) {
      addCriterion("width =", value, "width");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andWidthNotEqualTo(String value) {
      addCriterion("width <>", value, "width");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andWidthGreaterThan(String value) {
      addCriterion("width >", value, "width");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andWidthGreaterThanOrEqualTo(String value) {
      addCriterion("width >=", value, "width");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andWidthLessThan(String value) {
      addCriterion("width <", value, "width");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andWidthLessThanOrEqualTo(String value) {
      addCriterion("width <=", value, "width");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andWidthLike(String value) {
      addCriterion("width like", value, "width");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andWidthNotLike(String value) {
      addCriterion("width not like", value, "width");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andWidthIn(List<String> values) {
      addCriterion("width in", values, "width");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andWidthNotIn(List<String> values) {
      addCriterion("width not in", values, "width");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andWidthBetween(String value1, String value2) {
      addCriterion("width between", value1, value2, "width");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andWidthNotBetween(String value1, String value2) {
      addCriterion("width not between", value1, value2, "width");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andHeightIsNull() {
      addCriterion("height is null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andHeightIsNotNull() {
      addCriterion("height is not null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andHeightEqualTo(String value) {
      addCriterion("height =", value, "height");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andHeightNotEqualTo(String value) {
      addCriterion("height <>", value, "height");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andHeightGreaterThan(String value) {
      addCriterion("height >", value, "height");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andHeightGreaterThanOrEqualTo(String value) {
      addCriterion("height >=", value, "height");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andHeightLessThan(String value) {
      addCriterion("height <", value, "height");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andHeightLessThanOrEqualTo(String value) {
      addCriterion("height <=", value, "height");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andHeightLike(String value) {
      addCriterion("height like", value, "height");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andHeightNotLike(String value) {
      addCriterion("height not like", value, "height");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andHeightIn(List<String> values) {
      addCriterion("height in", values, "height");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andHeightNotIn(List<String> values) {
      addCriterion("height not in", values, "height");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andHeightBetween(String value1, String value2) {
      addCriterion("height between", value1, value2, "height");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andHeightNotBetween(String value1, String value2) {
      addCriterion("height not between", value1, value2, "height");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTypeIsNull() {
      addCriterion("type is null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTypeIsNotNull() {
      addCriterion("type is not null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTypeEqualTo(String value) {
      addCriterion("type =", value, "type");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTypeNotEqualTo(String value) {
      addCriterion("type <>", value, "type");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTypeGreaterThan(String value) {
      addCriterion("type >", value, "type");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTypeGreaterThanOrEqualTo(String value) {
      addCriterion("type >=", value, "type");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTypeLessThan(String value) {
      addCriterion("type <", value, "type");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTypeLessThanOrEqualTo(String value) {
      addCriterion("type <=", value, "type");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTypeLike(String value) {
      addCriterion("type like", value, "type");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTypeNotLike(String value) {
      addCriterion("type not like", value, "type");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTypeIn(List<String> values) {
      addCriterion("type in", values, "type");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTypeNotIn(List<String> values) {
      addCriterion("type not in", values, "type");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTypeBetween(String value1, String value2) {
      addCriterion("type between", value1, value2, "type");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTypeNotBetween(String value1, String value2) {
      addCriterion("type not between", value1, value2, "type");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupIsNull() {
      addCriterion("group is null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupIsNotNull() {
      addCriterion("group is not null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupEqualTo(String value) {
      addCriterion("group =", value, "group");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupNotEqualTo(String value) {
      addCriterion("group <>", value, "group");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupGreaterThan(String value) {
      addCriterion("group >", value, "group");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupGreaterThanOrEqualTo(String value) {
      addCriterion("group >=", value, "group");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupLessThan(String value) {
      addCriterion("group <", value, "group");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupLessThanOrEqualTo(String value) {
      addCriterion("group <=", value, "group");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupLike(String value) {
      addCriterion("group like", value, "group");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupNotLike(String value) {
      addCriterion("group not like", value, "group");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupIn(List<String> values) {
      addCriterion("group in", values, "group");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupNotIn(List<String> values) {
      addCriterion("group not in", values, "group");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupBetween(String value1, String value2) {
      addCriterion("group between", value1, value2, "group");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupNotBetween(String value1, String value2) {
      addCriterion("group not between", value1, value2, "group");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTitleIsNull() {
      addCriterion("title is null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTitleIsNotNull() {
      addCriterion("title is not null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTitleEqualTo(String value) {
      addCriterion("title =", value, "title");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTitleNotEqualTo(String value) {
      addCriterion("title <>", value, "title");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTitleGreaterThan(String value) {
      addCriterion("title >", value, "title");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTitleGreaterThanOrEqualTo(String value) {
      addCriterion("title >=", value, "title");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTitleLessThan(String value) {
      addCriterion("title <", value, "title");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTitleLessThanOrEqualTo(String value) {
      addCriterion("title <=", value, "title");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTitleLike(String value) {
      addCriterion("title like", value, "title");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTitleNotLike(String value) {
      addCriterion("title not like", value, "title");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTitleIn(List<String> values) {
      addCriterion("title in", values, "title");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTitleNotIn(List<String> values) {
      addCriterion("title not in", values, "title");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTitleBetween(String value1, String value2) {
      addCriterion("title between", value1, value2, "title");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andTitleNotBetween(String value1, String value2) {
      addCriterion("title not between", value1, value2, "title");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupIdIsNull() {
      addCriterion("group_id is null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupIdIsNotNull() {
      addCriterion("group_id is not null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupIdEqualTo(Integer value) {
      addCriterion("group_id =", value, "groupId");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupIdNotEqualTo(Integer value) {
      addCriterion("group_id <>", value, "groupId");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupIdGreaterThan(Integer value) {
      addCriterion("group_id >", value, "groupId");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("group_id >=", value, "groupId");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupIdLessThan(Integer value) {
      addCriterion("group_id <", value, "groupId");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupIdLessThanOrEqualTo(Integer value) {
      addCriterion("group_id <=", value, "groupId");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupIdIn(List<Integer> values) {
      addCriterion("group_id in", values, "groupId");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupIdNotIn(List<Integer> values) {
      addCriterion("group_id not in", values, "groupId");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupIdBetween(Integer value1, Integer value2) {
      addCriterion("group_id between", value1, value2, "groupId");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
      addCriterion("group_id not between", value1, value2, "groupId");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andCreatDateIsNull() {
      addCriterion("creat_date is null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andCreatDateIsNotNull() {
      addCriterion("creat_date is not null");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andCreatDateEqualTo(Date value) {
      addCriterion("creat_date =", value, "creatDate");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andCreatDateNotEqualTo(Date value) {
      addCriterion("creat_date <>", value, "creatDate");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andCreatDateGreaterThan(Date value) {
      addCriterion("creat_date >", value, "creatDate");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andCreatDateGreaterThanOrEqualTo(Date value) {
      addCriterion("creat_date >=", value, "creatDate");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andCreatDateLessThan(Date value) {
      addCriterion("creat_date <", value, "creatDate");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andCreatDateLessThanOrEqualTo(Date value) {
      addCriterion("creat_date <=", value, "creatDate");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andCreatDateIn(List<Date> values) {
      addCriterion("creat_date in", values, "creatDate");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andCreatDateNotIn(List<Date> values) {
      addCriterion("creat_date not in", values, "creatDate");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andCreatDateBetween(Date value1, Date value2) {
      addCriterion("creat_date between", value1, value2, "creatDate");
      return (TImageExample.Criteria)this;
    }

    public TImageExample.Criteria andCreatDateNotBetween(Date value1, Date value2) {
      addCriterion("creat_date not between", value1, value2, "creatDate");
      return (TImageExample.Criteria)this;
    }
  }
}