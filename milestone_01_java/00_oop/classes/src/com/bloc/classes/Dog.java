package com.bloc.classes;


class Dog {
    // The weight gained every time a dog is fed
    final float WEIGHT_GAIN = 0.25f;
    // The weight lost every time a dog plays
    final float WEIGHT_LOSS = 0.4f;

    // Hair length
    float mHairLength;
    // Gender, either "male" or "female"
    String mGender;
    // Size, either "tiny", "small", "average", or "large"
    String mSize;
    // Its age
    int mAge;
    // Its weight in pounds
    float mWeight;
    // The color of its coat
    String mColor;

    // ADD MEMBER VARIABLES HERE IF NECESSARY
    int mFeedCount;
    int mPlayCount;
    /*
     * getHairLength
     * @return this Dog's hair length
     */
    // ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
    float getHairLength() {
        return mHairLength;
    }

    /*
     * setHairLength
     * Sets the length of the Dog's hair
     * @param hairLength the new length of the hair, a float
     * @return nothing
     */
    // ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
    void setHairLength(float hairLength) {
        mHairLength = hairLength;
    }


    /*
     * getGender
     * @return this Dog's gender
     */
    // ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
    String getGender() {
        return mGender;
    }

    /*
     * setGender
     * Sets this Dog's gender
     * @param gender the new gender of the Dog, a String
     * @return nothing
     */
    // ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
    void setGender(String Gender) {
        mGender = Gender;
    }

    /*
     * getSize
     * @return the size of the dog
     */
    // ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
    String getSize() {
        return mSize;
    }

    /*
     * setSize
     * Sets the size of the Dog
     * @param size the new size of the Dog, a String
     * @return nothing
     */
    // ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
    void setSize(String Size) {
        mSize = Size;
    }

    /*
     * getAge
     * @return this Dog's age
     */
    // ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
    int getAge() {
        return mAge;
    }

    /*
     * setAge
     * Sets the age of the Dog
     * @param age the new age of the Dog, an int
     * @return nothing
     */
    // ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
    void setAge(int Age) {
        mAge = Age;
    }

    /*
     * getWeight
     * @return this Dog's weight
     */
    // ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
    float getWeight() {
        return mWeight;
    }

    /*
     * setWeight
     * Sets the weight of the Dog
     * @param weight the new weight of the Dog, a float
     * @return nothing
     */
    // ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
    void setWeight(float Weight) {
        mWeight = Weight;
    }

    /*
     * getColor
     * @return this Dog's color
     */
    // ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
    String getColor() {
        return mColor;
    }

    /*
     * setColor
     * Sets the color of the Dog
     * @param color the new color of the Dog's coat, a String
     * @return nothing
     */
    // ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
    void setColor(String Color) {
        mColor = Color;
    }

    /*
     * feed
     * Side-effect: 1. The Dog gains weight, WEIGHT_GAIN
     * 				2. Every 3 meals, the Dog grows to a larger size, if possible
     *				i.e. "tiny" -> "small" -> "average" -> "large"
     * @return nothing
     */
    // ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
    void feed() {
        mWeight = mWeight + WEIGHT_GAIN;
        mFeedCount++;
        if (mFeedCount % 3 == 0) {
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

    /*
     * play
     * Side-effect: 1. The Dog loses weight
     *				2. Every 6 play invocations, the Dog shrinks to a smaller size, if possible
     *				i.e. "large" -> "average" -> "small" -> "tiny"
     * @return nothing
     */
    // ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
    void play() {
        mWeight = mWeight - WEIGHT_LOSS;
        mPlayCount++;

        if (mPlayCount % 6 == 0) {
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
    }

    /*
     * cutHair
     * Side-effect: the Dog's hair length is reduced
     * @return nothing
     */
    // ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
    void cutHair() {
        mHairLength = mHairLength - 1;
    }
}