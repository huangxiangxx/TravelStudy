package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public RoleExample() {
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

		public Criteria andRidIsNull() {
			addCriterion("rid is null");
			return (Criteria) this;
		}

		public Criteria andRidIsNotNull() {
			addCriterion("rid is not null");
			return (Criteria) this;
		}

		public Criteria andRidEqualTo(Integer value) {
			addCriterion("rid =", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidNotEqualTo(Integer value) {
			addCriterion("rid <>", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidGreaterThan(Integer value) {
			addCriterion("rid >", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidGreaterThanOrEqualTo(Integer value) {
			addCriterion("rid >=", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidLessThan(Integer value) {
			addCriterion("rid <", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidLessThanOrEqualTo(Integer value) {
			addCriterion("rid <=", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidIn(List<Integer> values) {
			addCriterion("rid in", values, "rid");
			return (Criteria) this;
		}

		public Criteria andRidNotIn(List<Integer> values) {
			addCriterion("rid not in", values, "rid");
			return (Criteria) this;
		}

		public Criteria andRidBetween(Integer value1, Integer value2) {
			addCriterion("rid between", value1, value2, "rid");
			return (Criteria) this;
		}

		public Criteria andRidNotBetween(Integer value1, Integer value2) {
			addCriterion("rid not between", value1, value2, "rid");
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

		public Criteria andDetailsIsNull() {
			addCriterion("details is null");
			return (Criteria) this;
		}

		public Criteria andDetailsIsNotNull() {
			addCriterion("details is not null");
			return (Criteria) this;
		}

		public Criteria andDetailsEqualTo(String value) {
			addCriterion("details =", value, "details");
			return (Criteria) this;
		}

		public Criteria andDetailsNotEqualTo(String value) {
			addCriterion("details <>", value, "details");
			return (Criteria) this;
		}

		public Criteria andDetailsGreaterThan(String value) {
			addCriterion("details >", value, "details");
			return (Criteria) this;
		}

		public Criteria andDetailsGreaterThanOrEqualTo(String value) {
			addCriterion("details >=", value, "details");
			return (Criteria) this;
		}

		public Criteria andDetailsLessThan(String value) {
			addCriterion("details <", value, "details");
			return (Criteria) this;
		}

		public Criteria andDetailsLessThanOrEqualTo(String value) {
			addCriterion("details <=", value, "details");
			return (Criteria) this;
		}

		public Criteria andDetailsLike(String value) {
			addCriterion("details like", value, "details");
			return (Criteria) this;
		}

		public Criteria andDetailsNotLike(String value) {
			addCriterion("details not like", value, "details");
			return (Criteria) this;
		}

		public Criteria andDetailsIn(List<String> values) {
			addCriterion("details in", values, "details");
			return (Criteria) this;
		}

		public Criteria andDetailsNotIn(List<String> values) {
			addCriterion("details not in", values, "details");
			return (Criteria) this;
		}

		public Criteria andDetailsBetween(String value1, String value2) {
			addCriterion("details between", value1, value2, "details");
			return (Criteria) this;
		}

		public Criteria andDetailsNotBetween(String value1, String value2) {
			addCriterion("details not between", value1, value2, "details");
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

	public RoleExample() {
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

		public Criteria andRidIsNull() {
			addCriterion("rid is null");
			return (Criteria) this;
		}

		public Criteria andRidIsNotNull() {
			addCriterion("rid is not null");
			return (Criteria) this;
		}

		public Criteria andRidEqualTo(Integer value) {
			addCriterion("rid =", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidNotEqualTo(Integer value) {
			addCriterion("rid <>", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidGreaterThan(Integer value) {
			addCriterion("rid >", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidGreaterThanOrEqualTo(Integer value) {
			addCriterion("rid >=", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidLessThan(Integer value) {
			addCriterion("rid <", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidLessThanOrEqualTo(Integer value) {
			addCriterion("rid <=", value, "rid");
			return (Criteria) this;
		}

		public Criteria andRidIn(List<Integer> values) {
			addCriterion("rid in", values, "rid");
			return (Criteria) this;
		}

		public Criteria andRidNotIn(List<Integer> values) {
			addCriterion("rid not in", values, "rid");
			return (Criteria) this;
		}

		public Criteria andRidBetween(Integer value1, Integer value2) {
			addCriterion("rid between", value1, value2, "rid");
			return (Criteria) this;
		}

		public Criteria andRidNotBetween(Integer value1, Integer value2) {
			addCriterion("rid not between", value1, value2, "rid");
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

    public RoleExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
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