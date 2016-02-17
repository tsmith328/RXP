package rxp;

/**
 * Acts as a representation of an RXP packet for use within the logic of this
 * module.
 */
class Packet {
    private static final int SIZE = 512;
    private Address source;
    private Address dest;
    private int seqNum;
    private int numSeg;
    private int checksum;
    private int window;
    private int payloadSize;
    private int flags;
    private byte[] payload;
    
    public Packet() {
        // Create an empty packet
        this(new Address(), new Address(), 0, 0, 0, 0, new byte[0]);
    }
    
    public Packet(Address source, Address dest, int seqNum, int window, int payloadSize, int flags, byte[] payload) {
        this.source = source;
        this.dest = dest;
        this.seqNum = seqNum;
        this.window = window;
        this.payloadSize = payloadSize;
        this.flags = flags;
        this.payload = payload;
        this.checksum = calcChecksum(this);
    }

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
    
    public void setPayload(String payload) {
        //String representation of byte array
    }

    public Address getSource() {
        return source;
    }

    public Address getDest() {
        return dest;
    }

    public int getSeqNum() {
        return seqNum;
    }

    public int getNumSeg() {
        return numSeg;
    }

    public int getWindow() {
        return window;
    }

    public int getPayloadSize() {
        return payloadSize;
    }

    public int getFlags() {
        return flags;
    }

    public byte[] getPayload() {
        return payload;
    }

    public String toString() {
        return this.source.toString() + this.dest + this.seqNum + this.numSeg + this.checksum + this.window
                + this.payloadSize + this.flags + this.payload;
    }
    
    public byte[] toByteArray() {
        byte[] arr = new byte[SIZE];
        
    }
    
    private static int calcChecksum(Packet p) {
        int checksum = 0;
        //TODO: Implement checksum algorithm
        return checksum;
    }
}
