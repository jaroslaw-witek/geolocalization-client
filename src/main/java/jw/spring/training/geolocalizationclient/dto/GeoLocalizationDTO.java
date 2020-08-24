package jw.spring.training.geolocalizationclient.dto;

import jw.spring.training.geolocalizationclient.entities.Geolocalization;

import javax.validation.constraints.Pattern;
import java.util.Date;

public class GeoLocalizationDTO {

    private Long deviceId;

    @Pattern(regexp = "^([0-9]+(\\.[0-9]+)?)")
    private String latitude;

    @Pattern(regexp = "^([0-9]+(\\.[0-9]+)?)")
    private String longitude;

    private Date logDate;

    public GeoLocalizationDTO(){

    }

    public GeoLocalizationDTO(Geolocalization geoLocalization){
        this.deviceId = geoLocalization.getDeviceid();
        this.latitude = geoLocalization.getLatitude();
        this.longitude = geoLocalization.getLongitude();
        this.logDate = geoLocalization.getLogdate();
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    @Override
    public String toString() {
        return "GeoLocalizationDTO{" +
                "deviceId=" + deviceId +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", logDate=" + logDate +
                '}';
    }
}
