package pl.edu.pjwstk.jazs20499nbp.model;

import java.security.Timestamp;
import java.util.Date;

public class Data {
    private Long id;
    private Resources resources;
    private java.util.Date startData;
    private java.util.Date endData;
    private int exchangeRate;
    private Timestamp queueTime;

    public Data(Long id, Resources resources, Date startData, Date endData, int exchangeRate, Timestamp queueTime) {
        this.id = id;
        this.resources = resources;
        this.startData = startData;
        this.endData = endData;
        this.exchangeRate = exchangeRate;
        this.queueTime = queueTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public Date getStartData() {
        return startData;
    }

    public void setStartData(Date startData) {
        this.startData = startData;
    }

    public Date getEndData() {
        return endData;
    }

    public void setEndData(Date endData) {
        this.endData = endData;
    }

    public int getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(int exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Timestamp getQueueTime() {
        return queueTime;
    }

    public void setQueueTime(Timestamp queueTime) {
        this.queueTime = queueTime;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", resources=" + resources +
                ", startData=" + startData +
                ", endData=" + endData +
                ", exchangeRate=" + exchangeRate +
                ", queueTime=" + queueTime +
                '}';
    }
}
