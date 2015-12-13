package rxp;

/**
 * Acts as a representation of an RXP packet for use within the logic of this
 * module.
 */
class Packet {
    private Address source;
    private Address dest;
    private int seqNum;
    private int numSeg;
    private int checksum;
    private int window;
    private int payloadSize;
    private int flags;
    private byte[] payload;

    public void setSource(Address source) {
        this.source = source;
    }

    public void setDest(Address dest) {
        this.dest = dest;
    }

    public void setSeqNum(int seqNum) {
        this.seqNum = seqNum;
    }

    public void setNumSeg(int numSeg) {
        this.numSeg = numSeg;
    }

    public void setChecksum(int checksum) {
        this.checksum = checksum;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public void setPayloadSize(int payloadSize) {
        this.payloadSize = payloadSize;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public void setPayload(byte[] payload) {
        this.payload = payload;
    }
}
