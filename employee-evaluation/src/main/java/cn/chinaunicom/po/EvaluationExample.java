package cn.chinaunicom.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluationExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andSaturationIsNull() {
            addCriterion("saturation is null");
            return (Criteria) this;
        }

        public Criteria andSaturationIsNotNull() {
            addCriterion("saturation is not null");
            return (Criteria) this;
        }

        public Criteria andSaturationEqualTo(Float value) {
            addCriterion("saturation =", value, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationNotEqualTo(Float value) {
            addCriterion("saturation <>", value, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationGreaterThan(Float value) {
            addCriterion("saturation >", value, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationGreaterThanOrEqualTo(Float value) {
            addCriterion("saturation >=", value, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationLessThan(Float value) {
            addCriterion("saturation <", value, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationLessThanOrEqualTo(Float value) {
            addCriterion("saturation <=", value, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationIn(List<Float> values) {
            addCriterion("saturation in", values, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationNotIn(List<Float> values) {
            addCriterion("saturation not in", values, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationBetween(Float value1, Float value2) {
            addCriterion("saturation between", value1, value2, "saturation");
            return (Criteria) this;
        }

        public Criteria andSaturationNotBetween(Float value1, Float value2) {
            addCriterion("saturation not between", value1, value2, "saturation");
            return (Criteria) this;
        }

        public Criteria andCompletionIsNull() {
            addCriterion("completion is null");
            return (Criteria) this;
        }

        public Criteria andCompletionIsNotNull() {
            addCriterion("completion is not null");
            return (Criteria) this;
        }

        public Criteria andCompletionEqualTo(Float value) {
            addCriterion("completion =", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionNotEqualTo(Float value) {
            addCriterion("completion <>", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionGreaterThan(Float value) {
            addCriterion("completion >", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionGreaterThanOrEqualTo(Float value) {
            addCriterion("completion >=", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionLessThan(Float value) {
            addCriterion("completion <", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionLessThanOrEqualTo(Float value) {
            addCriterion("completion <=", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionIn(List<Float> values) {
            addCriterion("completion in", values, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionNotIn(List<Float> values) {
            addCriterion("completion not in", values, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionBetween(Float value1, Float value2) {
            addCriterion("completion between", value1, value2, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionNotBetween(Float value1, Float value2) {
            addCriterion("completion not between", value1, value2, "completion");
            return (Criteria) this;
        }

        public Criteria andContributionIsNull() {
            addCriterion("contribution is null");
            return (Criteria) this;
        }

        public Criteria andContributionIsNotNull() {
            addCriterion("contribution is not null");
            return (Criteria) this;
        }

        public Criteria andContributionEqualTo(Float value) {
            addCriterion("contribution =", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionNotEqualTo(Float value) {
            addCriterion("contribution <>", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionGreaterThan(Float value) {
            addCriterion("contribution >", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionGreaterThanOrEqualTo(Float value) {
            addCriterion("contribution >=", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionLessThan(Float value) {
            addCriterion("contribution <", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionLessThanOrEqualTo(Float value) {
            addCriterion("contribution <=", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionIn(List<Float> values) {
            addCriterion("contribution in", values, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionNotIn(List<Float> values) {
            addCriterion("contribution not in", values, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionBetween(Float value1, Float value2) {
            addCriterion("contribution between", value1, value2, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionNotBetween(Float value1, Float value2) {
            addCriterion("contribution not between", value1, value2, "contribution");
            return (Criteria) this;
        }

        public Criteria andSatisfactionIsNull() {
            addCriterion("satisfaction is null");
            return (Criteria) this;
        }

        public Criteria andSatisfactionIsNotNull() {
            addCriterion("satisfaction is not null");
            return (Criteria) this;
        }

        public Criteria andSatisfactionEqualTo(Float value) {
            addCriterion("satisfaction =", value, "satisfaction");
            return (Criteria) this;
        }

        public Criteria andSatisfactionNotEqualTo(Float value) {
            addCriterion("satisfaction <>", value, "satisfaction");
            return (Criteria) this;
        }

        public Criteria andSatisfactionGreaterThan(Float value) {
            addCriterion("satisfaction >", value, "satisfaction");
            return (Criteria) this;
        }

        public Criteria andSatisfactionGreaterThanOrEqualTo(Float value) {
            addCriterion("satisfaction >=", value, "satisfaction");
            return (Criteria) this;
        }

        public Criteria andSatisfactionLessThan(Float value) {
            addCriterion("satisfaction <", value, "satisfaction");
            return (Criteria) this;
        }

        public Criteria andSatisfactionLessThanOrEqualTo(Float value) {
            addCriterion("satisfaction <=", value, "satisfaction");
            return (Criteria) this;
        }

        public Criteria andSatisfactionIn(List<Float> values) {
            addCriterion("satisfaction in", values, "satisfaction");
            return (Criteria) this;
        }

        public Criteria andSatisfactionNotIn(List<Float> values) {
            addCriterion("satisfaction not in", values, "satisfaction");
            return (Criteria) this;
        }

        public Criteria andSatisfactionBetween(Float value1, Float value2) {
            addCriterion("satisfaction between", value1, value2, "satisfaction");
            return (Criteria) this;
        }

        public Criteria andSatisfactionNotBetween(Float value1, Float value2) {
            addCriterion("satisfaction not between", value1, value2, "satisfaction");
            return (Criteria) this;
        }

        public Criteria andGrowthIsNull() {
            addCriterion("growth is null");
            return (Criteria) this;
        }

        public Criteria andGrowthIsNotNull() {
            addCriterion("growth is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthEqualTo(Float value) {
            addCriterion("growth =", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotEqualTo(Float value) {
            addCriterion("growth <>", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthGreaterThan(Float value) {
            addCriterion("growth >", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthGreaterThanOrEqualTo(Float value) {
            addCriterion("growth >=", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLessThan(Float value) {
            addCriterion("growth <", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLessThanOrEqualTo(Float value) {
            addCriterion("growth <=", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthIn(List<Float> values) {
            addCriterion("growth in", values, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotIn(List<Float> values) {
            addCriterion("growth not in", values, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthBetween(Float value1, Float value2) {
            addCriterion("growth between", value1, value2, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotBetween(Float value1, Float value2) {
            addCriterion("growth not between", value1, value2, "growth");
            return (Criteria) this;
        }

        public Criteria andInnovationIsNull() {
            addCriterion("innovation is null");
            return (Criteria) this;
        }

        public Criteria andInnovationIsNotNull() {
            addCriterion("innovation is not null");
            return (Criteria) this;
        }

        public Criteria andInnovationEqualTo(Float value) {
            addCriterion("innovation =", value, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationNotEqualTo(Float value) {
            addCriterion("innovation <>", value, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationGreaterThan(Float value) {
            addCriterion("innovation >", value, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationGreaterThanOrEqualTo(Float value) {
            addCriterion("innovation >=", value, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationLessThan(Float value) {
            addCriterion("innovation <", value, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationLessThanOrEqualTo(Float value) {
            addCriterion("innovation <=", value, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationIn(List<Float> values) {
            addCriterion("innovation in", values, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationNotIn(List<Float> values) {
            addCriterion("innovation not in", values, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationBetween(Float value1, Float value2) {
            addCriterion("innovation between", value1, value2, "innovation");
            return (Criteria) this;
        }

        public Criteria andInnovationNotBetween(Float value1, Float value2) {
            addCriterion("innovation not between", value1, value2, "innovation");
            return (Criteria) this;
        }

        public Criteria andAdditionIsNull() {
            addCriterion("addition is null");
            return (Criteria) this;
        }

        public Criteria andAdditionIsNotNull() {
            addCriterion("addition is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionEqualTo(Float value) {
            addCriterion("addition =", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionNotEqualTo(Float value) {
            addCriterion("addition <>", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionGreaterThan(Float value) {
            addCriterion("addition >", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionGreaterThanOrEqualTo(Float value) {
            addCriterion("addition >=", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionLessThan(Float value) {
            addCriterion("addition <", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionLessThanOrEqualTo(Float value) {
            addCriterion("addition <=", value, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionIn(List<Float> values) {
            addCriterion("addition in", values, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionNotIn(List<Float> values) {
            addCriterion("addition not in", values, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionBetween(Float value1, Float value2) {
            addCriterion("addition between", value1, value2, "addition");
            return (Criteria) this;
        }

        public Criteria andAdditionNotBetween(Float value1, Float value2) {
            addCriterion("addition not between", value1, value2, "addition");
            return (Criteria) this;
        }

        public Criteria andSubtractionIsNull() {
            addCriterion("subtraction is null");
            return (Criteria) this;
        }

        public Criteria andSubtractionIsNotNull() {
            addCriterion("subtraction is not null");
            return (Criteria) this;
        }

        public Criteria andSubtractionEqualTo(Float value) {
            addCriterion("subtraction =", value, "subtraction");
            return (Criteria) this;
        }

        public Criteria andSubtractionNotEqualTo(Float value) {
            addCriterion("subtraction <>", value, "subtraction");
            return (Criteria) this;
        }

        public Criteria andSubtractionGreaterThan(Float value) {
            addCriterion("subtraction >", value, "subtraction");
            return (Criteria) this;
        }

        public Criteria andSubtractionGreaterThanOrEqualTo(Float value) {
            addCriterion("subtraction >=", value, "subtraction");
            return (Criteria) this;
        }

        public Criteria andSubtractionLessThan(Float value) {
            addCriterion("subtraction <", value, "subtraction");
            return (Criteria) this;
        }

        public Criteria andSubtractionLessThanOrEqualTo(Float value) {
            addCriterion("subtraction <=", value, "subtraction");
            return (Criteria) this;
        }

        public Criteria andSubtractionIn(List<Float> values) {
            addCriterion("subtraction in", values, "subtraction");
            return (Criteria) this;
        }

        public Criteria andSubtractionNotIn(List<Float> values) {
            addCriterion("subtraction not in", values, "subtraction");
            return (Criteria) this;
        }

        public Criteria andSubtractionBetween(Float value1, Float value2) {
            addCriterion("subtraction between", value1, value2, "subtraction");
            return (Criteria) this;
        }

        public Criteria andSubtractionNotBetween(Float value1, Float value2) {
            addCriterion("subtraction not between", value1, value2, "subtraction");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNull() {
            addCriterion("input_date is null");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNotNull() {
            addCriterion("input_date is not null");
            return (Criteria) this;
        }

        public Criteria andInputDateEqualTo(Date value) {
            addCriterion("input_date =", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotEqualTo(Date value) {
            addCriterion("input_date <>", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThan(Date value) {
            addCriterion("input_date >", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThanOrEqualTo(Date value) {
            addCriterion("input_date >=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThan(Date value) {
            addCriterion("input_date <", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThanOrEqualTo(Date value) {
            addCriterion("input_date <=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateIn(List<Date> values) {
            addCriterion("input_date in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotIn(List<Date> values) {
            addCriterion("input_date not in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateBetween(Date value1, Date value2) {
            addCriterion("input_date between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotBetween(Date value1, Date value2) {
            addCriterion("input_date not between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andEvaluatorIsNull() {
            addCriterion("evaluator is null");
            return (Criteria) this;
        }

        public Criteria andEvaluatorIsNotNull() {
            addCriterion("evaluator is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluatorEqualTo(String value) {
            addCriterion("evaluator =", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorNotEqualTo(String value) {
            addCriterion("evaluator <>", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorGreaterThan(String value) {
            addCriterion("evaluator >", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorGreaterThanOrEqualTo(String value) {
            addCriterion("evaluator >=", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorLessThan(String value) {
            addCriterion("evaluator <", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorLessThanOrEqualTo(String value) {
            addCriterion("evaluator <=", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorLike(String value) {
            addCriterion("evaluator like", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorNotLike(String value) {
            addCriterion("evaluator not like", value, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorIn(List<String> values) {
            addCriterion("evaluator in", values, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorNotIn(List<String> values) {
            addCriterion("evaluator not in", values, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorBetween(String value1, String value2) {
            addCriterion("evaluator between", value1, value2, "evaluator");
            return (Criteria) this;
        }

        public Criteria andEvaluatorNotBetween(String value1, String value2) {
            addCriterion("evaluator not between", value1, value2, "evaluator");
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