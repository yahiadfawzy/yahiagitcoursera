package com.example.yahia.my_movie_yarab_wafa.data;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class MovieData implements Parcelable {

    private long page;
    private long totalResults;
    private long totalPages;
    private ArrayList<Result> results = null;

    public final static Creator<MovieData> CREATOR = new Creator<MovieData>() {
        @SuppressWarnings({"unchecked"})
        public MovieData createFromParcel(Parcel in) {
            return new MovieData(in);
        }

        public MovieData[] newArray(int size) {
            return (new MovieData[size]);
        }
    };

    protected MovieData(Parcel in) {
        this.page = ((long) in.readValue((long.class.getClassLoader())));
        this.totalResults = ((long) in.readValue((long.class.getClassLoader())));
        this.totalPages = ((long) in.readValue((long.class.getClassLoader())));
        in.readList(this.results, (Result.class.getClassLoader()));
    }

    public MovieData(long page, long totalResults, long totalPages, ArrayList<Result> results) {
        super();
        this.page = page;
        this.totalResults = totalResults;
        this.totalPages = totalPages;
        this.results = results;
    }

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(long totalResults) {
        this.totalResults = totalResults;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public ArrayList<Result> getMovieList() {
        return results;
    }

    public void setMoieList(ArrayList<Result> results) {
        this.results = results;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(page);
        dest.writeValue(totalResults);
        dest.writeValue(totalPages);
        dest.writeList(results);
    }

    public int describeContents() {
        return 0;
    }

}