package edu.oakland.test.middleware02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import edu.oakland.production.middleware02.MiddlewareCommInterface;
import edu.oakland.production.middleware02.MiddlewareCommInterfaceImplementation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(" Rfid Rquest Test")
public class RequestRfidTest{
    
    @Test
    @DisplayName("Rfid In Is the same Rfid Out")
    void RfidInIsRfidOut(){
        int RanRfid = (int)(Math.floor(100000 + Math.random() * 900000));
        MiddlewareCommInterfaceImplementation Rfid = new MiddlewareCommInterfaceImplementation(RanRfid);
        assertEquals(RanRfid, Rfid.getRfid());

    }
}
