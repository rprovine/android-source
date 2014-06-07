package com.bloc.inherit;

import java.lang.Override;

// CLASS DEFINITION GOES HERE
class GoldenRetriever extends Dog {

    int mGoldenRetrieverPlayCount = 0;

    @Override
    void play() {
        mGoldenRetrieverPlayCount++;
        if (mGoldenRetrieverPlayCount % 3 == 0) {
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

        }
        else {
            mGoldenRetrieverPlayCount++;
        }

    }
}