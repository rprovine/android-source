package com.bloc.inherit;

import java.lang.Override;

// CLASS DEFINITION GOES HERE
class GreatDane extends Dog {

    int mGreatDaneFeedCount = 0;

    @Override
    void feed() {
        mGreatDaneFeedCount++;
        if (mGreatDaneFeedCount % 3 == 0) {
            if ("tiny".equals(mSize)) {
                mSize = "small";
            } else if ("small".equals(mSize)) {
                mSize = "average";
            } else if ("average".equals(mSize)) {
                mSize = "large";
            } else if ("large".equals(mSize)) {
                mSize = "huge";
            } else {
                System.out.println("You/'re dog is so fat!");
            }
        }
    }

}

