
package com.ng.ap.apiread.model;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "googleMaps",
    "openStreetMaps"
})
@Generated("jsonschema2pojo")
public class Maps {

    @JsonProperty("googleMaps")
    private String googleMaps;
    @JsonProperty("openStreetMaps")
    private String openStreetMaps;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("googleMaps")
    public String getGoogleMaps() {
        return googleMaps;
    }

    @JsonProperty("googleMaps")
    public void setGoogleMaps(String googleMaps) {
        this.googleMaps = googleMaps;
    }

    public Maps withGoogleMaps(String googleMaps) {
        this.googleMaps = googleMaps;
        return this;
    }

    @JsonProperty("openStreetMaps")
    public String getOpenStreetMaps() {
        return openStreetMaps;
    }

    @JsonProperty("openStreetMaps")
    public void setOpenStreetMaps(String openStreetMaps) {
        this.openStreetMaps = openStreetMaps;
    }

    public Maps withOpenStreetMaps(String openStreetMaps) {
        this.openStreetMaps = openStreetMaps;
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

    public Maps withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Maps.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("googleMaps");
        sb.append('=');
        sb.append(((this.googleMaps == null)?"<null>":this.googleMaps));
        sb.append(',');
        sb.append("openStreetMaps");
        sb.append('=');
        sb.append(((this.openStreetMaps == null)?"<null>":this.openStreetMaps));
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
        result = ((result* 31)+((this.googleMaps == null)? 0 :this.googleMaps.hashCode()));
        result = ((result* 31)+((this.openStreetMaps == null)? 0 :this.openStreetMaps.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Maps) == false) {
            return false;
        }
        Maps rhs = ((Maps) other);
        return ((((this.googleMaps == rhs.googleMaps)||((this.googleMaps!= null)&&this.googleMaps.equals(rhs.googleMaps)))&&((this.openStreetMaps == rhs.openStreetMaps)||((this.openStreetMaps!= null)&&this.openStreetMaps.equals(rhs.openStreetMaps))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
