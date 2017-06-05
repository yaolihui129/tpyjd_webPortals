package cn.pacificimmi.common.models.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCountry<M extends BaseCountry<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setCountryId(java.lang.String countryId) {
		set("country_id", countryId);
	}

	public java.lang.String getCountryId() {
		return get("country_id");
	}

	public void setCountryName(java.lang.String countryName) {
		set("country_name", countryName);
	}

	public java.lang.String getCountryName() {
		return get("country_name");
	}

	public void setContinentName(java.lang.String continentName) {
		set("continent_name", continentName);
	}

	public java.lang.String getContinentName() {
		return get("continent_name");
	}

	public void setEnglishName(java.lang.String englishName) {
		set("english_name", englishName);
	}

	public java.lang.String getEnglishName() {
		return get("english_name");
	}

	public void setHotspotsId(java.lang.String hotspotsId) {
		set("hotspots_id", hotspotsId);
	}

	public java.lang.String getHotspotsId() {
		return get("hotspots_id");
	}

	public void setStandPic(java.lang.String standPic) {
		set("stand_pic", standPic);
	}

	public java.lang.String getStandPic() {
		return get("stand_pic");
	}

	public void setStylePic(java.lang.String stylePic) {
		set("style_pic", stylePic);
	}

	public java.lang.String getStylePic() {
		return get("style_pic");
	}

	public void setCoverPic(java.lang.String coverPic) {
		set("cover_pic", coverPic);
	}

	public java.lang.String getCoverPic() {
		return get("cover_pic");
	}

	public void setCountryTypical(java.lang.String countryTypical) {
		set("country_typical", countryTypical);
	}

	public java.lang.String getCountryTypical() {
		return get("country_typical");
	}

	public void setCountryBrief(java.lang.String countryBrief) {
		set("country_brief", countryBrief);
	}

	public java.lang.String getCountryBrief() {
		return get("country_brief");
	}

	public void setLivingEnvironment(java.lang.String livingEnvironment) {
		set("living_environment", livingEnvironment);
	}

	public java.lang.String getLivingEnvironment() {
		return get("living_environment");
	}

	public void setSocialWelfare(java.lang.String socialWelfare) {
		set("social_welfare", socialWelfare);
	}

	public java.lang.String getSocialWelfare() {
		return get("social_welfare");
	}

	public void setEducationalLevel(java.lang.String educationalLevel) {
		set("educational_level", educationalLevel);
	}

	public java.lang.String getEducationalLevel() {
		return get("educational_level");
	}

	public void setInvestHome(java.lang.String investHome) {
		set("invest_home", investHome);
	}

	public java.lang.String getInvestHome() {
		return get("invest_home");
	}

	public void setEmploymentEnvironment(java.lang.String employmentEnvironment) {
		set("employment_environment", employmentEnvironment);
	}

	public java.lang.String getEmploymentEnvironment() {
		return get("employment_environment");
	}

	public void setPassportNationality(java.lang.String passportNationality) {
		set("passport_nationality", passportNationality);
	}

	public java.lang.String getPassportNationality() {
		return get("passport_nationality");
	}

	public void setReleaseStatus(java.lang.Integer releaseStatus) {
		set("release_status", releaseStatus);
	}

	public java.lang.Integer getReleaseStatus() {
		return get("release_status");
	}

	public void setReleaseTime(java.util.Date releaseTime) {
		set("release_time", releaseTime);
	}

	public java.util.Date getReleaseTime() {
		return get("release_time");
	}

	public void setReleaseUser(java.lang.String releaseUser) {
		set("release_user", releaseUser);
	}

	public java.lang.String getReleaseUser() {
		return get("release_user");
	}

	public void setCreateUser(java.lang.String createUser) {
		set("create_user", createUser);
	}

	public java.lang.String getCreateUser() {
		return get("create_user");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setDeleteFlag(java.lang.Integer deleteFlag) {
		set("delete_flag", deleteFlag);
	}

	public java.lang.Integer getDeleteFlag() {
		return get("delete_flag");
	}

	public void setDeleteUser(java.lang.String deleteUser) {
		set("delete_user", deleteUser);
	}

	public java.lang.String getDeleteUser() {
		return get("delete_user");
	}

	public void setDeleteTime(java.util.Date deleteTime) {
		set("delete_time", deleteTime);
	}

	public java.util.Date getDeleteTime() {
		return get("delete_time");
	}

}