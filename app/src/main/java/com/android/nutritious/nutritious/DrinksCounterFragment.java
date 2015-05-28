package com.android.nutritious.nutritious;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


public class DrinksCounterFragment extends Fragment {

    private static final String[]  DRINKS_OPTIONS = {"100ml", "200ml", "300ml", "500ml"};
    private ArrayAdapter<String> mDrinksMenuAdapter;

    public DrinksCounterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_drinks_counter, container, false);
        ArrayList<String> drinksMenuOptions = new ArrayList<String>(Arrays.asList(DRINKS_OPTIONS));
        mDrinksMenuAdapter = new ArrayAdapter<String>(
                getActivity(), R.layout.fragment_list_item_drinks, R.id.drinksItem, drinksMenuOptions);
        ListView listView = (ListView) rootView.findViewById(R.id.list_mainMenu);
        listView.setAdapter(mDrinksMenuAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String menuOption = mDrinksMenuAdapter.getItem(position);
                switch (position){
                    case 0:{
//                        Intent intent = new Intent(getActivity(), FoodFinderActivity.class).putExtra(Intent.EXTRA_TEXT, menuOption);
//
//                        startActivity(intent);
                        Toast.makeText(getActivity(), String.valueOf(menuOption), Toast.LENGTH_SHORT).show();
                    }
                    break;
                    case 1:{
//                        Intent intent = new Intent(getActivity(), PersonalProfileActivity.class).putExtra(Intent.EXTRA_TEXT, menuOption);
//                        startActivity(intent);
                        Toast.makeText(getActivity(), String.valueOf(menuOption), Toast.LENGTH_SHORT).show();
                    }
                    break;
                    case 2:{
//                        Intent intent = new Intent(getActivity(), DrinksCounterActivity.class).putExtra(Intent.EXTRA_TEXT, menuOption);
//                        startActivity(intent);
                        Toast.makeText(getActivity(), String.valueOf(menuOption), Toast.LENGTH_SHORT).show();
                    }
                    break;
                    default:{
//                        Intent intent = new Intent(getActivity(), StatisticsActivity.class).putExtra(Intent.EXTRA_TEXT, menuOption);
//                        startActivity(intent);
                        Toast.makeText(getActivity(), String.valueOf(menuOption), Toast.LENGTH_SHORT).show();
                    }

                    break;
                }
            }
        });
        return rootView;
    }


}
