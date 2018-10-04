package com.example.yahia.my_movie_yarab_wafa;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yahia.my_movie_yarab_wafa.data.Result;

import java.util.List;

public class MovieFragment extends Fragment {

    List<Result> resultList;
    RecyclerView recyclerView;
    public void setDataList(List<Result> resultList){
        this.resultList=resultList;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);
         recyclerView = rootView.findViewById(R.id.recycle_view);

        return rootView;
    }
}
