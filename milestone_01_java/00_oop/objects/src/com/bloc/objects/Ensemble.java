package com.bloc.objects;

class Ensemble extends Object {
    // Name
    String mName;

    // All of the artists in the group
    artist[] mArtists;

    /*
     * First Constructor
     * This constructor takes in a variable length of Artist objects
     * @param artists variable length artists //array
     */
    // CONSTRUCTOR CODE GOES HERE
    Ensemble(artist[] artists) {
        this.mArtists = artists;
    }

    /*
     * Second Constructor
     * This constructor takes a name and a variable length of Artist objects
     * Side-effect: if the 'name' parameter is null, uses the first and
     * 				last name of the first Artist
     * 			    {artist1("John", "Lennon"), artist2("Paul", "McCartney")…}
     * Hint:		You can add Strings together with a '+'… "John Lennon"
     * @param name the name of the group
     * @param artists variable length artists
     */
    // CONSTRUCTOR CODE GOES HERE
    Ensemble(String name, artist[] artists) {
        this(artist[0] + " " + artists[1]);

    }
}