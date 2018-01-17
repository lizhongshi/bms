package com.dly.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TUserExample
{
  protected String orderByClause;
  protected boolean distinct;
  protected List<Criteria> oredCriteria;

  public TUserExample()
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

  public static class Criteria extends TUserExample.GeneratedCriteria
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
    protected List<TUserExample.Criterion> criteria;

    protected GeneratedCriteria()
    {
      this.criteria = new ArrayList();
    }

    public boolean isValid() {
      return this.criteria.size() > 0;
    }

    public List<TUserExample.Criterion> getAllCriteria() {
      return this.criteria;
    }

    public List<TUserExample.Criterion> getCriteria() {
      return this.criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      this.criteria.add(new TUserExample.Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      this.criteria.add(new TUserExample.Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if ((value1 == null) || (value2 == null)) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      this.criteria.add(new TUserExample.Criterion(condition, value1, value2));
    }

    protected void addCriterionForJDBCDate(String condition, java.util.Date value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      addCriterion(condition, new java.sql.Date(value.getTime()), property);
    }

    protected void addCriterionForJDBCDate(String condition, List<java.util.Date> values, String property) {
      if ((values == null) || (values.size() == 0)) {
        throw new RuntimeException("Value list for " + property + " cannot be null or empty");
      }
      List dateList = new ArrayList();
      Iterator iter = values.iterator();
      while (iter.hasNext()) {
        dateList.add(new java.sql.Date(((java.util.Date)iter.next()).getTime()));
      }
      addCriterion(condition, dateList, property);
    }

    protected void addCriterionForJDBCDate(String condition, java.util.Date value1, java.util.Date value2, String property) {
      if ((value1 == null) || (value2 == null)) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
    }

    public TUserExample.Criteria andUserIdIsNull() {
      addCriterion("user_id is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserIdIsNotNull() {
      addCriterion("user_id is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserIdEqualTo(Integer value) {
      addCriterion("user_id =", value, "userId");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserIdNotEqualTo(Integer value) {
      addCriterion("user_id <>", value, "userId");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserIdGreaterThan(Integer value) {
      addCriterion("user_id >", value, "userId");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("user_id >=", value, "userId");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserIdLessThan(Integer value) {
      addCriterion("user_id <", value, "userId");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserIdLessThanOrEqualTo(Integer value) {
      addCriterion("user_id <=", value, "userId");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserIdIn(List<Integer> values) {
      addCriterion("user_id in", values, "userId");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserIdNotIn(List<Integer> values) {
      addCriterion("user_id not in", values, "userId");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserIdBetween(Integer value1, Integer value2) {
      addCriterion("user_id between", value1, value2, "userId");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserIdNotBetween(Integer value1, Integer value2) {
      addCriterion("user_id not between", value1, value2, "userId");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUsernameIsNull() {
      addCriterion("username is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUsernameIsNotNull() {
      addCriterion("username is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUsernameEqualTo(String value) {
      addCriterion("username =", value, "username");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUsernameNotEqualTo(String value) {
      addCriterion("username <>", value, "username");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUsernameGreaterThan(String value) {
      addCriterion("username >", value, "username");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUsernameGreaterThanOrEqualTo(String value) {
      addCriterion("username >=", value, "username");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUsernameLessThan(String value) {
      addCriterion("username <", value, "username");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUsernameLessThanOrEqualTo(String value) {
      addCriterion("username <=", value, "username");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUsernameLike(String value) {
      addCriterion("username like", value, "username");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUsernameNotLike(String value) {
      addCriterion("username not like", value, "username");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUsernameIn(List<String> values) {
      addCriterion("username in", values, "username");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUsernameNotIn(List<String> values) {
      addCriterion("username not in", values, "username");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUsernameBetween(String value1, String value2) {
      addCriterion("username between", value1, value2, "username");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUsernameNotBetween(String value1, String value2) {
      addCriterion("username not between", value1, value2, "username");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPasswordIsNull() {
      addCriterion("password is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPasswordIsNotNull() {
      addCriterion("password is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPasswordEqualTo(String value) {
      addCriterion("password =", value, "password");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPasswordNotEqualTo(String value) {
      addCriterion("password <>", value, "password");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPasswordGreaterThan(String value) {
      addCriterion("password >", value, "password");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPasswordGreaterThanOrEqualTo(String value) {
      addCriterion("password >=", value, "password");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPasswordLessThan(String value) {
      addCriterion("password <", value, "password");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPasswordLessThanOrEqualTo(String value) {
      addCriterion("password <=", value, "password");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPasswordLike(String value) {
      addCriterion("password like", value, "password");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPasswordNotLike(String value) {
      addCriterion("password not like", value, "password");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPasswordIn(List<String> values) {
      addCriterion("password in", values, "password");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPasswordNotIn(List<String> values) {
      addCriterion("password not in", values, "password");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPasswordBetween(String value1, String value2) {
      addCriterion("password between", value1, value2, "password");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPasswordNotBetween(String value1, String value2) {
      addCriterion("password not between", value1, value2, "password");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andNicknameIsNull() {
      addCriterion("nickname is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andNicknameIsNotNull() {
      addCriterion("nickname is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andNicknameEqualTo(String value) {
      addCriterion("nickname =", value, "nickname");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andNicknameNotEqualTo(String value) {
      addCriterion("nickname <>", value, "nickname");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andNicknameGreaterThan(String value) {
      addCriterion("nickname >", value, "nickname");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andNicknameGreaterThanOrEqualTo(String value) {
      addCriterion("nickname >=", value, "nickname");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andNicknameLessThan(String value) {
      addCriterion("nickname <", value, "nickname");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andNicknameLessThanOrEqualTo(String value) {
      addCriterion("nickname <=", value, "nickname");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andNicknameLike(String value) {
      addCriterion("nickname like", value, "nickname");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andNicknameNotLike(String value) {
      addCriterion("nickname not like", value, "nickname");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andNicknameIn(List<String> values) {
      addCriterion("nickname in", values, "nickname");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andNicknameNotIn(List<String> values) {
      addCriterion("nickname not in", values, "nickname");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andNicknameBetween(String value1, String value2) {
      addCriterion("nickname between", value1, value2, "nickname");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andNicknameNotBetween(String value1, String value2) {
      addCriterion("nickname not between", value1, value2, "nickname");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSaltIsNull() {
      addCriterion("salt is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSaltIsNotNull() {
      addCriterion("salt is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSaltEqualTo(String value) {
      addCriterion("salt =", value, "salt");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSaltNotEqualTo(String value) {
      addCriterion("salt <>", value, "salt");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSaltGreaterThan(String value) {
      addCriterion("salt >", value, "salt");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSaltGreaterThanOrEqualTo(String value) {
      addCriterion("salt >=", value, "salt");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSaltLessThan(String value) {
      addCriterion("salt <", value, "salt");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSaltLessThanOrEqualTo(String value) {
      addCriterion("salt <=", value, "salt");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSaltLike(String value) {
      addCriterion("salt like", value, "salt");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSaltNotLike(String value) {
      addCriterion("salt not like", value, "salt");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSaltIn(List<String> values) {
      addCriterion("salt in", values, "salt");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSaltNotIn(List<String> values) {
      addCriterion("salt not in", values, "salt");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSaltBetween(String value1, String value2) {
      addCriterion("salt between", value1, value2, "salt");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSaltNotBetween(String value1, String value2) {
      addCriterion("salt not between", value1, value2, "salt");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTokenidIsNull() {
      addCriterion("tokenid is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTokenidIsNotNull() {
      addCriterion("tokenid is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTokenidEqualTo(String value) {
      addCriterion("tokenid =", value, "tokenid");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTokenidNotEqualTo(String value) {
      addCriterion("tokenid <>", value, "tokenid");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTokenidGreaterThan(String value) {
      addCriterion("tokenid >", value, "tokenid");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTokenidGreaterThanOrEqualTo(String value) {
      addCriterion("tokenid >=", value, "tokenid");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTokenidLessThan(String value) {
      addCriterion("tokenid <", value, "tokenid");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTokenidLessThanOrEqualTo(String value) {
      addCriterion("tokenid <=", value, "tokenid");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTokenidLike(String value) {
      addCriterion("tokenid like", value, "tokenid");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTokenidNotLike(String value) {
      addCriterion("tokenid not like", value, "tokenid");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTokenidIn(List<String> values) {
      addCriterion("tokenid in", values, "tokenid");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTokenidNotIn(List<String> values) {
      addCriterion("tokenid not in", values, "tokenid");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTokenidBetween(String value1, String value2) {
      addCriterion("tokenid between", value1, value2, "tokenid");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTokenidNotBetween(String value1, String value2) {
      addCriterion("tokenid not between", value1, value2, "tokenid");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPhoneIsNull() {
      addCriterion("phone is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPhoneIsNotNull() {
      addCriterion("phone is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPhoneEqualTo(String value) {
      addCriterion("phone =", value, "phone");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPhoneNotEqualTo(String value) {
      addCriterion("phone <>", value, "phone");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPhoneGreaterThan(String value) {
      addCriterion("phone >", value, "phone");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPhoneGreaterThanOrEqualTo(String value) {
      addCriterion("phone >=", value, "phone");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPhoneLessThan(String value) {
      addCriterion("phone <", value, "phone");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPhoneLessThanOrEqualTo(String value) {
      addCriterion("phone <=", value, "phone");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPhoneLike(String value) {
      addCriterion("phone like", value, "phone");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPhoneNotLike(String value) {
      addCriterion("phone not like", value, "phone");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPhoneIn(List<String> values) {
      addCriterion("phone in", values, "phone");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPhoneNotIn(List<String> values) {
      addCriterion("phone not in", values, "phone");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPhoneBetween(String value1, String value2) {
      addCriterion("phone between", value1, value2, "phone");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andPhoneNotBetween(String value1, String value2) {
      addCriterion("phone not between", value1, value2, "phone");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andWeixinIsNull() {
      addCriterion("weixin is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andWeixinIsNotNull() {
      addCriterion("weixin is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andWeixinEqualTo(String value) {
      addCriterion("weixin =", value, "weixin");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andWeixinNotEqualTo(String value) {
      addCriterion("weixin <>", value, "weixin");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andWeixinGreaterThan(String value) {
      addCriterion("weixin >", value, "weixin");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andWeixinGreaterThanOrEqualTo(String value) {
      addCriterion("weixin >=", value, "weixin");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andWeixinLessThan(String value) {
      addCriterion("weixin <", value, "weixin");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andWeixinLessThanOrEqualTo(String value) {
      addCriterion("weixin <=", value, "weixin");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andWeixinLike(String value) {
      addCriterion("weixin like", value, "weixin");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andWeixinNotLike(String value) {
      addCriterion("weixin not like", value, "weixin");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andWeixinIn(List<String> values) {
      addCriterion("weixin in", values, "weixin");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andWeixinNotIn(List<String> values) {
      addCriterion("weixin not in", values, "weixin");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andWeixinBetween(String value1, String value2) {
      addCriterion("weixin between", value1, value2, "weixin");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andWeixinNotBetween(String value1, String value2) {
      addCriterion("weixin not between", value1, value2, "weixin");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andQqIsNull() {
      addCriterion("qq is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andQqIsNotNull() {
      addCriterion("qq is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andQqEqualTo(String value) {
      addCriterion("qq =", value, "qq");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andQqNotEqualTo(String value) {
      addCriterion("qq <>", value, "qq");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andQqGreaterThan(String value) {
      addCriterion("qq >", value, "qq");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andQqGreaterThanOrEqualTo(String value) {
      addCriterion("qq >=", value, "qq");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andQqLessThan(String value) {
      addCriterion("qq <", value, "qq");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andQqLessThanOrEqualTo(String value) {
      addCriterion("qq <=", value, "qq");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andQqLike(String value) {
      addCriterion("qq like", value, "qq");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andQqNotLike(String value) {
      addCriterion("qq not like", value, "qq");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andQqIn(List<String> values) {
      addCriterion("qq in", values, "qq");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andQqNotIn(List<String> values) {
      addCriterion("qq not in", values, "qq");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andQqBetween(String value1, String value2) {
      addCriterion("qq between", value1, value2, "qq");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andQqNotBetween(String value1, String value2) {
      addCriterion("qq not between", value1, value2, "qq");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andStrutsIsNull() {
      addCriterion("struts is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andStrutsIsNotNull() {
      addCriterion("struts is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andStrutsEqualTo(String value) {
      addCriterion("struts =", value, "struts");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andStrutsNotEqualTo(String value) {
      addCriterion("struts <>", value, "struts");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andStrutsGreaterThan(String value) {
      addCriterion("struts >", value, "struts");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andStrutsGreaterThanOrEqualTo(String value) {
      addCriterion("struts >=", value, "struts");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andStrutsLessThan(String value) {
      addCriterion("struts <", value, "struts");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andStrutsLessThanOrEqualTo(String value) {
      addCriterion("struts <=", value, "struts");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andStrutsLike(String value) {
      addCriterion("struts like", value, "struts");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andStrutsNotLike(String value) {
      addCriterion("struts not like", value, "struts");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andStrutsIn(List<String> values) {
      addCriterion("struts in", values, "struts");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andStrutsNotIn(List<String> values) {
      addCriterion("struts not in", values, "struts");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andStrutsBetween(String value1, String value2) {
      addCriterion("struts between", value1, value2, "struts");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andStrutsNotBetween(String value1, String value2) {
      addCriterion("struts not between", value1, value2, "struts");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andEmailIsNull() {
      addCriterion("email is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andEmailIsNotNull() {
      addCriterion("email is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andEmailEqualTo(String value) {
      addCriterion("email =", value, "email");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andEmailNotEqualTo(String value) {
      addCriterion("email <>", value, "email");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andEmailGreaterThan(String value) {
      addCriterion("email >", value, "email");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andEmailGreaterThanOrEqualTo(String value) {
      addCriterion("email >=", value, "email");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andEmailLessThan(String value) {
      addCriterion("email <", value, "email");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andEmailLessThanOrEqualTo(String value) {
      addCriterion("email <=", value, "email");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andEmailLike(String value) {
      addCriterion("email like", value, "email");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andEmailNotLike(String value) {
      addCriterion("email not like", value, "email");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andEmailIn(List<String> values) {
      addCriterion("email in", values, "email");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andEmailNotIn(List<String> values) {
      addCriterion("email not in", values, "email");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andEmailBetween(String value1, String value2) {
      addCriterion("email between", value1, value2, "email");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andEmailNotBetween(String value1, String value2) {
      addCriterion("email not between", value1, value2, "email");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIconUrlIsNull() {
      addCriterion("icon_url is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIconUrlIsNotNull() {
      addCriterion("icon_url is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIconUrlEqualTo(String value) {
      addCriterion("icon_url =", value, "iconUrl");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIconUrlNotEqualTo(String value) {
      addCriterion("icon_url <>", value, "iconUrl");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIconUrlGreaterThan(String value) {
      addCriterion("icon_url >", value, "iconUrl");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIconUrlGreaterThanOrEqualTo(String value) {
      addCriterion("icon_url >=", value, "iconUrl");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIconUrlLessThan(String value) {
      addCriterion("icon_url <", value, "iconUrl");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIconUrlLessThanOrEqualTo(String value) {
      addCriterion("icon_url <=", value, "iconUrl");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIconUrlLike(String value) {
      addCriterion("icon_url like", value, "iconUrl");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIconUrlNotLike(String value) {
      addCriterion("icon_url not like", value, "iconUrl");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIconUrlIn(List<String> values) {
      addCriterion("icon_url in", values, "iconUrl");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIconUrlNotIn(List<String> values) {
      addCriterion("icon_url not in", values, "iconUrl");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIconUrlBetween(String value1, String value2) {
      addCriterion("icon_url between", value1, value2, "iconUrl");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIconUrlNotBetween(String value1, String value2) {
      addCriterion("icon_url not between", value1, value2, "iconUrl");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andCreationTimeIsNull() {
      addCriterion("creation_time is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andCreationTimeIsNotNull() {
      addCriterion("creation_time is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andCreationTimeEqualTo(java.util.Date value) {
      addCriterion("creation_time =", value, "creationTime");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andCreationTimeNotEqualTo(java.util.Date value) {
      addCriterion("creation_time <>", value, "creationTime");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andCreationTimeGreaterThan(java.util.Date value) {
      addCriterion("creation_time >", value, "creationTime");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andCreationTimeGreaterThanOrEqualTo(java.util.Date value) {
      addCriterion("creation_time >=", value, "creationTime");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andCreationTimeLessThan(java.util.Date value) {
      addCriterion("creation_time <", value, "creationTime");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andCreationTimeLessThanOrEqualTo(java.util.Date value) {
      addCriterion("creation_time <=", value, "creationTime");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andCreationTimeIn(List<java.util.Date> values) {
      addCriterion("creation_time in", values, "creationTime");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andCreationTimeNotIn(List<java.util.Date> values) {
      addCriterion("creation_time not in", values, "creationTime");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andCreationTimeBetween(java.util.Date value1, java.util.Date value2) {
      addCriterion("creation_time between", value1, value2, "creationTime");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andCreationTimeNotBetween(java.util.Date value1, java.util.Date value2) {
      addCriterion("creation_time not between", value1, value2, "creationTime");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andBirthDateIsNull() {
      addCriterion("birth_date is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andBirthDateIsNotNull() {
      addCriterion("birth_date is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andBirthDateEqualTo(java.util.Date value) {
      addCriterionForJDBCDate("birth_date =", value, "birthDate");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andBirthDateNotEqualTo(java.util.Date value) {
      addCriterionForJDBCDate("birth_date <>", value, "birthDate");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andBirthDateGreaterThan(java.util.Date value) {
      addCriterionForJDBCDate("birth_date >", value, "birthDate");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andBirthDateGreaterThanOrEqualTo(java.util.Date value) {
      addCriterionForJDBCDate("birth_date >=", value, "birthDate");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andBirthDateLessThan(java.util.Date value) {
      addCriterionForJDBCDate("birth_date <", value, "birthDate");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andBirthDateLessThanOrEqualTo(java.util.Date value) {
      addCriterionForJDBCDate("birth_date <=", value, "birthDate");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andBirthDateIn(List<java.util.Date> values) {
      addCriterionForJDBCDate("birth_date in", values, "birthDate");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andBirthDateNotIn(List<java.util.Date> values) {
      addCriterionForJDBCDate("birth_date not in", values, "birthDate");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andBirthDateBetween(java.util.Date value1, java.util.Date value2) {
      addCriterionForJDBCDate("birth_date between", value1, value2, "birthDate");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andBirthDateNotBetween(java.util.Date value1, java.util.Date value2) {
      addCriterionForJDBCDate("birth_date not between", value1, value2, "birthDate");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSexIsNull() {
      addCriterion("sex is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSexIsNotNull() {
      addCriterion("sex is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSexEqualTo(String value) {
      addCriterion("sex =", value, "sex");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSexNotEqualTo(String value) {
      addCriterion("sex <>", value, "sex");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSexGreaterThan(String value) {
      addCriterion("sex >", value, "sex");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSexGreaterThanOrEqualTo(String value) {
      addCriterion("sex >=", value, "sex");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSexLessThan(String value) {
      addCriterion("sex <", value, "sex");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSexLessThanOrEqualTo(String value) {
      addCriterion("sex <=", value, "sex");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSexLike(String value) {
      addCriterion("sex like", value, "sex");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSexNotLike(String value) {
      addCriterion("sex not like", value, "sex");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSexIn(List<String> values) {
      addCriterion("sex in", values, "sex");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSexNotIn(List<String> values) {
      addCriterion("sex not in", values, "sex");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSexBetween(String value1, String value2) {
      addCriterion("sex between", value1, value2, "sex");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andSexNotBetween(String value1, String value2) {
      addCriterion("sex not between", value1, value2, "sex");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIdIsNull() {
      addCriterion("id is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIdIsNotNull() {
      addCriterion("id is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIdEqualTo(Integer value) {
      addCriterion("id =", value, "id");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIdNotEqualTo(Integer value) {
      addCriterion("id <>", value, "id");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIdGreaterThan(Integer value) {
      addCriterion("id >", value, "id");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("id >=", value, "id");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIdLessThan(Integer value) {
      addCriterion("id <", value, "id");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIdLessThanOrEqualTo(Integer value) {
      addCriterion("id <=", value, "id");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIdIn(List<Integer> values) {
      addCriterion("id in", values, "id");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIdNotIn(List<Integer> values) {
      addCriterion("id not in", values, "id");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIdBetween(Integer value1, Integer value2) {
      addCriterion("id between", value1, value2, "id");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
      addCriterion("id not between", value1, value2, "id");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andRemarksIsNull() {
      addCriterion("remarks is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andRemarksIsNotNull() {
      addCriterion("remarks is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andRemarksEqualTo(String value) {
      addCriterion("remarks =", value, "remarks");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andRemarksNotEqualTo(String value) {
      addCriterion("remarks <>", value, "remarks");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andRemarksGreaterThan(String value) {
      addCriterion("remarks >", value, "remarks");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andRemarksGreaterThanOrEqualTo(String value) {
      addCriterion("remarks >=", value, "remarks");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andRemarksLessThan(String value) {
      addCriterion("remarks <", value, "remarks");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andRemarksLessThanOrEqualTo(String value) {
      addCriterion("remarks <=", value, "remarks");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andRemarksLike(String value) {
      addCriterion("remarks like", value, "remarks");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andRemarksNotLike(String value) {
      addCriterion("remarks not like", value, "remarks");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andRemarksIn(List<String> values) {
      addCriterion("remarks in", values, "remarks");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andRemarksNotIn(List<String> values) {
      addCriterion("remarks not in", values, "remarks");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andRemarksBetween(String value1, String value2) {
      addCriterion("remarks between", value1, value2, "remarks");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andRemarksNotBetween(String value1, String value2) {
      addCriterion("remarks not between", value1, value2, "remarks");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTrueNameIsNull() {
      addCriterion("true_name is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTrueNameIsNotNull() {
      addCriterion("true_name is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTrueNameEqualTo(String value) {
      addCriterion("true_name =", value, "trueName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTrueNameNotEqualTo(String value) {
      addCriterion("true_name <>", value, "trueName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTrueNameGreaterThan(String value) {
      addCriterion("true_name >", value, "trueName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTrueNameGreaterThanOrEqualTo(String value) {
      addCriterion("true_name >=", value, "trueName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTrueNameLessThan(String value) {
      addCriterion("true_name <", value, "trueName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTrueNameLessThanOrEqualTo(String value) {
      addCriterion("true_name <=", value, "trueName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTrueNameLike(String value) {
      addCriterion("true_name like", value, "trueName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTrueNameNotLike(String value) {
      addCriterion("true_name not like", value, "trueName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTrueNameIn(List<String> values) {
      addCriterion("true_name in", values, "trueName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTrueNameNotIn(List<String> values) {
      addCriterion("true_name not in", values, "trueName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTrueNameBetween(String value1, String value2) {
      addCriterion("true_name between", value1, value2, "trueName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andTrueNameNotBetween(String value1, String value2) {
      addCriterion("true_name not between", value1, value2, "trueName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserNameIsNull() {
      addCriterion("user_name is null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserNameIsNotNull() {
      addCriterion("user_name is not null");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserNameEqualTo(String value) {
      addCriterion("user_name =", value, "userName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserNameNotEqualTo(String value) {
      addCriterion("user_name <>", value, "userName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserNameGreaterThan(String value) {
      addCriterion("user_name >", value, "userName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserNameGreaterThanOrEqualTo(String value) {
      addCriterion("user_name >=", value, "userName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserNameLessThan(String value) {
      addCriterion("user_name <", value, "userName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserNameLessThanOrEqualTo(String value) {
      addCriterion("user_name <=", value, "userName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserNameLike(String value) {
      addCriterion("user_name like", value, "userName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserNameNotLike(String value) {
      addCriterion("user_name not like", value, "userName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserNameIn(List<String> values) {
      addCriterion("user_name in", values, "userName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserNameNotIn(List<String> values) {
      addCriterion("user_name not in", values, "userName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserNameBetween(String value1, String value2) {
      addCriterion("user_name between", value1, value2, "userName");
      return (TUserExample.Criteria)this;
    }

    public TUserExample.Criteria andUserNameNotBetween(String value1, String value2) {
      addCriterion("user_name not between", value1, value2, "userName");
      return (TUserExample.Criteria)this;
    }
  }
}