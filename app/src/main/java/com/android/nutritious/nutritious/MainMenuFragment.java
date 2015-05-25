package com.android.nutritious.nutritious;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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
        View rootView = inflater.inflate(R.layout.fragment_main_menu, container, false);
        ArrayList<String> menuOptions = new ArrayList<String>(Arrays.asList(MENU_OPTIONS));
        mMainMenuAdapter = new ArrayAdapter<String>(
                getActivity(), R.layout.fragment_list_item_mainmenu, R.id.list_item_mainMenu, menuOptions);
        ListView listView = (ListView) rootView.findViewById(R.id.list_mainMenu);
        listView.setAdapter(mMainMenuAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String menuOption = mMainMenuAdapter.getItem(position);
                switch (position){
                    case 0:{
                        Intent intent = new Intent(getActivity(), FoodFinderActivity.class).putExtra(Intent.EXTRA_TEXT, menuOption);
                        startActivity(intent);
                    }
                        break;
                    case 1:{
                        Intent intent = new Intent(getActivity(), PersonalProfileActivity.class).putExtra(Intent.EXTRA_TEXT, menuOption);
                        startActivity(intent);
                    }
                        break;
                    case 2:{
                        Intent intent = new Intent(getActivity(), DrinksCounterActivity.class).putExtra(Intent.EXTRA_TEXT, menuOption);
                        startActivity(intent);
                    }
                        break;
                    default:{
                        Intent intent = new Intent(getActivity(), StatisticsActivity.class).putExtra(Intent.EXTRA_TEXT, menuOption);
                        startActivity(intent);
                    }

                        break;
                }
            }
        });
        return rootView;
    }


}
