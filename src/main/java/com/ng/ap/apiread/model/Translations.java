
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
    "ara",
    "bre",
    "ces",
    "cym",
    "deu",
    "est",
    "fin",
    "fra",
    "hrv",
    "hun",
    "ita",
    "jpn",
    "kor",
    "nld",
    "per",
    "pol",
    "por",
    "rus",
    "slk",
    "spa",
    "srp",
    "swe",
    "tur",
    "urd",
    "zho"
})
@Generated("jsonschema2pojo")
public class Translations {

    @JsonProperty("ara")
    private Ara ara;
    @JsonProperty("bre")
    private Bre bre;
    @JsonProperty("ces")
    private Ces ces;
    @JsonProperty("cym")
    private Cym cym;
    @JsonProperty("deu")
    private Deu deu;
    @JsonProperty("est")
    private Est est;
    @JsonProperty("fin")
    private Fin fin;
    @JsonProperty("fra")
    private Fra fra;
    @JsonProperty("hrv")
    private Hrv hrv;
    @JsonProperty("hun")
    private Hun hun;
    @JsonProperty("ita")
    private Ita ita;
    @JsonProperty("jpn")
    private Jpn jpn;
    @JsonProperty("kor")
    private Kor kor;
    @JsonProperty("nld")
    private Nld nld;
    @JsonProperty("per")
    private Per per;
    @JsonProperty("pol")
    private Pol pol;
    @JsonProperty("por")
    private Por por;
    @JsonProperty("rus")
    private Rus rus;
    @JsonProperty("slk")
    private Slk slk;
    @JsonProperty("spa")
    private Spa spa;
    @JsonProperty("srp")
    private Srp srp;
    @JsonProperty("swe")
    private Swe swe;
    @JsonProperty("tur")
    private Tur tur;
    @JsonProperty("urd")
    private Urd urd;
    @JsonProperty("zho")
    private Zho zho;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ara")
    public Ara getAra() {
        return ara;
    }

    @JsonProperty("ara")
    public void setAra(Ara ara) {
        this.ara = ara;
    }

    public Translations withAra(Ara ara) {
        this.ara = ara;
        return this;
    }

    @JsonProperty("bre")
    public Bre getBre() {
        return bre;
    }

    @JsonProperty("bre")
    public void setBre(Bre bre) {
        this.bre = bre;
    }

    public Translations withBre(Bre bre) {
        this.bre = bre;
        return this;
    }

    @JsonProperty("ces")
    public Ces getCes() {
        return ces;
    }

    @JsonProperty("ces")
    public void setCes(Ces ces) {
        this.ces = ces;
    }

    public Translations withCes(Ces ces) {
        this.ces = ces;
        return this;
    }

    @JsonProperty("cym")
    public Cym getCym() {
        return cym;
    }

    @JsonProperty("cym")
    public void setCym(Cym cym) {
        this.cym = cym;
    }

    public Translations withCym(Cym cym) {
        this.cym = cym;
        return this;
    }

    @JsonProperty("deu")
    public Deu getDeu() {
        return deu;
    }

    @JsonProperty("deu")
    public void setDeu(Deu deu) {
        this.deu = deu;
    }

    public Translations withDeu(Deu deu) {
        this.deu = deu;
        return this;
    }

    @JsonProperty("est")
    public Est getEst() {
        return est;
    }

    @JsonProperty("est")
    public void setEst(Est est) {
        this.est = est;
    }

    public Translations withEst(Est est) {
        this.est = est;
        return this;
    }

    @JsonProperty("fin")
    public Fin getFin() {
        return fin;
    }

    @JsonProperty("fin")
    public void setFin(Fin fin) {
        this.fin = fin;
    }

    public Translations withFin(Fin fin) {
        this.fin = fin;
        return this;
    }

    @JsonProperty("fra")
    public Fra getFra() {
        return fra;
    }

    @JsonProperty("fra")
    public void setFra(Fra fra) {
        this.fra = fra;
    }

    public Translations withFra(Fra fra) {
        this.fra = fra;
        return this;
    }

    @JsonProperty("hrv")
    public Hrv getHrv() {
        return hrv;
    }

    @JsonProperty("hrv")
    public void setHrv(Hrv hrv) {
        this.hrv = hrv;
    }

