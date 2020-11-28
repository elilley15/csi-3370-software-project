package edu.oakland.production.display01;

import edu.oakland.helper.admin.Satellite;

public interface DisplayGpsInterface {

  public boolean receiveGpsSignal(Satellite satelliteSignal);

  public String reportGpsSignalLoss(String satelliteName);

  public int recheckSignalStrength(String satelliteName);

  public int checkSignalStrength(String satelliteName);

}
