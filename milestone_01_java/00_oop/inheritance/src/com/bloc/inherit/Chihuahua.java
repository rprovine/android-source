package com.bloc.inherit;

// CLASS DEFINITION GOES HERE
class Chihuahua extends Dog {

    int mChihuahaFeedCount = 0;

    @Override
    void feed() {
        mChihuahaFeedCount++;
        if (mChihuahaFeedCount % 5 == 0) {
            if ("tiny".equals(mSize)) {
                mSize = "small";
            } else if ("small".equals(mSize)) {
                mSize = "average";
            } else if ("average".equals(mSize)) {
                mSize = "large";
            } else {
                System.out.println("You/'re dog is so fat!");
            }
        }
    }
}
