
package com.ng.ap.apiread.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "tld",
    "cca2",
    "ccn3",
    "cca3",
    "independent",
    "status",
    "unMember",
    "currencies",
    "idd",
    "capital",
    "altSpellings",
    "region",
    "subregion",
    "languages",
    "translations",
    "latlng",
    "landlocked",
    "area",
    "demonyms",
    "flag",
    "maps",
    "population",
    "car",
    "timezones",
    "continents",
    "flags",
    "coatOfArms",
    "startOfWeek",
    "capitalInfo",
    "postalCode"
})
@Generated("jsonschema2pojo")
public class Country {

	@Getter
	@Setter
	private Long Id;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("tld")
    private List<String> tld = new ArrayList<String>();
    @JsonProperty("cca2")
    private String cca2;
    @JsonProperty("ccn3")
    private String ccn3;
    @JsonProperty("cca3")
    private String cca3;
    @JsonProperty("independent")
    private Boolean independent;
    @JsonProperty("status")
    private String status;
    @JsonProperty("unMember")
    private Boolean unMember;
    @JsonProperty("currencies")
    private Currencies currencies;
    @JsonProperty("idd")
    private Idd idd;
    @JsonProperty("capital")
    private List<String> capital = new ArrayList<String>();
    @JsonProperty("altSpellings")
    private List<String> altSpellings = new ArrayList<String>();
    @JsonProperty("region")
    private String region;
    @JsonProperty("subregion")
    private String subregion;
    @JsonProperty("languages")
    private Languages languages;
    @JsonProperty("translations")
    private Translations translations;
    @JsonProperty("latlng")
    private List<Double> latlng = new ArrayList<Double>();
    @JsonProperty("landlocked")
    private Boolean landlocked;
    @JsonProperty("area")
    private Integer area;
    @JsonProperty("demonyms")
    private Demonyms demonyms;
    @JsonProperty("flag")
    private String flag;
    @JsonProperty("maps")
    private Maps maps;
    @JsonProperty("population")
    private Integer population;
    @JsonProperty("car")
    private Car car;
    @JsonProperty("timezones")
    private List<String> timezones = new ArrayList<String>();
    @JsonProperty("continents")
    private List<String> continents = new ArrayList<String>();
    @JsonProperty("flags")
    private Flags flags;
    @JsonProperty("coatOfArms")
    private CoatOfArms coatOfArms;
    @JsonProperty("startOfWeek")
    private String startOfWeek;
    @JsonProperty("capitalInfo")
    private CapitalInfo capitalInfo;
    @JsonProperty("postalCode")
    private PostalCode postalCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    public Country withName(Name name) {
        this.name = name;
        return this;
    }

    @JsonProperty("tld")
    public List<String> getTld() {
        return tld;
    }

    @JsonProperty("tld")
    public void setTld(List<String> tld) {
        this.tld = tld;
    }

    public Country withTld(List<String> tld) {
        this.tld = tld;
        return this;
    }

    @JsonProperty("cca2")
    public String getCca2() {
        return cca2;
    }

    @JsonProperty("cca2")
    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public Country withCca2(String cca2) {
        this.cca2 = cca2;
        return this;
    }

    @JsonProperty("ccn3")
    public String getCcn3() {
        return ccn3;
    }

    @JsonProperty("ccn3")
    public void setCcn3(String ccn3) {
        this.ccn3 = ccn3;
    }

    public Country withCcn3(String ccn3) {
        this.ccn3 = ccn3;
        return this;
    }

    @JsonProperty("cca3")
    public String getCca3() {
        return cca3;
    }

    @JsonProperty("cca3")
    public void setCca3(String cca3) {
        this.cca3 = cca3;
    }

    public Country withCca3(String cca3) {
        this.cca3 = cca3;
        return this;
    }

    @JsonProperty("independent")
    public Boolean getIndependent() {
        return independent;
    }

    @JsonProperty("independent")
    public void setIndependent(Boolean independent) {
        this.independent = independent;
    }

