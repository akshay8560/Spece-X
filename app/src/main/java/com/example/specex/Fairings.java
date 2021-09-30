
package com.example.specex;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fairings {

    @SerializedName("reused")
    @Expose
    private Boolean reused;
    @SerializedName("recovery_attempt")
    @Expose
    private Boolean recoveryAttempt;
    @SerializedName("recovered")
    @Expose
    private Boolean recovered;
    @SerializedName("ship")
    @Expose
    private Object ship;

    public Boolean getReused() {
        return reused;
    }

    public void setReused(Boolean reused) {
        this.reused = reused;
    }

    public Boolean getRecoveryAttempt() {
        return recoveryAttempt;
    }

    public void setRecoveryAttempt(Boolean recoveryAttempt) {
        this.recoveryAttempt = recoveryAttempt;
    }

    public Boolean getRecovered() {
        return recovered;
    }

    public void setRecovered(Boolean recovered) {
        this.recovered = recovered;
    }

    public Object getShip() {
        return ship;
    }

    public void setShip(Object ship) {
        this.ship = ship;
    }

}
