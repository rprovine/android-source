package com.bloc.objects;

import com.sun.media.jfxmedia.track.SubtitleTrack;
import com.sun.org.apache.xpath.internal.operations.String;

class Song extends Object {
	// The ensemble which produced it
	Ensemble mEnsemble;
	// Title of the song
	String mTitle;
	// The year it was released
	int mYearReleased;

	/*
	 * Basic Constructor
	 * Side-effects: Assigns some default ensemble, title and
	 *				 and year of your choosing
	 */
	// CONSTRUCTOR CODE GOES HERE
    Song() {
        this("Ensemble", "Title", "Year")
    }
	/*
	 * Partial Constructor
	 * Side-effects: Sets the year of release to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 */
	// CONSTRUCTOR CODE GOES HERE
    Song(Ensemble mEnsemble, String mTitle, int mYearReleased) {
        @param mEnsemble = ensemble
        @param mTitle = title
        mYearReleased = 0
    }
	/*
	 * Full Constructor
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 */
	// CONSTRUCTOR CODE GOES HERE
     Song(Ensemble mEnsemble, String mTitle, int mYearReleased) {
         @param mEnsemble = ensemble
         @param mTitle = title
         mYearReleased = yearReleased
     }
}