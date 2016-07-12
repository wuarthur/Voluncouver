package models;

import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ProtocolCommandListener;
import org.apache.commons.net.ftp.FTPClient;

import java.io.PrintWriter;

/**
 * Created by Yi on 7/11/2016.
 */
public class RuntimeFTP {

    public void run() {
        int port1 = 0, port2 = 0;
        FTPClient ftp1, ftp2;
        ProtocolCommandListener listener;
        listener = new PrintCommandListener(new PrintWriter(System.out), true);
        ftp1 = new FTPClient();
        ftp1.addProtocolCommandListener(listener);



    }






}
