package com.bloc.inherit;

import java.lang.Override;

// CLASS DEFINITION GOES HERE
class GoldenRetriever extends Dog {
    @Override
    void play() {
        super.play();
        int i = 0;
        if (i % 3 == 0) {
        if ("large".equals(mSize)) {
        mSize = "average";
        }
        if ("average".equals(mSize)) {
        mSize = "small";
        }
        if ("small".equals(mSize)) {
        mSize = "tiny";
        } else {
        System.out.println("You/'re dog is already tiny!");
        }
        i++;
        }
        else {
        i++;
            }

    }
}