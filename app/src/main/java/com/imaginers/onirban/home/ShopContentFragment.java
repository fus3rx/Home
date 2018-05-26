package com.imaginers.onirban.home;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// all the shop will be listed here

/**
 * A simple {@link Fragment} subclass.
 */
public class ShopContentFragment extends Fragment {


    public ShopContentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shop_content, container, false);
    }

}
