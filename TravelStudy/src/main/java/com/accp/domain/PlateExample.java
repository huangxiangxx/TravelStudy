package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class PlateExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public PlateExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andPidIsNull() {
			addCriterion("pid is null");
			return (Criteria) this;
		}

		public Criteria andPidIsNotNull() {
			addCriterion("pid is not null");
			return (Criteria) this;
		}

		public Criteria andPidEqualTo(Integer value) {
			addCriterion("pid =", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidNotEqualTo(Integer value) {
			addCriterion("pid <>", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidGreaterThan(Integer value) {
			addCriterion("pid >", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidGreaterThanOrEqualTo(Integer value) {
			addCriterion("pid >=", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidLessThan(Integer value) {
			addCriterion("pid <", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidLessThanOrEqualTo(Integer value) {
			addCriterion("pid <=", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidIn(List<Integer> values) {
			addCriterion("pid in", values, "pid");
			return (Criteria) this;
		}

		public Criteria andPidNotIn(List<Integer> values) {
			addCriterion("pid not in", values, "pid");
			return (Criteria) this;
		}

		public Criteria andPidBetween(Integer value1, Integer value2) {
			addCriterion("pid between", value1, value2, "pid");
			return (Criteria) this;
		}

		public Criteria andPidNotBetween(Integer value1, Integer value2) {
			addCriterion("pid not between", value1, value2, "pid");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andParidIsNull() {
			addCriterion("parid is null");
			return (Criteria) this;
		}

		public Criteria andParidIsNotNull() {
			addCriterion("parid is not null");
			return (Criteria) this;
		}

		public Criteria andParidEqualTo(Integer value) {
			addCriterion("parid =", value, "parid");
			return (Criteria) this;
		}

		public Criteria andParidNotEqualTo(Integer value) {
			addCriterion("parid <>", value, "parid");
			return (Criteria) this;
		}

		public Criteria andParidGreaterThan(Integer value) {
			addCriterion("parid >", value, "parid");
			return (Criteria) this;
		}

		public Criteria andParidGreaterThanOrEqualTo(Integer value) {
			addCriterion("parid >=", value, "parid");
			return (Criteria) this;
		}

		public Criteria andParidLessThan(Integer value) {
			addCriterion("parid <", value, "parid");
			return (Criteria) this;
		}

		public Criteria andParidLessThanOrEqualTo(Integer value) {
			addCriterion("parid <=", value, "parid");
			return (Criteria) this;
		}

		public Criteria andParidIn(List<Integer> values) {
			addCriterion("parid in", values, "parid");
			return (Criteria) this;
		}

		public Criteria andParidNotIn(List<Integer> values) {
			addCriterion("parid not in", values, "parid");
			return (Criteria) this;
		}

		public Criteria andParidBetween(Integer value1, Integer value2) {
			addCriterion("parid between", value1, value2, "parid");
			return (Criteria) this;
		}

		public Criteria andParidNotBetween(Integer value1, Integer value2) {
			addCriterion("parid not between", value1, value2, "parid");
			return (Criteria) this;
		}

		public Criteria andUrlIsNull() {
			addCriterion("url is null");
			return (Criteria) this;
		}

		public Criteria andUrlIsNotNull() {
			addCriterion("url is not null");
			return (Criteria) this;
		}

		public Criteria andUrlEqualTo(String value) {
			addCriterion("url =", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotEqualTo(String value) {
			addCriterion("url <>", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlGreaterThan(String value) {
			addCriterion("url >", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlGreaterThanOrEqualTo(String value) {
			addCriterion("url >=", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLessThan(String value) {
			addCriterion("url <", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLessThanOrEqualTo(String value) {
			addCriterion("url <=", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLike(String value) {
			addCriterion("url like", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotLike(String value) {
			addCriterion("url not like", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlIn(List<String> values) {
			addCriterion("url in", values, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotIn(List<String> values) {
			addCriterion("url not in", values, "url");
			return (Criteria) this;
		}

		public Criteria andUrlBetween(String value1, String value2) {
			addCriterion("url between", value1, value2, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotBetween(String value1, String value2) {
			addCriterion("url not between", value1, value2, "url");
			return (Criteria) this;
		}

		public Criteria andEnnameIsNull() {
			addCriterion("enname is null");
			return (Criteria) this;
		}

		public Criteria andEnnameIsNotNull() {
			addCriterion("enname is not null");
			return (Criteria) this;
		}

		public Criteria andEnnameEqualTo(String value) {
			addCriterion("enname =", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameNotEqualTo(String value) {
			addCriterion("enname <>", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameGreaterThan(String value) {
			addCriterion("enname >", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameGreaterThanOrEqualTo(String value) {
			addCriterion("enname >=", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameLessThan(String value) {
			addCriterion("enname <", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameLessThanOrEqualTo(String value) {
			addCriterion("enname <=", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameLike(String value) {
			addCriterion("enname like", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameNotLike(String value) {
			addCriterion("enname not like", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameIn(List<String> values) {
			addCriterion("enname in", values, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameNotIn(List<String> values) {
			addCriterion("enname not in", values, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameBetween(String value1, String value2) {
			addCriterion("enname between", value1, value2, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameNotBetween(String value1, String value2) {
			addCriterion("enname not between", value1, value2, "enname");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {
		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
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

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public PlateExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andPidIsNull() {
			addCriterion("pid is null");
			return (Criteria) this;
		}

		public Criteria andPidIsNotNull() {
			addCriterion("pid is not null");
			return (Criteria) this;
		}

		public Criteria andPidEqualTo(Integer value) {
			addCriterion("pid =", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidNotEqualTo(Integer value) {
			addCriterion("pid <>", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidGreaterThan(Integer value) {
			addCriterion("pid >", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidGreaterThanOrEqualTo(Integer value) {
			addCriterion("pid >=", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidLessThan(Integer value) {
			addCriterion("pid <", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidLessThanOrEqualTo(Integer value) {
			addCriterion("pid <=", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidIn(List<Integer> values) {
			addCriterion("pid in", values, "pid");
			return (Criteria) this;
		}

		public Criteria andPidNotIn(List<Integer> values) {
			addCriterion("pid not in", values, "pid");
			return (Criteria) this;
		}

		public Criteria andPidBetween(Integer value1, Integer value2) {
			addCriterion("pid between", value1, value2, "pid");
			return (Criteria) this;
		}

		public Criteria andPidNotBetween(Integer value1, Integer value2) {
			addCriterion("pid not between", value1, value2, "pid");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andParentidIsNull() {
			addCriterion("parentid is null");
			return (Criteria) this;
		}

		public Criteria andParentidIsNotNull() {
			addCriterion("parentid is not null");
			return (Criteria) this;
		}

		public Criteria andParentidEqualTo(Integer value) {
			addCriterion("parentid =", value, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidNotEqualTo(Integer value) {
			addCriterion("parentid <>", value, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidGreaterThan(Integer value) {
			addCriterion("parentid >", value, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
			addCriterion("parentid >=", value, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidLessThan(Integer value) {
			addCriterion("parentid <", value, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidLessThanOrEqualTo(Integer value) {
			addCriterion("parentid <=", value, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidIn(List<Integer> values) {
			addCriterion("parentid in", values, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidNotIn(List<Integer> values) {
			addCriterion("parentid not in", values, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidBetween(Integer value1, Integer value2) {
			addCriterion("parentid between", value1, value2, "parentid");
			return (Criteria) this;
		}

		public Criteria andParentidNotBetween(Integer value1, Integer value2) {
			addCriterion("parentid not between", value1, value2, "parentid");
			return (Criteria) this;
		}

		public Criteria andUrlIsNull() {
			addCriterion("url is null");
			return (Criteria) this;
		}

		public Criteria andUrlIsNotNull() {
			addCriterion("url is not null");
			return (Criteria) this;
		}

		public Criteria andUrlEqualTo(String value) {
			addCriterion("url =", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotEqualTo(String value) {
			addCriterion("url <>", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlGreaterThan(String value) {
			addCriterion("url >", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlGreaterThanOrEqualTo(String value) {
			addCriterion("url >=", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLessThan(String value) {
			addCriterion("url <", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLessThanOrEqualTo(String value) {
			addCriterion("url <=", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLike(String value) {
			addCriterion("url like", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotLike(String value) {
			addCriterion("url not like", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlIn(List<String> values) {
			addCriterion("url in", values, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotIn(List<String> values) {
			addCriterion("url not in", values, "url");
			return (Criteria) this;
		}

		public Criteria andUrlBetween(String value1, String value2) {
			addCriterion("url between", value1, value2, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotBetween(String value1, String value2) {
			addCriterion("url not between", value1, value2, "url");
			return (Criteria) this;
		}

		public Criteria andEnameIsNull() {
			addCriterion("ename is null");
			return (Criteria) this;
		}

		public Criteria andEnameIsNotNull() {
			addCriterion("ename is not null");
			return (Criteria) this;
		}

		public Criteria andEnameEqualTo(String value) {
			addCriterion("ename =", value, "ename");
			return (Criteria) this;
		}

		public Criteria andEnameNotEqualTo(String value) {
			addCriterion("ename <>", value, "ename");
			return (Criteria) this;
		}

		public Criteria andEnameGreaterThan(String value) {
			addCriterion("ename >", value, "ename");
			return (Criteria) this;
		}

		public Criteria andEnameGreaterThanOrEqualTo(String value) {
			addCriterion("ename >=", value, "ename");
			return (Criteria) this;
		}

		public Criteria andEnameLessThan(String value) {
			addCriterion("ename <", value, "ename");
			return (Criteria) this;
		}

		public Criteria andEnameLessThanOrEqualTo(String value) {
			addCriterion("ename <=", value, "ename");
			return (Criteria) this;
		}

		public Criteria andEnameLike(String value) {
			addCriterion("ename like", value, "ename");
			return (Criteria) this;
		}

		public Criteria andEnameNotLike(String value) {
			addCriterion("ename not like", value, "ename");
			return (Criteria) this;
		}

		public Criteria andEnameIn(List<String> values) {
			addCriterion("ename in", values, "ename");
			return (Criteria) this;
		}

		public Criteria andEnameNotIn(List<String> values) {
			addCriterion("ename not in", values, "ename");
			return (Criteria) this;
		}

		public Criteria andEnameBetween(String value1, String value2) {
			addCriterion("ename between", value1, value2, "ename");
			return (Criteria) this;
		}

		public Criteria andEnameNotBetween(String value1, String value2) {
			addCriterion("ename not between", value1, value2, "ename");
			return (Criteria) this;
		}

		public Criteria andSpare1IsNull() {
			addCriterion("Spare1 is null");
			return (Criteria) this;
		}

		public Criteria andSpare1IsNotNull() {
			addCriterion("Spare1 is not null");
			return (Criteria) this;
		}

		public Criteria andSpare1EqualTo(String value) {
			addCriterion("Spare1 =", value, "spare1");
			return (Criteria) this;
		}

		public Criteria andSpare1NotEqualTo(String value) {
			addCriterion("Spare1 <>", value, "spare1");
			return (Criteria) this;
		}

		public Criteria andSpare1GreaterThan(String value) {
			addCriterion("Spare1 >", value, "spare1");
			return (Criteria) this;
		}

		public Criteria andSpare1GreaterThanOrEqualTo(String value) {
			addCriterion("Spare1 >=", value, "spare1");
			return (Criteria) this;
		}

		public Criteria andSpare1LessThan(String value) {
			addCriterion("Spare1 <", value, "spare1");
			return (Criteria) this;
		}

		public Criteria andSpare1LessThanOrEqualTo(String value) {
			addCriterion("Spare1 <=", value, "spare1");
			return (Criteria) this;
		}

		public Criteria andSpare1Like(String value) {
			addCriterion("Spare1 like", value, "spare1");
			return (Criteria) this;
		}

		public Criteria andSpare1NotLike(String value) {
			addCriterion("Spare1 not like", value, "spare1");
			return (Criteria) this;
		}

		public Criteria andSpare1In(List<String> values) {
			addCriterion("Spare1 in", values, "spare1");
			return (Criteria) this;
		}

		public Criteria andSpare1NotIn(List<String> values) {
			addCriterion("Spare1 not in", values, "spare1");
			return (Criteria) this;
		}

		public Criteria andSpare1Between(String value1, String value2) {
			addCriterion("Spare1 between", value1, value2, "spare1");
			return (Criteria) this;
		}

		public Criteria andSpare1NotBetween(String value1, String value2) {
			addCriterion("Spare1 not between", value1, value2, "spare1");
			return (Criteria) this;
		}

		public Criteria andSpare2IsNull() {
			addCriterion("Spare2 is null");
			return (Criteria) this;
		}

		public Criteria andSpare2IsNotNull() {
			addCriterion("Spare2 is not null");
			return (Criteria) this;
		}

		public Criteria andSpare2EqualTo(String value) {
			addCriterion("Spare2 =", value, "spare2");
			return (Criteria) this;
		}

		public Criteria andSpare2NotEqualTo(String value) {
			addCriterion("Spare2 <>", value, "spare2");
			return (Criteria) this;
		}

		public Criteria andSpare2GreaterThan(String value) {
			addCriterion("Spare2 >", value, "spare2");
			return (Criteria) this;
		}

		public Criteria andSpare2GreaterThanOrEqualTo(String value) {
			addCriterion("Spare2 >=", value, "spare2");
			return (Criteria) this;
		}

		public Criteria andSpare2LessThan(String value) {
			addCriterion("Spare2 <", value, "spare2");
			return (Criteria) this;
		}

		public Criteria andSpare2LessThanOrEqualTo(String value) {
			addCriterion("Spare2 <=", value, "spare2");
			return (Criteria) this;
		}

		public Criteria andSpare2Like(String value) {
			addCriterion("Spare2 like", value, "spare2");
			return (Criteria) this;
		}

		public Criteria andSpare2NotLike(String value) {
			addCriterion("Spare2 not like", value, "spare2");
			return (Criteria) this;
		}

		public Criteria andSpare2In(List<String> values) {
			addCriterion("Spare2 in", values, "spare2");
			return (Criteria) this;
		}

		public Criteria andSpare2NotIn(List<String> values) {
			addCriterion("Spare2 not in", values, "spare2");
			return (Criteria) this;
		}

		public Criteria andSpare2Between(String value1, String value2) {
			addCriterion("Spare2 between", value1, value2, "spare2");
			return (Criteria) this;
		}

		public Criteria andSpare2NotBetween(String value1, String value2) {
			addCriterion("Spare2 not between", value1, value2, "spare2");
			return (Criteria) this;
		}

		public Criteria andSpare3IsNull() {
			addCriterion("Spare3 is null");
			return (Criteria) this;
		}

		public Criteria andSpare3IsNotNull() {
			addCriterion("Spare3 is not null");
			return (Criteria) this;
		}

		public Criteria andSpare3EqualTo(String value) {
			addCriterion("Spare3 =", value, "spare3");
			return (Criteria) this;
		}

		public Criteria andSpare3NotEqualTo(String value) {
			addCriterion("Spare3 <>", value, "spare3");
			return (Criteria) this;
		}

		public Criteria andSpare3GreaterThan(String value) {
			addCriterion("Spare3 >", value, "spare3");
			return (Criteria) this;
		}

		public Criteria andSpare3GreaterThanOrEqualTo(String value) {
			addCriterion("Spare3 >=", value, "spare3");
			return (Criteria) this;
		}

		public Criteria andSpare3LessThan(String value) {
			addCriterion("Spare3 <", value, "spare3");
			return (Criteria) this;
		}

		public Criteria andSpare3LessThanOrEqualTo(String value) {
			addCriterion("Spare3 <=", value, "spare3");
			return (Criteria) this;
		}

		public Criteria andSpare3Like(String value) {
			addCriterion("Spare3 like", value, "spare3");
			return (Criteria) this;
		}

		public Criteria andSpare3NotLike(String value) {
			addCriterion("Spare3 not like", value, "spare3");
			return (Criteria) this;
		}

		public Criteria andSpare3In(List<String> values) {
			addCriterion("Spare3 in", values, "spare3");
			return (Criteria) this;
		}

		public Criteria andSpare3NotIn(List<String> values) {
			addCriterion("Spare3 not in", values, "spare3");
			return (Criteria) this;
		}

		public Criteria andSpare3Between(String value1, String value2) {
			addCriterion("Spare3 between", value1, value2, "spare3");
			return (Criteria) this;
		}

		public Criteria andSpare3NotBetween(String value1, String value2) {
			addCriterion("Spare3 not between", value1, value2, "spare3");
			return (Criteria) this;
		}

		public Criteria andSpare4IsNull() {
			addCriterion("Spare4 is null");
			return (Criteria) this;
		}

		public Criteria andSpare4IsNotNull() {
			addCriterion("Spare4 is not null");
			return (Criteria) this;
		}

		public Criteria andSpare4EqualTo(String value) {
			addCriterion("Spare4 =", value, "spare4");
			return (Criteria) this;
		}

		public Criteria andSpare4NotEqualTo(String value) {
			addCriterion("Spare4 <>", value, "spare4");
			return (Criteria) this;
		}

		public Criteria andSpare4GreaterThan(String value) {
			addCriterion("Spare4 >", value, "spare4");
			return (Criteria) this;
		}

		public Criteria andSpare4GreaterThanOrEqualTo(String value) {
			addCriterion("Spare4 >=", value, "spare4");
			return (Criteria) this;
		}

		public Criteria andSpare4LessThan(String value) {
			addCriterion("Spare4 <", value, "spare4");
			return (Criteria) this;
		}

		public Criteria andSpare4LessThanOrEqualTo(String value) {
			addCriterion("Spare4 <=", value, "spare4");
			return (Criteria) this;
		}

		public Criteria andSpare4Like(String value) {
			addCriterion("Spare4 like", value, "spare4");
			return (Criteria) this;
		}

		public Criteria andSpare4NotLike(String value) {
			addCriterion("Spare4 not like", value, "spare4");
			return (Criteria) this;
		}

		public Criteria andSpare4In(List<String> values) {
			addCriterion("Spare4 in", values, "spare4");
			return (Criteria) this;
		}

		public Criteria andSpare4NotIn(List<String> values) {
			addCriterion("Spare4 not in", values, "spare4");
			return (Criteria) this;
		}

		public Criteria andSpare4Between(String value1, String value2) {
			addCriterion("Spare4 between", value1, value2, "spare4");
			return (Criteria) this;
		}

		public Criteria andSpare4NotBetween(String value1, String value2) {
			addCriterion("Spare4 not between", value1, value2, "spare4");
			return (Criteria) this;
		}

		public Criteria andSpare5IsNull() {
			addCriterion("Spare5 is null");
			return (Criteria) this;
		}

		public Criteria andSpare5IsNotNull() {
			addCriterion("Spare5 is not null");
			return (Criteria) this;
		}

		public Criteria andSpare5EqualTo(String value) {
			addCriterion("Spare5 =", value, "spare5");
			return (Criteria) this;
		}

		public Criteria andSpare5NotEqualTo(String value) {
			addCriterion("Spare5 <>", value, "spare5");
			return (Criteria) this;
		}

		public Criteria andSpare5GreaterThan(String value) {
			addCriterion("Spare5 >", value, "spare5");
			return (Criteria) this;
		}

		public Criteria andSpare5GreaterThanOrEqualTo(String value) {
			addCriterion("Spare5 >=", value, "spare5");
			return (Criteria) this;
		}

		public Criteria andSpare5LessThan(String value) {
			addCriterion("Spare5 <", value, "spare5");
			return (Criteria) this;
		}

		public Criteria andSpare5LessThanOrEqualTo(String value) {
			addCriterion("Spare5 <=", value, "spare5");
			return (Criteria) this;
		}

		public Criteria andSpare5Like(String value) {
			addCriterion("Spare5 like", value, "spare5");
			return (Criteria) this;
		}

		public Criteria andSpare5NotLike(String value) {
			addCriterion("Spare5 not like", value, "spare5");
			return (Criteria) this;
		}

		public Criteria andSpare5In(List<String> values) {
			addCriterion("Spare5 in", values, "spare5");
			return (Criteria) this;
		}

		public Criteria andSpare5NotIn(List<String> values) {
			addCriterion("Spare5 not in", values, "spare5");
			return (Criteria) this;
		}

		public Criteria andSpare5Between(String value1, String value2) {
			addCriterion("Spare5 between", value1, value2, "spare5");
			return (Criteria) this;
		}

		public Criteria andSpare5NotBetween(String value1, String value2) {
			addCriterion("Spare5 not between", value1, value2, "spare5");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {
		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
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

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andParidIsNull() {
            addCriterion("parid is null");
            return (Criteria) this;
        }

        public Criteria andParidIsNotNull() {
            addCriterion("parid is not null");
            return (Criteria) this;
        }

        public Criteria andParidEqualTo(Integer value) {
            addCriterion("parid =", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotEqualTo(Integer value) {
            addCriterion("parid <>", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidGreaterThan(Integer value) {
            addCriterion("parid >", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parid >=", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidLessThan(Integer value) {
            addCriterion("parid <", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidLessThanOrEqualTo(Integer value) {
            addCriterion("parid <=", value, "parid");
            return (Criteria) this;
        }

        public Criteria andParidIn(List<Integer> values) {
            addCriterion("parid in", values, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotIn(List<Integer> values) {
            addCriterion("parid not in", values, "parid");
            return (Criteria) this;
        }

        public Criteria andParidBetween(Integer value1, Integer value2) {
            addCriterion("parid between", value1, value2, "parid");
            return (Criteria) this;
        }

        public Criteria andParidNotBetween(Integer value1, Integer value2) {
            addCriterion("parid not between", value1, value2, "parid");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andEnnameIsNull() {
            addCriterion("enname is null");
            return (Criteria) this;
        }

        public Criteria andEnnameIsNotNull() {
            addCriterion("enname is not null");
            return (Criteria) this;
        }

        public Criteria andEnnameEqualTo(String value) {
            addCriterion("enname =", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotEqualTo(String value) {
            addCriterion("enname <>", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameGreaterThan(String value) {
            addCriterion("enname >", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameGreaterThanOrEqualTo(String value) {
            addCriterion("enname >=", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameLessThan(String value) {
            addCriterion("enname <", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameLessThanOrEqualTo(String value) {
            addCriterion("enname <=", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameLike(String value) {
            addCriterion("enname like", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotLike(String value) {
            addCriterion("enname not like", value, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameIn(List<String> values) {
            addCriterion("enname in", values, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotIn(List<String> values) {
            addCriterion("enname not in", values, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameBetween(String value1, String value2) {
            addCriterion("enname between", value1, value2, "enname");
            return (Criteria) this;
        }

        public Criteria andEnnameNotBetween(String value1, String value2) {
            addCriterion("enname not between", value1, value2, "enname");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
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
}