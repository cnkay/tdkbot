
package com.example.demo.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "anlam_id",
    "madde_id",
    "anlam_sira",
    "fiil",
    "tipkes",
    "anlam",
    "gos",
    "orneklerListe",
    "ozelliklerListe"
})
public class AnlamlarListe {

    @JsonProperty("anlam_id")
    public String anlamId;
    @JsonProperty("madde_id")
    public String maddeId;
    @JsonProperty("anlam_sira")
    public String anlamSira;
    @JsonProperty("fiil")
    public String fiil;
    @JsonProperty("tipkes")
    public String tipkes;
    @JsonProperty("anlam")
    public String anlam;
    @JsonProperty("gos")
    public String gos;
    @JsonProperty("orneklerListe")
    public List<OrneklerListe> orneklerListe = null;
    @JsonProperty("ozelliklerListe")
    public List<OzelliklerListe> ozelliklerListe = null;
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
