package edu.oakland.production.middleware02;

import edu.oakland.helper.admin.TrackData;
import edu.oakland.production.middleware02.MiddlewareCommInterface;

public class MiddlewareCommInterfaceImplementation implements MiddlewareCommInterface {
    int rfid;

    public TrackData requestRfid(int rfid){

      this.rfid = rfid;
      return new TrackData();
    }
  
    public int getRfid(){
        return rfid;
    }
  
} 