    public Translations withHrv(Hrv hrv) {
        this.hrv = hrv;
        return this;
    }

    @JsonProperty("hun")
    public Hun getHun() {
        return hun;
    }

    @JsonProperty("hun")
    public void setHun(Hun hun) {
        this.hun = hun;
    }

    public Translations withHun(Hun hun) {
        this.hun = hun;
        return this;
    }

    @JsonProperty("ita")
    public Ita getIta() {
        return ita;
    }

    @JsonProperty("ita")
    public void setIta(Ita ita) {
        this.ita = ita;
    }

    public Translations withIta(Ita ita) {
        this.ita = ita;
        return this;
    }

    @JsonProperty("jpn")
    public Jpn getJpn() {
        return jpn;
    }

    @JsonProperty("jpn")
    public void setJpn(Jpn jpn) {
        this.jpn = jpn;
    }

    public Translations withJpn(Jpn jpn) {
        this.jpn = jpn;
        return this;
    }

    @JsonProperty("kor")
    public Kor getKor() {
        return kor;
    }

    @JsonProperty("kor")
    public void setKor(Kor kor) {
        this.kor = kor;
    }

    public Translations withKor(Kor kor) {
        this.kor = kor;
        return this;
    }

    @JsonProperty("nld")
    public Nld getNld() {
        return nld;
    }

    @JsonProperty("nld")
    public void setNld(Nld nld) {
        this.nld = nld;
    }

    public Translations withNld(Nld nld) {
        this.nld = nld;
        return this;
    }

    @JsonProperty("per")
    public Per getPer() {
        return per;
    }

    @JsonProperty("per")
    public void setPer(Per per) {
        this.per = per;
    }

    public Translations withPer(Per per) {
        this.per = per;
        return this;
    }

    @JsonProperty("pol")
    public Pol getPol() {
        return pol;
    }

    @JsonProperty("pol")
    public void setPol(Pol pol) {
        this.pol = pol;
    }

    public Translations withPol(Pol pol) {
        this.pol = pol;
        return this;
    }

    @JsonProperty("por")
    public Por getPor() {
        return por;
    }

    @JsonProperty("por")
    public void setPor(Por por) {
        this.por = por;
    }

    public Translations withPor(Por por) {
        this.por = por;
        return this;
    }

    @JsonProperty("rus")
    public Rus getRus() {
        return rus;
    }

    @JsonProperty("rus")
    public void setRus(Rus rus) {
        this.rus = rus;
    }

    public Translations withRus(Rus rus) {
        this.rus = rus;
        return this;
    }

    @JsonProperty("slk")
    public Slk getSlk() {
        return slk;
    }

    @JsonProperty("slk")
    public void setSlk(Slk slk) {
        this.slk = slk;
    }

    public Translations withSlk(Slk slk) {
        this.slk = slk;
        return this;
    }

    @JsonProperty("spa")
    public Spa getSpa() {
        return spa;
    }

    @JsonProperty("spa")
    public void setSpa(Spa spa) {
        this.spa = spa;
    }

    public Translations withSpa(Spa spa) {
        this.spa = spa;
        return this;
    }

    @JsonProperty("srp")
    public Srp getSrp() {
        return srp;
    }

    @JsonProperty("srp")
    public void setSrp(Srp srp) {
        this.srp = srp;
    }

    public Translations withSrp(Srp srp) {
        this.srp = srp;
        return this;
    }

    @JsonProperty("swe")
    public Swe getSwe() {
        return swe;
    }

    @JsonProperty("swe")
    public void setSwe(Swe swe) {
        this.swe = swe;
    }

    public Translations withSwe(Swe swe) {
        this.swe = swe;
        return this;
    }

    @JsonProperty("tur")
    public Tur getTur() {
        return tur;
    }

    @JsonProperty("tur")
    public void setTur(Tur tur) {
        this.tur = tur;
    }

    public Translations withTur(Tur tur) {
        this.tur = tur;
        return this;
    }

    @JsonProperty("urd")
    public Urd getUrd() {
        return urd;
    }

    @JsonProperty("urd")
    public void setUrd(Urd urd) {
        this.urd = urd;
    }

    public Translations withUrd(Urd urd) {
        this.urd = urd;
        return this;
    }

    @JsonProperty("zho")
    public Zho getZho() {
        return zho;
    }

