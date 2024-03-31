/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialization;

import java.io.Serializable;
/**
 *
 * @author Humam Asathin H
 */
public class IpConfig implements Serializable{
    String ipConfig;
    String ipAddress;
    String dnsServer;
    
    public IpConfig(String ipConfig, String ipAddress, String dnsServer){
        this.ipConfig = ipConfig;
        this.ipAddress = ipAddress;
        this.dnsServer = dnsServer;
    }
        @Override
        public String toString(){
            return "\r\nIP Configuration=" + ipConfig + "\r\nIP Address=" + ipAddress + "\r\nDNS Server=" + dnsServer + "\r\n";
        }
}
