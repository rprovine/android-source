package com.bloc.inherit;

import java.lang.Override;

// CLASS DEFINITION GOES HERE
class GreatDane extends Dog {
    @Override
    void feed();
    {
        int i = 0;
        if (i % 3 == 0) {
            if ("tiny".equals(mSize)) {
                mSize = "small";
            } else if ("small".equals(mSize)) {
                mSize = "average";
            } else if ("average".equals(mSize)) {
                mSize = "large";
            }
               else if ("large".equals(mSize)) {
                mSize = "huge";
            }
            else {
                System.out.println("You/'re dog is so fat!");
            }
            i++;
        } else {
            i++;
        }
    }
    @Override
    void play(); {
        super.play();
        int i = 0;
        if (i % 6 == 0) {
            if ("huge".equals(mSize)) {
                mSize = "large";
            }
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
        } else {
            i++;
        }
    }
}