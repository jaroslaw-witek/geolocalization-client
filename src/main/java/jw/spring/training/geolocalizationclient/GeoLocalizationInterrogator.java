package jw.spring.training.geolocalizationclient;

import jw.spring.training.geolocalizationclient.dto.GeoLocalizationDTO;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class GeoLocalizationInterrogator {

    @EventListener(ApplicationReadyEvent.class)
    public void dumpGeoLocalizations(){
        RestTemplate restTemplate = new RestTemplate();
        String geoLocalizationsURL
                = "http://localhost:9001/api/geo-localizations?offset=0&pageNumber=0&pageSize=1&paged=false&sort.sorted=false";

        List<GeoLocalizationDTO>  geoLocalizations = restTemplate.exchange(geoLocalizationsURL,
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<GeoLocalizationDTO>>() {
                        }).getBody();

        geoLocalizations.forEach(geoLocalizationDTO -> System.out.println(geoLocalizationDTO.toString()));

    }
}
