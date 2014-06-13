package com.bloc.objects;

class PopSong extends Song {
	// The number of weeks this song stayed on Billboard's top 100
	int mWeeksOnBillboard;

	/*
	 * Basic Constructor
	 * Side-effects: Assigns some default ensemble, title,
	 *				 year and weeks on billboard
	 */
	// CONSTRUCTOR CODE GOES HERE
    PopSong() {
        this("Ensemble", "Title", "Year", "Weeks")
    }
	/*
	 * Partial Constructor
	 * Side-effects: Sets the year of release to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 */
	// CONSTRUCTOR CODE GOES HERE
    PopSong(Ensemble mEnsemble, String mTitle, int mYearReleased) {
        @param mEnsemble = ensemble
        @param mTitle = title
        mYearReleased = 0

    }
	/*
	 * Full Song Constructor
	 * Side-effects: Sets the weeks on billboard to 0
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 */
	// CONSTRUCTOR CODE GOES HERE
    Song(Ensemble mEnsemble, String mTitle, int mWeeksonBillboard, int mYearReleased) {
        mYearReleased = 0
        @param mEnsemble = ensemble
        @param mTitle = title
        @param mYearReleased = yearReleased
    }
	/*
	 * Full PopSong Constructor
	 * @param ensemble the ensemble responsible
	 * @param title the song title
	 * @param yearReleased the year the song was released
	 * @param weeksOnBillboard number of weeks this song lasted on the
	 *		  				   Billboard's top 100
	 */
	// CONSTRUCTOR CODE GOES HERE
    PopSong(Ensemble mEnsemble, String mTitle, int mWeeksOnBillboard, int mYearReleased)
        @param mEnsemble = ensemble
        @param mTitle = title
        @param mYearReleased = yearReleased
        @param mWeeksOnBillboard = weeksOnBillboard
}