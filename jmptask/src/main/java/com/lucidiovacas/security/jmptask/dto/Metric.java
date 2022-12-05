package com.lucidiovacas.security.jmptask.dto;

import lombok.Data;

@Data
public class Metric {

    private String osName;
    private String osVersion;
    private long totalMemInBytes;
    private long usedMemInBytes;

    public Metric() {
        this.osName = System.getProperty("os.name");
        this.osVersion = System.getProperty("os.version");
        this.totalMemInBytes = Runtime.getRuntime().totalMemory();
        this.usedMemInBytes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }
}
