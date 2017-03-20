package com.vach.sample;

import com.vach.common.proto.Currency;

public class ProtoTest {

    public static void main(String[] args) {
        Currency btc = Currency.newBuilder().setSymbol("BTC").build();

        System.out.println(btc);
    }

}
