package com.example.petdiary;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


public class Fragment_done extends Fragment {

    private Activity activity;
    private TextView tvResult;
    private Button btGoNext;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();
//
//        button = (Button) findViewById(R.id.button);
//        tvResult.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openFragment_Menu();
//            }
//        });
    }
//    public  void openFragment_Menu(){
//        Intent intent = new Intent(this, Fragment_Menu.class);
//        startActivity(intent);
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        activity.setTitle(R.string.tvResult);
        return inflater.inflate(R.layout.fragment_done,container,false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvResult = view.findViewById(R.id.tvResult);
        Bundle bundle = getArguments();
        if (bundle !=null) {
            String name = bundle.getString("name");
            String password = bundle.getString("password");
            String text = "name:" + name + "\npassword:" + password;
            tvResult.setText(text);
        }
        btGoNext =view.findViewById(R.id.btGoNext);
        btGoNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_fragment_done_to_fragment_Menu);
            }
        });

    }


    //    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public Fragment_done() {
//        // Required empty public constructor
//    }



//    public static Fragment_done newInstance(String param1, String param2) {
//        Fragment_done fragment = new Fragment_done();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_done, container, false);
//    }
}