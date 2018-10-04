package com.example.yahia.my_movie_yarab_wafa.data;
import android.os.Parcel;
import android.os.Parcelable;

public class Result implements Parcelable {
    private boolean video;
    private double vote_average;
    private String poster_path;
    private String original_language;
    private String original_title;
    private String backdrop_path;
    private String overview;
    private String release_date;

    public final static Creator<Result> CREATOR = new Creator<Result>() {
        @SuppressWarnings({"unchecked"})
        public Result createFromParcel(Parcel in) {
            return new Result(in);
        }

        public Result[] newArray(int size) {
            return (new Result[size]);
        }
    };

    protected Result(Parcel in) {
        this.video = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.vote_average = ((double) in.readValue((double.class.getClassLoader())));
        this.poster_path = ((String) in.readValue((String.class.getClassLoader())));
        this.original_language = ((String) in.readValue((String.class.getClassLoader())));
        this.original_title = ((String) in.readValue((String.class.getClassLoader())));
        this.backdrop_path = ((String) in.readValue((String.class.getClassLoader())));
        this.overview = ((String) in.readValue((String.class.getClassLoader())));
        this.release_date = ((String) in.readValue((String.class.getClassLoader())));
    }


    public Result(boolean video, double voteAverage, String posterPath, String original_language, String originalTitle, String backdropPath, String overview, String releaseDate) {
        super();
        this.vote_average = voteAverage;
        this.original_language = original_language;
        this.original_title = originalTitle;
        this.backdrop_path = backdropPath;
        this.overview = overview;
        this.release_date = releaseDate;
        this.video=video;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginalTitle() {
        return original_title;
    }

    public void setOriginalTitle(String originalTitle) {
        this.original_title = originalTitle;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(video);
        dest.writeValue(vote_average);
        dest.writeValue(poster_path);
        dest.writeValue(original_language);
        dest.writeValue(original_title);
        dest.writeValue(backdrop_path);
        dest.writeValue(overview);
        dest.writeValue(release_date);
    }

    public int describeContents() {
        return 0;
    }
}


