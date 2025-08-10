package com.fonseca.algasensors.device.management.common;

import io.hypersistence.tsid.TSID;

import java.util.Optional;

public class IdGenerator {

    private static  final TSID.Factory tsFACTORY;

    private IdGenerator(){
    }

    static {
        Optional.ofNullable(System.getenv("tsid.node"))
            .ifPresent(tsidNode -> System.setProperty("tsid.node", tsidNode));

        Optional.ofNullable(System.getenv("tsid.node.count"))
                .ifPresent(tsidNodeCount -> System.setProperty("tsid.node.count", tsidNodeCount));
        tsFACTORY = TSID.Factory.builder().build();
    }

    public  static TSID generateTsid(){
        return tsFACTORY.generate();
    }
}
