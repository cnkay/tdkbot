
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
    "ornek_id",
    "anlam_id",
    "ornek_sira",
    "ornek",
    "kac",
    "yazar_id",
    "yazar"
})
public class OrneklerListe {

    @JsonProperty("ornek_id")
    public String ornekId;
    @JsonProperty("anlam_id")
    public String anlamId;
    @JsonProperty("ornek_sira")
    public String ornekSira;
    @JsonProperty("ornek")
    public String ornek;
    @JsonProperty("kac")
    public String kac;
    @JsonProperty("yazar_id")
    public String yazarId;
    @JsonProperty("yazar")
    public List<Yazar> yazar = null;
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
