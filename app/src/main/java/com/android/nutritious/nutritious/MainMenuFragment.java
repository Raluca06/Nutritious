package com.android.nutritious.nutritious;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


public class MainMenuFragment extends Fragment {

    private static final String[] MENU_OPTIONS = {"Food Finder", "Personal Profile", "Drinks Counter", "Statistics"};
    private ArrayAdapter<String> mMainMenuAdapter;

    public MainMenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mainmenu, container, false);
        ArrayList<String> menuOptions = new ArrayList<String>(Arrays.asList(MENU_OPTIONS));
        mMainMenuAdapter = new ArrayAdapter<String>(
                getActivity(), R.layout.fragment_list_item_mainmenu, R.id.list_item_mainMenu, menuOptions);
        ListView listView = (ListView) rootView.findViewById(R.id.list_mainMenu);
        listView.setAdapter(mMainMenuAdapter);
        return rootView;
    }


}
