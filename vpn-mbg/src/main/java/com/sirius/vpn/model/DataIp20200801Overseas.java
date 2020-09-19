package com.sirius.vpn.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class DataIp20200801Overseas implements Serializable {
    @ApiModelProperty(value = "起始IP")
    private String ipStart;

    @ApiModelProperty(value = "结束IP")
    private String ipEnd;

    @ApiModelProperty(value = "数字起始IP")
    private Long numStart;

    @ApiModelProperty(value = "数字结束IP")
    private Long numEnd;

    @ApiModelProperty(value = "IP数量")
    private Integer num;

    @ApiModelProperty(value = "大州")
    private String land;

    @ApiModelProperty(value = "省份")
    private String region;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "区县")
    private String area;

    @ApiModelProperty(value = "国家")
    private String country;

    @ApiModelProperty(value = "国家英文")
    private String countryEnglish;

    @ApiModelProperty(value = "运营商")
    private String isp;

    @ApiModelProperty(value = "国家代码")
    private String countryId;

    @ApiModelProperty(value = "国际区号")
    private String internationalCode;

    @ApiModelProperty(value = "一级行政代码")
    private String regionId;

    @ApiModelProperty(value = "二级行政代码")
    private String cityId;

    @ApiModelProperty(value = "三级行政代码")
    private String areaId;

    @ApiModelProperty(value = "经度")
    private String lat;

    @ApiModelProperty(value = "纬度")
    private String lng;

    private static final long serialVersionUID = 1L;

    public String getIpStart() {
        return ipStart;
    }

    public void setIpStart(String ipStart) {
        this.ipStart = ipStart;
    }

    public String getIpEnd() {
        return ipEnd;
    }

    public void setIpEnd(String ipEnd) {
        this.ipEnd = ipEnd;
    }

    public Long getNumStart() {
        return numStart;
    }

    public void setNumStart(Long numStart) {
        this.numStart = numStart;
    }

    public Long getNumEnd() {
        return numEnd;
    }

    public void setNumEnd(Long numEnd) {
        this.numEnd = numEnd;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryEnglish() {
        return countryEnglish;
    }

    public void setCountryEnglish(String countryEnglish) {
        this.countryEnglish = countryEnglish;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getInternationalCode() {
        return internationalCode;
    }

    public void setInternationalCode(String internationalCode) {
        this.internationalCode = internationalCode;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ipStart=").append(ipStart);
        sb.append(", ipEnd=").append(ipEnd);
        sb.append(", numStart=").append(numStart);
        sb.append(", numEnd=").append(numEnd);
        sb.append(", num=").append(num);
        sb.append(", land=").append(land);
        sb.append(", region=").append(region);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", country=").append(country);
        sb.append(", countryEnglish=").append(countryEnglish);
        sb.append(", isp=").append(isp);
        sb.append(", countryId=").append(countryId);
        sb.append(", internationalCode=").append(internationalCode);
        sb.append(", regionId=").append(regionId);
        sb.append(", cityId=").append(cityId);
        sb.append(", areaId=").append(areaId);
        sb.append(", lat=").append(lat);
        sb.append(", lng=").append(lng);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}