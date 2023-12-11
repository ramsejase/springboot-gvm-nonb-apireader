
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "root",
    "suffixes"
})
@Generated("jsonschema2pojo")
public class Idd {

    @JsonProperty("root")
    private String root;
    @JsonProperty("suffixes")
    private List<String> suffixes = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("root")
    public String getRoot() {
        return root;
    }

    @JsonProperty("root")
    public void setRoot(String root) {
        this.root = root;
    }

    public Idd withRoot(String root) {
        this.root = root;
        return this;
    }

    @JsonProperty("suffixes")
    public List<String> getSuffixes() {
        return suffixes;
    }

    @JsonProperty("suffixes")
    public void setSuffixes(List<String> suffixes) {
        this.suffixes = suffixes;
    }

    public Idd withSuffixes(List<String> suffixes) {
        this.suffixes = suffixes;
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

    public Idd withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Idd.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("root");
        sb.append('=');
        sb.append(((this.root == null)?"<null>":this.root));
        sb.append(',');
        sb.append("suffixes");
        sb.append('=');
        sb.append(((this.suffixes == null)?"<null>":this.suffixes));
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
        result = ((result* 31)+((this.suffixes == null)? 0 :this.suffixes.hashCode()));
        result = ((result* 31)+((this.root == null)? 0 :this.root.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Idd) == false) {
            return false;
        }
        Idd rhs = ((Idd) other);
        return ((((this.suffixes == rhs.suffixes)||((this.suffixes!= null)&&this.suffixes.equals(rhs.suffixes)))&&((this.root == rhs.root)||((this.root!= null)&&this.root.equals(rhs.root))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
