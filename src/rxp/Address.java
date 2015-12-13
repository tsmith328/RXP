package rxp;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Abstraction of IP addresses and port numbers.
 *
 * @author Tyler Smith
 */
class Address {
    private int port;
    private InetAddress ip;

    public Address() {
        this("127.0.0.1", 3000);
    }

    public Address(String host, int port) {
        this.port = port;
        try {
            this.ip = InetAddress.getByName(host);
        } catch (UnknownHostException e) {
            //TODO: Handle unknown host.
        }
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public byte[] getIP() {
        return ip.getAddress();
    }

    public void setIP(byte[] ip) {
        try {
            this.ip = InetAddress.getByAddress(ip);
        } catch (UnknownHostException e) {
            return;
        }
    }
}
