package com.android.developer.www.stations;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.ProvidePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityChoiceStation extends MvpAppCompatActivity implements ViewChoiceStation {

    @InjectPresenter
    PresenterChoiceStation presenter;

    @ProvidePresenter
    PresenterChoiceStation providePresenter() {
        return new PresenterChoiceStation(new ModelChoiceStation());
    }

    @BindView(R.id.recycler_stations)RecyclerView recyclerView;
    @BindView(R.id.progress_bar) ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_station);
        ButterKnife.bind(this);
    }
}
