package model.weather;

import io.netty.handler.codec.spdy.SpdyHttpResponseStreamIdHandler;

public class Minutely {
    private long id;
    private int precipitation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(int precipitation) {
        this.precipitation = precipitation;
    }
}