    public Country withIndependent(Boolean independent) {
        this.independent = independent;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Country withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("unMember")
    public Boolean getUnMember() {
        return unMember;
    }

    @JsonProperty("unMember")
    public void setUnMember(Boolean unMember) {
        this.unMember = unMember;
    }

    public Country withUnMember(Boolean unMember) {
        this.unMember = unMember;
        return this;
    }

    @JsonProperty("currencies")
    public Currencies getCurrencies() {
        return currencies;
    }

    @JsonProperty("currencies")
    public void setCurrencies(Currencies currencies) {
        this.currencies = currencies;
    }

    public Country withCurrencies(Currencies currencies) {
        this.currencies = currencies;
        return this;
    }

    @JsonProperty("idd")
    public Idd getIdd() {
        return idd;
    }

    @JsonProperty("idd")
    public void setIdd(Idd idd) {
        this.idd = idd;
    }

    public Country withIdd(Idd idd) {
        this.idd = idd;
        return this;
    }

    @JsonProperty("capital")
    public List<String> getCapital() {
        return capital;
    }

    @JsonProperty("capital")
    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    public Country withCapital(List<String> capital) {
        this.capital = capital;
        return this;
    }

    @JsonProperty("altSpellings")
    public List<String> getAltSpellings() {
        return altSpellings;
    }

    @JsonProperty("altSpellings")
    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public Country withAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
        return this;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    public Country withRegion(String region) {
        this.region = region;
        return this;
    }

    @JsonProperty("subregion")
    public String getSubregion() {
        return subregion;
    }

    @JsonProperty("subregion")
    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public Country withSubregion(String subregion) {
        this.subregion = subregion;
        return this;
    }

    @JsonProperty("languages")
    public Languages getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public Country withLanguages(Languages languages) {
        this.languages = languages;
        return this;
    }

    @JsonProperty("translations")
    public Translations getTranslations() {
        return translations;
    }

    @JsonProperty("translations")
    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    public Country withTranslations(Translations translations) {
        this.translations = translations;
        return this;
    }

    @JsonProperty("latlng")
    public List<Double> getLatlng() {
        return latlng;
    }

    @JsonProperty("latlng")
    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public Country withLatlng(List<Double> latlng) {
        this.latlng = latlng;
        return this;
    }

    @JsonProperty("landlocked")
    public Boolean getLandlocked() {
        return landlocked;
    }

    @JsonProperty("landlocked")
    public void setLandlocked(Boolean landlocked) {
        this.landlocked = landlocked;
    }

    public Country withLandlocked(Boolean landlocked) {
        this.landlocked = landlocked;
        return this;
    }

    @JsonProperty("area")
    public Integer getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(Integer area) {
        this.area = area;
    }

    public Country withArea(Integer area) {
        this.area = area;
        return this;
    }

    @JsonProperty("demonyms")
    public Demonyms getDemonyms() {
        return demonyms;
    }

    @JsonProperty("demonyms")
    public void setDemonyms(Demonyms demonyms) {
        this.demonyms = demonyms;
    }

    public Country withDemonyms(Demonyms demonyms) {
        this.demonyms = demonyms;
        return this;
    }

    @JsonProperty("flag")
    public String getFlag() {
        return flag;
    }

    @JsonProperty("flag")
    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Country withFlag(String flag) {
        this.flag = flag;
        return this;
    }

    @JsonProperty("maps")
    public Maps getMaps() {
        return maps;
    }

    @JsonProperty("maps")
    public void setMaps(Maps maps) {
        this.maps = maps;
    }

    public Country withMaps(Maps maps) {
        this.maps = maps;
        return this;
    }

    @JsonProperty("population")
    public Integer getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Country withPopulation(Integer population) {
        this.population = population;
        return this;
    }

    @JsonProperty("car")
    public Car getCar() {
        return car;
    }

    @JsonProperty("car")
    public void setCar(Car car) {
        this.car = car;
    }

    public Country withCar(Car car) {
        this.car = car;
        return this;
    }

    @JsonProperty("timezones")
    public List<String> getTimezones() {
        return timezones;
    }

    @JsonProperty("timezones")
    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    public Country withTimezones(List<String> timezones) {
        this.timezones = timezones;
        return this;
    }

    @JsonProperty("continents")
    public List<String> getContinents() {
        return continents;
    }

    @JsonProperty("continents")
    public void setContinents(List<String> continents) {
        this.continents = continents;
    }

    public Country withContinents(List<String> continents) {
        this.continents = continents;
        return this;
    }

    @JsonProperty("flags")
    public Flags getFlags() {
        return flags;
    }

    @JsonProperty("flags")
    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public Country withFlags(Flags flags) {
        this.flags = flags;
        return this;
    }

    @JsonProperty("coatOfArms")
    public CoatOfArms getCoatOfArms() {
        return coatOfArms;
    }

    @JsonProperty("coatOfArms")
    public void setCoatOfArms(CoatOfArms coatOfArms) {
        this.coatOfArms = coatOfArms;
    }

    public Country withCoatOfArms(CoatOfArms coatOfArms) {
        this.coatOfArms = coatOfArms;
        return this;
    }

    @JsonProperty("startOfWeek")
    public String getStartOfWeek() {
        return startOfWeek;
    }

    @JsonProperty("startOfWeek")
    public void setStartOfWeek(String startOfWeek) {
        this.startOfWeek = startOfWeek;
    }

    public Country withStartOfWeek(String startOfWeek) {
        this.startOfWeek = startOfWeek;
        return this;
    }

    @JsonProperty("capitalInfo")
    public CapitalInfo getCapitalInfo() {
        return capitalInfo;
    }

    @JsonProperty("capitalInfo")
    public void setCapitalInfo(CapitalInfo capitalInfo) {
        this.capitalInfo = capitalInfo;
    }

    public Country withCapitalInfo(CapitalInfo capitalInfo) {
        this.capitalInfo = capitalInfo;
        return this;
    }

    @JsonProperty("postalCode")
    public PostalCode getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
    }