    @JsonProperty("zho")
    public void setZho(Zho zho) {
        this.zho = zho;
    }

    public Translations withZho(Zho zho) {
        this.zho = zho;
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

    public Translations withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Translations.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ara");
        sb.append('=');
        sb.append(((this.ara == null)?"<null>":this.ara));
        sb.append(',');
        sb.append("bre");
        sb.append('=');
        sb.append(((this.bre == null)?"<null>":this.bre));
        sb.append(',');
        sb.append("ces");
        sb.append('=');
        sb.append(((this.ces == null)?"<null>":this.ces));
        sb.append(',');
        sb.append("cym");
        sb.append('=');
        sb.append(((this.cym == null)?"<null>":this.cym));
        sb.append(',');
        sb.append("deu");
        sb.append('=');
        sb.append(((this.deu == null)?"<null>":this.deu));
        sb.append(',');
        sb.append("est");
        sb.append('=');
        sb.append(((this.est == null)?"<null>":this.est));
        sb.append(',');
        sb.append("fin");
        sb.append('=');
        sb.append(((this.fin == null)?"<null>":this.fin));
        sb.append(',');
        sb.append("fra");
        sb.append('=');
        sb.append(((this.fra == null)?"<null>":this.fra));
        sb.append(',');
        sb.append("hrv");
        sb.append('=');
        sb.append(((this.hrv == null)?"<null>":this.hrv));
        sb.append(',');
        sb.append("hun");
        sb.append('=');
        sb.append(((this.hun == null)?"<null>":this.hun));
        sb.append(',');
        sb.append("ita");
        sb.append('=');
        sb.append(((this.ita == null)?"<null>":this.ita));
        sb.append(',');
        sb.append("jpn");
        sb.append('=');
        sb.append(((this.jpn == null)?"<null>":this.jpn));
        sb.append(',');
        sb.append("kor");
        sb.append('=');
        sb.append(((this.kor == null)?"<null>":this.kor));
        sb.append(',');
        sb.append("nld");
        sb.append('=');
        sb.append(((this.nld == null)?"<null>":this.nld));
        sb.append(',');
        sb.append("per");
        sb.append('=');
        sb.append(((this.per == null)?"<null>":this.per));
        sb.append(',');
        sb.append("pol");
        sb.append('=');
        sb.append(((this.pol == null)?"<null>":this.pol));
        sb.append(',');
        sb.append("por");
        sb.append('=');
        sb.append(((this.por == null)?"<null>":this.por));
        sb.append(',');
        sb.append("rus");
        sb.append('=');
        sb.append(((this.rus == null)?"<null>":this.rus));
        sb.append(',');
        sb.append("slk");
        sb.append('=');
        sb.append(((this.slk == null)?"<null>":this.slk));
        sb.append(',');
        sb.append("spa");
        sb.append('=');
        sb.append(((this.spa == null)?"<null>":this.spa));
        sb.append(',');
        sb.append("srp");
        sb.append('=');
        sb.append(((this.srp == null)?"<null>":this.srp));
        sb.append(',');
        sb.append("swe");
        sb.append('=');
        sb.append(((this.swe == null)?"<null>":this.swe));
        sb.append(',');
        sb.append("tur");
        sb.append('=');
        sb.append(((this.tur == null)?"<null>":this.tur));
        sb.append(',');
        sb.append("urd");
        sb.append('=');
        sb.append(((this.urd == null)?"<null>":this.urd));
        sb.append(',');
        sb.append("zho");
        sb.append('=');
        sb.append(((this.zho == null)?"<null>":this.zho));
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
        result = ((result* 31)+((this.hun == null)? 0 :this.hun.hashCode()));
        result = ((result* 31)+((this.swe == null)? 0 :this.swe.hashCode()));
        result = ((result* 31)+((this.zho == null)? 0 :this.zho.hashCode()));
        result = ((result* 31)+((this.est == null)? 0 :this.est.hashCode()));
        result = ((result* 31)+((this.fin == null)? 0 :this.fin.hashCode()));
        result = ((result* 31)+((this.pol == null)? 0 :this.pol.hashCode()));
        result = ((result* 31)+((this.kor == null)? 0 :this.kor.hashCode()));
        result = ((result* 31)+((this.ces == null)? 0 :this.ces.hashCode()));
        result = ((result* 31)+((this.tur == null)? 0 :this.tur.hashCode()));
        result = ((result* 31)+((this.ara == null)? 0 :this.ara.hashCode()));
        result = ((result* 31)+((this.rus == null)? 0 :this.rus.hashCode()));
        result = ((result* 31)+((this.por == null)? 0 :this.por.hashCode()));
        result = ((result* 31)+((this.bre == null)? 0 :this.bre.hashCode()));
        result = ((result* 31)+((this.fra == null)? 0 :this.fra.hashCode()));
        result = ((result* 31)+((this.deu == null)? 0 :this.deu.hashCode()));
        result = ((result* 31)+((this.ita == null)? 0 :this.ita.hashCode()));
        result = ((result* 31)+((this.per == null)? 0 :this.per.hashCode()));
        result = ((result* 31)+((this.spa == null)? 0 :this.spa.hashCode()));
        result = ((result* 31)+((this.urd == null)? 0 :this.urd.hashCode()));
        result = ((result* 31)+((this.nld == null)? 0 :this.nld.hashCode()));
        result = ((result* 31)+((this.jpn == null)? 0 :this.jpn.hashCode()));
        result = ((result* 31)+((this.hrv == null)? 0 :this.hrv.hashCode()));
        result = ((result* 31)+((this.srp == null)? 0 :this.srp.hashCode()));
        result = ((result* 31)+((this.slk == null)? 0 :this.slk.hashCode()));
        result = ((result* 31)+((this.cym == null)? 0 :this.cym.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Translations) == false) {
            return false;
        }
        Translations rhs = ((Translations) other);
        return (((((((((((((((((((((((((((this.hun == rhs.hun)||((this.hun!= null)&&this.hun.equals(rhs.hun)))&&((this.swe == rhs.swe)||((this.swe!= null)&&this.swe.equals(rhs.swe))))&&((this.zho == rhs.zho)||((this.zho!= null)&&this.zho.equals(rhs.zho))))&&((this.est == rhs.est)||((this.est!= null)&&this.est.equals(rhs.est))))&&((this.fin == rhs.fin)||((this.fin!= null)&&this.fin.equals(rhs.fin))))&&((this.pol == rhs.pol)||((this.pol!= null)&&this.pol.equals(rhs.pol))))&&((this.kor == rhs.kor)||((this.kor!= null)&&this.kor.equals(rhs.kor))))&&((this.ces == rhs.ces)||((this.ces!= null)&&this.ces.equals(rhs.ces))))&&((this.tur == rhs.tur)||((this.tur!= null)&&this.tur.equals(rhs.tur))))&&((this.ara == rhs.ara)||((this.ara!= null)&&this.ara.equals(rhs.ara))))&&((this.rus == rhs.rus)||((this.rus!= null)&&this.rus.equals(rhs.rus))))&&((this.por == rhs.por)||((this.por!= null)&&this.por.equals(rhs.por))))&&((this.bre == rhs.bre)||((this.bre!= null)&&this.bre.equals(rhs.bre))))&&((this.fra == rhs.fra)||((this.fra!= null)&&this.fra.equals(rhs.fra))))&&((this.deu == rhs.deu)||((this.deu!= null)&&this.deu.equals(rhs.deu))))&&((this.ita == rhs.ita)||((this.ita!= null)&&this.ita.equals(rhs.ita))))&&((this.per == rhs.per)||((this.per!= null)&&this.per.equals(rhs.per))))&&((this.spa == rhs.spa)||((this.spa!= null)&&this.spa.equals(rhs.spa))))&&((this.urd == rhs.urd)||((this.urd!= null)&&this.urd.equals(rhs.urd))))&&((this.nld == rhs.nld)||((this.nld!= null)&&this.nld.equals(rhs.nld))))&&((this.jpn == rhs.jpn)||((this.jpn!= null)&&this.jpn.equals(rhs.jpn))))&&((this.hrv == rhs.hrv)||((this.hrv!= null)&&this.hrv.equals(rhs.hrv))))&&((this.srp == rhs.srp)||((this.srp!= null)&&this.srp.equals(rhs.srp))))&&((this.slk == rhs.slk)||((this.slk!= null)&&this.slk.equals(rhs.slk))))&&((this.cym == rhs.cym)||((this.cym!= null)&&this.cym.equals(rhs.cym))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
