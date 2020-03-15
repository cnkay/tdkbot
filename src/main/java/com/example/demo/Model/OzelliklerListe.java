
package com.example.demo.Model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ozellik_id",
    "tur",
    "tam_adi",
    "kisa_adi",
    "ekno"
})
public class OzelliklerListe {

    @JsonProperty("ozellik_id")
    public String ozellikId;
    @JsonProperty("tur")
    public String tur;
    @JsonProperty("tam_adi")
    public String tamAdi;
    @JsonProperty("kisa_adi")
    public String kisaAdi;
    @JsonProperty("ekno")
    public String ekno;
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