    public Country withPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Country withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Country.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("tld");
        sb.append('=');
        sb.append(((this.tld == null)?"<null>":this.tld));
        sb.append(',');
        sb.append("cca2");
        sb.append('=');
        sb.append(((this.cca2 == null)?"<null>":this.cca2));
        sb.append(',');
        sb.append("ccn3");
        sb.append('=');
        sb.append(((this.ccn3 == null)?"<null>":this.ccn3));
        sb.append(',');
        sb.append("cca3");
        sb.append('=');
        sb.append(((this.cca3 == null)?"<null>":this.cca3));
        sb.append(',');
        sb.append("independent");
        sb.append('=');
        sb.append(((this.independent == null)?"<null>":this.independent));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("unMember");
        sb.append('=');
        sb.append(((this.unMember == null)?"<null>":this.unMember));
        sb.append(',');
        sb.append("currencies");
        sb.append('=');
        sb.append(((this.currencies == null)?"<null>":this.currencies));
        sb.append(',');
        sb.append("idd");
        sb.append('=');
        sb.append(((this.idd == null)?"<null>":this.idd));
        sb.append(',');
        sb.append("capital");
        sb.append('=');
        sb.append(((this.capital == null)?"<null>":this.capital));
        sb.append(',');
        sb.append("altSpellings");
        sb.append('=');
        sb.append(((this.altSpellings == null)?"<null>":this.altSpellings));
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
        sb.append(',');
        sb.append("subregion");
        sb.append('=');
        sb.append(((this.subregion == null)?"<null>":this.subregion));
        sb.append(',');
        sb.append("languages");
        sb.append('=');
        sb.append(((this.languages == null)?"<null>":this.languages));
        sb.append(',');
        sb.append("translations");
        sb.append('=');
        sb.append(((this.translations == null)?"<null>":this.translations));
        sb.append(',');
        sb.append("latlng");
        sb.append('=');
        sb.append(((this.latlng == null)?"<null>":this.latlng));
        sb.append(',');
        sb.append("landlocked");
        sb.append('=');
        sb.append(((this.landlocked == null)?"<null>":this.landlocked));
        sb.append(',');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("demonyms");
        sb.append('=');
        sb.append(((this.demonyms == null)?"<null>":this.demonyms));
        sb.append(',');
        sb.append("flag");
        sb.append('=');
        sb.append(((this.flag == null)?"<null>":this.flag));
        sb.append(',');
        sb.append("maps");
        sb.append('=');
        sb.append(((this.maps == null)?"<null>":this.maps));
        sb.append(',');
        sb.append("population");
        sb.append('=');
        sb.append(((this.population == null)?"<null>":this.population));
        sb.append(',');
        sb.append("car");
        sb.append('=');
        sb.append(((this.car == null)?"<null>":this.car));
        sb.append(',');
        sb.append("timezones");
        sb.append('=');
        sb.append(((this.timezones == null)?"<null>":this.timezones));
        sb.append(',');
        sb.append("continents");
        sb.append('=');
        sb.append(((this.continents == null)?"<null>":this.continents));
        sb.append(',');
        sb.append("flags");
        sb.append('=');
        sb.append(((this.flags == null)?"<null>":this.flags));
        sb.append(',');
        sb.append("coatOfArms");
        sb.append('=');
        sb.append(((this.coatOfArms == null)?"<null>":this.coatOfArms));
        sb.append(',');
        sb.append("startOfWeek");
        sb.append('=');
        sb.append(((this.startOfWeek == null)?"<null>":this.startOfWeek));
        sb.append(',');
        sb.append("capitalInfo");
        sb.append('=');
        sb.append(((this.capitalInfo == null)?"<null>":this.capitalInfo));
        sb.append(',');
        sb.append("postalCode");
        sb.append('=');
        sb.append(((this.postalCode == null)?"<null>":this.postalCode));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.capital == null)? 0 :this.capital.hashCode()));
        result = ((result* 31)+((this.flag == null)? 0 :this.flag.hashCode()));
        result = ((result* 31)+((this.independent == null)? 0 :this.independent.hashCode()));
        result = ((result* 31)+((this.landlocked == null)? 0 :this.landlocked.hashCode()));
        result = ((result* 31)+((this.postalCode == null)? 0 :this.postalCode.hashCode()));
        result = ((result* 31)+((this.flags == null)? 0 :this.flags.hashCode()));
        result = ((result* 31)+((this.capitalInfo == null)? 0 :this.capitalInfo.hashCode()));
        result = ((result* 31)+((this.ccn3 == null)? 0 :this.ccn3 .hashCode()));
        result = ((result* 31)+((this.coatOfArms == null)? 0 :this.coatOfArms.hashCode()));
        result = ((result* 31)+((this.demonyms == null)? 0 :this.demonyms.hashCode()));
        result = ((result* 31)+((this.car == null)? 0 :this.car.hashCode()));
        result = ((result* 31)+((this.translations == null)? 0 :this.translations.hashCode()));
        result = ((result* 31)+((this.altSpellings == null)? 0 :this.altSpellings.hashCode()));
        result = ((result* 31)+((this.area == null)? 0 :this.area.hashCode()));
        result = ((result* 31)+((this.languages == null)? 0 :this.languages.hashCode()));
        result = ((result* 31)+((this.maps == null)? 0 :this.maps.hashCode()));
        result = ((result* 31)+((this.subregion == null)? 0 :this.subregion.hashCode()));
        result = ((result* 31)+((this.idd == null)? 0 :this.idd.hashCode()));
        result = ((result* 31)+((this.tld == null)? 0 :this.tld.hashCode()));
        result = ((result* 31)+((this.unMember == null)? 0 :this.unMember.hashCode()));
        result = ((result* 31)+((this.continents == null)? 0 :this.continents.hashCode()));
        result = ((result* 31)+((this.population == null)? 0 :this.population.hashCode()));
        result = ((result* 31)+((this.startOfWeek == null)? 0 :this.startOfWeek.hashCode()));
        result = ((result* 31)+((this.timezones == null)? 0 :this.timezones.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cca3 == null)? 0 :this.cca3 .hashCode()));
        result = ((result* 31)+((this.region == null)? 0 :this.region.hashCode()));
        result = ((result* 31)+((this.latlng == null)? 0 :this.latlng.hashCode()));
        result = ((result* 31)+((this.cca2 == null)? 0 :this.cca2 .hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.currencies == null)? 0 :this.currencies.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Country) == false) {
            return false;
        }
        Country rhs = ((Country) other);
        return (((((((((((((((((((((((((((((((((this.capital == rhs.capital)||((this.capital!= null)&&this.capital.equals(rhs.capital)))&&((this.flag == rhs.flag)||((this.flag!= null)&&this.flag.equals(rhs.flag))))&&((this.independent == rhs.independent)||((this.independent!= null)&&this.independent.equals(rhs.independent))))&&((this.landlocked == rhs.landlocked)||((this.landlocked!= null)&&this.landlocked.equals(rhs.landlocked))))&&((this.postalCode == rhs.postalCode)||((this.postalCode!= null)&&this.postalCode.equals(rhs.postalCode))))&&((this.flags == rhs.flags)||((this.flags!= null)&&this.flags.equals(rhs.flags))))&&((this.capitalInfo == rhs.capitalInfo)||((this.capitalInfo!= null)&&this.capitalInfo.equals(rhs.capitalInfo))))&&((this.ccn3 == rhs.ccn3)||((this.ccn3 != null)&&this.ccn3 .equals(rhs.ccn3))))&&((this.coatOfArms == rhs.coatOfArms)||((this.coatOfArms!= null)&&this.coatOfArms.equals(rhs.coatOfArms))))&&((this.demonyms == rhs.demonyms)||((this.demonyms!= null)&&this.demonyms.equals(rhs.demonyms))))&&((this.car == rhs.car)||((this.car!= null)&&this.car.equals(rhs.car))))&&((this.translations == rhs.translations)||((this.translations!= null)&&this.translations.equals(rhs.translations))))&&((this.altSpellings == rhs.altSpellings)||((this.altSpellings!= null)&&this.altSpellings.equals(rhs.altSpellings))))&&((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area))))&&((this.languages == rhs.languages)||((this.languages!= null)&&this.languages.equals(rhs.languages))))&&((this.maps == rhs.maps)||((this.maps!= null)&&this.maps.equals(rhs.maps))))&&((this.subregion == rhs.subregion)||((this.subregion!= null)&&this.subregion.equals(rhs.subregion))))&&((this.idd == rhs.idd)||((this.idd!= null)&&this.idd.equals(rhs.idd))))&&((this.tld == rhs.tld)||((this.tld!= null)&&this.tld.equals(rhs.tld))))&&((this.unMember == rhs.unMember)||((this.unMember!= null)&&this.unMember.equals(rhs.unMember))))&&((this.continents == rhs.continents)||((this.continents!= null)&&this.continents.equals(rhs.continents))))&&((this.population == rhs.population)||((this.population!= null)&&this.population.equals(rhs.population))))&&((this.startOfWeek == rhs.startOfWeek)||((this.startOfWeek!= null)&&this.startOfWeek.equals(rhs.startOfWeek))))&&((this.timezones == rhs.timezones)||((this.timezones!= null)&&this.timezones.equals(rhs.timezones))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cca3 == rhs.cca3)||((this.cca3 != null)&&this.cca3 .equals(rhs.cca3))))&&((this.region == rhs.region)||((this.region!= null)&&this.region.equals(rhs.region))))&&((this.latlng == rhs.latlng)||((this.latlng!= null)&&this.latlng.equals(rhs.latlng))))&&((this.cca2 == rhs.cca2)||((this.cca2 != null)&&this.cca2 .equals(rhs.cca2))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.currencies == rhs.currencies)||((this.currencies!= null)&&this.currencies.equals(rhs.currencies))));
    }

}
