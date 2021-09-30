
package com.example.specex;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Payload {

    @SerializedName("payload_id")
    @Expose
    private String payloadId;
    @SerializedName("norad_id")
    @Expose
    private List<Object> noradId = null;
    @SerializedName("reused")
    @Expose
    private Boolean reused;
    @SerializedName("customers")
    @Expose
    private List<String> customers = null;
    @SerializedName("nationality")
    @Expose
    private String nationality;
    @SerializedName("manufacturer")
    @Expose
    private String manufacturer;
    @SerializedName("payload_type")
    @Expose
    private String payloadType;
    @SerializedName("payload_mass_kg")
    @Expose
    private Integer payloadMassKg;
    @SerializedName("payload_mass_lbs")
    @Expose
    private Integer payloadMassLbs;
    @SerializedName("orbit")
    @Expose
    private String orbit;
    @SerializedName("orbit_params")
    @Expose
    private OrbitParams orbitParams;
    @SerializedName("cap_serial")
    @Expose
    private String capSerial;
    @SerializedName("mass_returned_kg")
    @Expose
    private Object massReturnedKg;
    @SerializedName("mass_returned_lbs")
    @Expose
    private Object massReturnedLbs;
    @SerializedName("flight_time_sec")
    @Expose
    private Integer flightTimeSec;
    @SerializedName("cargo_manifest")
    @Expose
    private String cargoManifest;

    public String getPayloadId() {
        return payloadId;
    }

    public void setPayloadId(String payloadId) {
        this.payloadId = payloadId;
    }

    public List<Object> getNoradId() {
        return noradId;
    }

    public void setNoradId(List<Object> noradId) {
        this.noradId = noradId;
    }

    public Boolean getReused() {
        return reused;
    }

    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    public List<String> getCustomers() {
        return customers;
    }

    public void setCustomers(List<String> customers) {
        this.customers = customers;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPayloadType() {
        return payloadType;
    }

    public void setPayloadType(String payloadType) {
        this.payloadType = payloadType;
    }

    public Integer getPayloadMassKg() {
        return payloadMassKg;
    }

    public void setPayloadMassKg(Integer payloadMassKg) {
        this.payloadMassKg = payloadMassKg;
    }

    public Integer getPayloadMassLbs() {
        return payloadMassLbs;
    }

    public void setPayloadMassLbs(Integer payloadMassLbs) {
        this.payloadMassLbs = payloadMassLbs;
    }

    public String getOrbit() {
        return orbit;
    }

    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

    public OrbitParams getOrbitParams() {
        return orbitParams;
    }

    public void setOrbitParams(OrbitParams orbitParams) {
        this.orbitParams = orbitParams;
    }

    public String getCapSerial() {
        return capSerial;
    }

    public void setCapSerial(String capSerial) {
        this.capSerial = capSerial;
    }

    public Object getMassReturnedKg() {
        return massReturnedKg;
    }

    public void setMassReturnedKg(Object massReturnedKg) {
        this.massReturnedKg = massReturnedKg;
    }

    public Object getMassReturnedLbs() {
        return massReturnedLbs;
    }

    public void setMassReturnedLbs(Object massReturnedLbs) {
        this.massReturnedLbs = massReturnedLbs;
    }

    public Integer getFlightTimeSec() {
        return flightTimeSec;
    }

    public void setFlightTimeSec(Integer flightTimeSec) {
        this.flightTimeSec = flightTimeSec;
    }

    public String getCargoManifest() {
        return cargoManifest;
    }

    public void setCargoManifest(String cargoManifest) {
        this.cargoManifest = cargoManifest;
    }

}
