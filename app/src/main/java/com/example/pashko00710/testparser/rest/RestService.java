package com.example.pashko00710.testparser.rest;import android.util.Log;import com.example.pashko00710.testparser.rest.model.ImeiModel;import com.example.pashko00710.testparser.rest.model.PeoplesModel;import java.util.ArrayList;public class RestService {    private RestClient restClient;    public RestService() {        restClient = new RestClient();    }    public ArrayList<PeoplesModel> getPeoples() {        return restClient.getPeoplesApi().getPeoples();    }    public PeoplesModel getItemPeople(String id) {        return restClient.getPeoplesApi().getItemPeople(id);    }    public ImeiModel sendImei(String upload) {        Log.d("here2", upload);        return restClient.getPeoplesApi().sendImei(upload);    }}