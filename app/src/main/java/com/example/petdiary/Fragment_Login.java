package com.example.petdiary;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


public class Fragment_Login extends Fragment {

    private Activity activity;
    private EditText etName, etPassword;
    private Button btLogin, btSignUp;


//
//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//
//    private String mParam1;
//    private String mParam2;
//
//    public Fragment_Login() {
//        // Required empty public constructor
//    }
//
//    public static Fragment_Login newInstance(String param1, String param2) {
//        Fragment_Login fragment = new Fragment_Login();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        activity.setTitle(R.string.textLogin);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__login, container, false);
    }

    @Override
    public void  onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
        etName = view.findViewById(R.id.etName);
        etPassword = view.findViewById(R.id.etPassword);
        btLogin = view.findViewById(R.id.btLogin);
        btSignUp = view.findViewById(R.id.btSignUp);
        btSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Navigation.findNavController(view).navigate(R.id.action_fragment_Login_to_fragment_register);
            }
        });
        btLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view) {
                String name = etName.getText().toString();
                String password = etPassword.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("name", name);
                bundle.putString("password", password);
                Navigation.findNavController(view).navigate(R.id.action_fragment_Login_to_fragment_done, bundle);

            }



        }
       );
    }
}