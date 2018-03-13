package com.android.developer.www.stations;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class PresenterChoiceStation extends MvpPresenter<ViewChoiceStation> {

    private ModelChoiceStation model;

    public PresenterChoiceStation(ModelChoiceStation model) {
        this.model = model;
    }
}
