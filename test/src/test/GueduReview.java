package test;

import java.io.Serializable;

/**
 * 专家评审
 * 
 * @author LIZHIXIONG
 *
 */
public class GueduReview implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 知识点id
	 */
	private Integer lordId;

	/**
	 * 专家1
	 */
	private String expert1;

	/**
	 * 专家1评分
	 */
	private String expert1Grade;

	/**
	 * 专家1评语
	 */
	private String expert1Remark;

	/**
	 * 专家2
	 */
	private String expert2;

	/**
	 * 专家2评分
	 */
	private String expert2Grade;

	/**
	 * 专家2评语
	 */
	private String expert2Remark;

	/**
	 * 教研专家
	 */
	private String researchExpert;

	/**
	 * 教研专家评分
	 */
	private int researchExpertGrade;

	/**
	 * 教研专家评语
	 */
	private String researchExpertRemark;

	/**
	 * 区域，1：区县，2：地市
	 */
	private Integer area;

	public GueduReview() {

	}

	public GueduReview(Integer lordId, String expert1, String expert1Grade, String expert1Remark, String expert2,
			String expert2Grade, String expert2Remark, String researchExpert, int researchExpertGrade,
			String researchExpertRemark, Integer area) {
		this.lordId = lordId;
		this.expert1 = expert1;
		this.expert1Grade = expert1Grade;
		this.expert1Remark = expert1Remark;
		this.expert2 = expert2;
		this.expert2Grade = expert2Grade;
		this.expert2Remark = expert2Remark;
		this.researchExpert = researchExpert;
		this.researchExpertGrade = researchExpertGrade;
		this.researchExpertRemark = researchExpertRemark;
		this.area = area;
	}

	public Integer getLordId() {
		return lordId;
	}

	public void setLordId(Integer lordId) {
		this.lordId = lordId;
	}

	public String getExpert1() {
		return expert1;
	}

	public void setExpert1(String expert1) {
		this.expert1 = expert1;
	}

	public String getExpert1Grade() {
		return expert1Grade;
	}

	public void setExpert1Grade(String expert1Grade) {
		this.expert1Grade = expert1Grade;
	}

	public String getExpert1Remark() {
		return expert1Remark;
	}

	public void setExpert1Remark(String expert1Remark) {
		this.expert1Remark = expert1Remark;
	}

	public String getExpert2() {
		return expert2;
	}

	public void setExpert2(String expert2) {
		this.expert2 = expert2;
	}

	public String getExpert2Grade() {
		return expert2Grade;
	}

	public void setExpert2Grade(String expert2Grade) {
		this.expert2Grade = expert2Grade;
	}

	public String getExpert2Remark() {
		return expert2Remark;
	}

	public void setExpert2Remark(String expert2Remark) {
		this.expert2Remark = expert2Remark;
	}

	public String getResearchExpert() {
		return researchExpert;
	}

	public void setResearchExpert(String researchExpert) {
		this.researchExpert = researchExpert;
	}

	public int getResearchExpertGrade() {
		return researchExpertGrade;
	}

	public void setResearchExpertGrade(int researchExpertGrade) {
		this.researchExpertGrade = researchExpertGrade;
	}

	public String getResearchExpertRemark() {
		return researchExpertRemark;
	}

	public void setResearchExpertRemark(String researchExpertRemark) {
		this.researchExpertRemark = researchExpertRemark;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "GueduReview [lordId=" + lordId + ", expert1=" + expert1 + ", expert1Grade=" + expert1Grade
				+ ", expert1Remark=" + expert1Remark + ", expert2=" + expert2 + ", expert2Grade=" + expert2Grade
				+ ", expert2Remark=" + expert2Remark + ", researchExpert=" + researchExpert + ", researchExpertGrade="
				+ researchExpertGrade + ", researchExpertRemark=" + researchExpertRemark + ", area=" + area + "]";
	}

}
