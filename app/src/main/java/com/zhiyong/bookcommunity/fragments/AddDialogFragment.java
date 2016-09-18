package com.zhiyong.bookcommunity.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhiyong.bookcommunity.R;

/**
 * Created by zhiyong on 9/17/16.
 */
public class AddDialogFragment extends DialogFragment {

    public AddDialogFragment() {}

    public static AddDialogFragment newInstance(String title) {
        AddDialogFragment fragment = new AddDialogFragment();
        Bundle args = new Bundle();
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_add, container);
        getDialog().setTitle("Add a book");
        return v;
    }

}
