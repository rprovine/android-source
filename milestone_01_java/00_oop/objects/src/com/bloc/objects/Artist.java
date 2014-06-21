package com.bloc.objects;

import com.sun.org.apache.xpath.internal.operations.String;

class Artist extends Object {
    // The artist's first name
    String mFirstName;
    // The artist's last name
    String mLastName;

    /*
     * Only Constructor
     * @param firstName
     * @param lastName
     */
    // CONSTRUCTOR CODE GOES HERE
    Artist(String firstName, String lastName) {
        this.mFirstName = firstName;
        this.mLastName = lastName;

    }
}