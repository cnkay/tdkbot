
package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "error",
        "madde_id",
        "kac",
        "kelime_no",
        "cesit",
        "anlam_gor",
        "on_taki",
        "madde",
        "cesit_say",
        "anlam_say",
        "taki",
        "cogul_mu",
        "ozel_mi",
        "lisan_kodu",
        "lisan",
        "telaffuz",
        "birlesikler",
        "font",
        "madde_duz",
        "gosterim_tarihi",
        "anlamlarListe",
        "atasozu"
})
public class Word {
    @JsonProperty("error")
    public String error;
    @JsonProperty("madde_id")
    public String maddeId;
    @JsonProperty("kac")
    public String kac;
    @JsonProperty("kelime_no")
    public String kelimeNo;
    @JsonProperty("cesit")
    public String cesit;
    @JsonProperty("anlam_gor")
    public String anlamGor;
    @JsonProperty("on_taki")
    public Object onTaki;
    @JsonProperty("madde")
    public String madde;
    @JsonProperty("cesit_say")
    public String cesitSay;
    @JsonProperty("anlam_say")
    public String anlamSay;
    @JsonProperty("taki")
    public Object taki;
    @JsonProperty("cogul_mu")
    public String cogulMu;
    @JsonProperty("ozel_mi")
    public String ozelMi;
    @JsonProperty("lisan_kodu")
    public String lisanKodu;
    @JsonProperty("lisan")
    public String lisan;
    @JsonProperty("telaffuz")
    public Object telaffuz;
    @JsonProperty("birlesikler")
    public String birlesikler;
    @JsonProperty("font")
    public Object font;
    @JsonProperty("madde_duz")
    public String maddeDuz;
    @JsonProperty("gosterim_tarihi")
    public Object gosterimTarihi;
    @JsonProperty("anlamlarListe")
    public List<AnlamlarListe> anlamlarListe = null;
    @JsonProperty("atasozu")
    public List<Atasozu> atasozu = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
