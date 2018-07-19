package com.kuma.ribbon.timer;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by yuan on 2018/7/18.
 */
public class DefaultPingStratedy implements IPingStratedy {

    private String urlStr="http://localhost:8080/";

    @Override
    public boolean pingServer() {
        System.out.println(System.currentTimeMillis()+"defaultPingStratedy - ping - server!!");

        boolean isAlive = false;
        HttpClient httpClient = new DefaultHttpClient();
        HttpUriRequest getRequest = new HttpGet(urlStr);
        String content = null;

        HttpResponse response = null;
        try {
            response = httpClient.execute(getRequest);
            content = EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            //todo log
            return false;
        }
        isAlive = response.getStatusLine().getStatusCode() == 200;

        return isAlive;
    }

}
