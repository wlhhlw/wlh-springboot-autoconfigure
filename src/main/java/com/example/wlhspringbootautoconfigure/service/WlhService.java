package com.example.wlhspringbootautoconfigure.service;

import com.example.wlhspringbootautoconfigure.properties.WlhProperties;

public class WlhService {
    private WlhProperties wlhProperties;

   public WlhService(){

    }

   public WlhService(WlhProperties wlhProperties){
        this.wlhProperties=wlhProperties;
    }
    public String test(){
      return  wlhProperties.getName();
    }
}
