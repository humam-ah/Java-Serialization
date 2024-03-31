/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialization;

import java.io.Serializable;
import java.util.List;
/**
 *
 * @author Humam Asathin H
 */
public class PC implements Serializable{
    private transient String id;
    private static String nama;
    private List<IpConfig> ips;
    public void setId(String id) {
        this.id = id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setItems(List<IpConfig> ips) {
        this.ips = ips;
    }
    @Override
    public String toString() {
        String pc, ip = "";
        pc = "PC: \r\n"
            + "ID PC=" + id + "\r\n"
            + "Nama PC=" + nama + "\r\n"
            + "=======================\r\n"
            + "IP Configuration:\r\n";
        ip = ips.stream().map((obj) ->
obj.toString()).reduce(ip, String::concat);
        return pc + ip;
    }
}
