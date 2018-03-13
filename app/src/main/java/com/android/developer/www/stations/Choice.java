package com.android.developer.www.stations;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Choice extends Fragment {

    @BindView(R.id.tv_from_choice_layout) TextView tv_from;
    @BindView(R.id.tv_where_choice_layout) TextView tv_where;
    @BindView(R.id.tv_when_choice_layout) TextView tv_when;

    @OnClick(R.id.btn_from_choice_layout)
    public void onFrom() {

    }

    @OnClick(R.id.btn_where_choice_layout)
    public void onWhere() {

    }

    @OnClick(R.id.btn_when_choice_layout)
    public void onWhen() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.choice_layout, container, false);
        ButterKnife.bind(this, v);
        return v;
    }
}
