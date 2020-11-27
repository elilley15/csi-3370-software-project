package edu.oakland.production.database;

import edu.oakland.helper.admin.LocationDataPoint;

public interface DatabaseGisManagerInterface {

  public void passStoreRequest(LocationDataPoint locationDataPoint);
  
  public void passModeRequest(String mode);
  
  public String passNextSatRequest(String currentSat);
  
}